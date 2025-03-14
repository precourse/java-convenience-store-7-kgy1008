package store.domain.store.item;

import static store.common.ErrorMessage.INVALID_RANGE;

import store.common.exception.AppException;

public class BasicItem implements Item {

    private static final String NO_PROMOTION = "";
    private static final int EMPTY_STOCK = 0;

    private final String name;
    private final int price;
    private final String promotionName;
    private int quantity;

    public BasicItem(final String name, final int price, final int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.promotionName = NO_PROMOTION;
        validateQuantity();
    }

    private void validateQuantity() {
        if (quantity < EMPTY_STOCK) {
            throw new AppException(INVALID_RANGE.getMessage());
        }
    }

    @Override
    public void decreaseQuantity(final int count) {
        quantity -= count;
        validateQuantity();
    }

    @Override
    public void increaseQuantity(final int count) {
        quantity += count;
    }

    @Override
    public boolean isEqual(final String name) {
        return this.name.equals(name);
    }

    @Override
    public boolean isPromotionItem() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getPromotionName() {
        return promotionName;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
