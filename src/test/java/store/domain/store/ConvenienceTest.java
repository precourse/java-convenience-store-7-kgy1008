package store.domain.store;

class ConvenienceTest {

    private final Convenience convenience = new Convenience();

    /*
    @Test
    @DisplayName("프로모션 적용이 가능한 상품에 대해 고객이 해당 수량보다 적게 가져온 상황 테스트")
    void checkAdditionalPromotionBenefit() {
        // given
        ShoppingProduct shoppingProduct = new ShoppingProduct("초코바", 1200);
        boolean expected = true;

        // when & then
        assertThat(convenience.canReceiveAdditionalBenefit(shoppingProduct)).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("프로모션 혜택 없이 결제해야 하는 경우, 정가로 결제할 수량 개수 테스트")
    @CsvSource({
            "컵라면, 2, 2",
            "콜라, 10, 1",
            "콜라, 11, 2",
            "콜라, 12, 3"
    })
    void checkCountOfProductWithoutPromotion(final String productName, final int productCount, final int expected) {
        // given
        ShoppingProduct shoppingProduct = new ShoppingProduct(productName, productCount);

        // when & then
        assertThat(convenience.calculateItemCountWithoutPromotion(shoppingProduct)).isEqualTo(expected);
    }

     */
}
