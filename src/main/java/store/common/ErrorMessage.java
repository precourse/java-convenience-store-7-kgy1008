package store.common;

public enum ErrorMessage {
    // File read exception
    CAN_NOT_READ("파일을 읽을 수 없습니다."),
    INVALID_FILE_DATA("숫자로 변환할 수 없는 값입니다."),

    // App exception
    INVALID_FORMAT("올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요."),
    NOT_FOUND("존재하지 않는 상품입니다. 다시 입력해 주세요."),
    EXCEED_QUANTITY("재고 수량을 초과하여 구매할 수 없습니다. 다시 입력해 주세요."),
    INVALID_INPUT("잘못된 입력입니다. 다시 입력해 주세요."),
    CONFLICT_EXCEPTION("같은 상품이 중복으로 입력되었습니다. 다시 입력해 주세요."),
    UNAUTHORIZED_EXCEPTION("멤버십 회원이 아닙니다. 할인을 적용할 수 없습니다."),
    INVALID_RANGE("상품의 최소 개수는 0개 입니다.");

    private static final String HEADER = "[ERROR] ";
    private final String message;

    ErrorMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return HEADER + message;
    }
}
