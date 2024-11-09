# 편의점

## 기능 구현 목록

### 구매자 👥

- [x] 구입하고자 하는 상품의 가격과 수량을 입력한다.
    - [x] 상품명, 수량은 하이픈(-)으로, 개별 상품은 대괄호([])로 묶어 쉼표(,)로 구분한다.
    - [x] 같은 상품을 중복으로 입력하면, 예외를 발생시킨다.
    - [x] 수량이 0개 이하로 들어오면, 예외를 발생시킨다.
- [x] 멤버십 할인 적용 여부를 입력한다.
- [x] 추가 구매 여부를 입력받는다.
- [x] 프로모션 적용이 가능한 상품에 대해 해당 수량만큼 가져오지 않았을 경우, 상품 추가 여부를 입력한다.
- [x] 프로모션 혜택 없이 결제해야 하는 경우, 일부 수량에 대해 정가로 결제할 지 여부를 입력한다.
- [x] 구매한 내역들에 대한 영수증을 확인한다.
- [x] 잘못된 값을 입력했을 경우, 그 부분부터 다시 입력한다.

### 편의점 📟

- [x] 환영 인사와 함께 현재 물품 재고 현황을 출력한다.
    - [x] 상품명, 가격, 재고, 프로모션 이름 순서로 출력한다.
    - [x] 재고가 0개라면 '재고 없음'을 출력한다.
- [x] 입력값으로 들어온 값이 현재 재고를 넘어서는지 검증한다.
- [x] 입력값으로 들어온 물품이 존재하는 물품인지 검증한다.
- [x] 결제가 끝나면 편의점의 상품 재고를 업데이트한다.
- [x] 프로모션이 적용 가능한 상품에 대해 고객이 해당 수량만큼 가져오지 않았을 경우, 혜택에 대한 안내 메세지를 출력한다.
- [x] 프로모션 재고가 부족하여 일부 수량을 프로모션 혜택 없이 결제해야 하는 경우, 일부 수량에 대해 정가로 결제할지 여부에 대한 안내 메세지를 출력한다.
- [x] 멤버십 할인 적용 여부를 확인하기 위해 안내 문구를 출력한다.
    - [x] 멤버십 회원이 아닌 경우, 예외 발생
- [ ] 영수증을 출력한다.
    1. 구매 상품 내역 : 구매한 상품명, 수량, 가격
    2. 증정 상품 내역: 프로모션에 따라 무료로 제공된 증정 상품의 목록
    3. 금액 정보
        - 총 구매액 : 구매한 상품의 총 수량과 총 금액
        - 행사할인 : 프로모션에 의해 할인된 금액
        - 멤버십할인 : 멤버십에 의해 추가로 할인된 금액
        - 내실돈 : 최종 결제 금액
- [x] 추가 구매 여부를 확인하기 위한 안내 문구를 출력한다.
- [x] 사용자가 잘못된 값을 입력했을 때, `IllegalArgumentException`을 발생시키고, `[ERROR]`로 시작하는 오류 메세지와 함께 상황에 맞는 안내를 출력한다.
    1. 구매할 상품과 수량 형식이 올바르지 않은 경우: [ERROR] 올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요.
    2. 존재하지 않는 상품을 입력한 경우: [ERROR] 존재하지 않는 상품입니다. 다시 입력해 주세요.
    3. 구매 수량이 재고 수량을 초과한 경우: [ERROR] 재고 수량을 초과하여 구매할 수 없습니다. 다시 입력해 주세요.
    4. 기타 잘못된 입력의 경우: [ERROR] 잘못된 입력입니다. 다시 입력해 주세요.

### 계산기 🧮

- [x] 입력된 상품의 가격과 수량을 기반으로 총 구매액을 결제한다.
- [x] 프로모션 및 멤버십 할인 정책을 기반으로 최종 결제 금액을 산출한다.
    1. 멤버십 할인 정책
        - [x] 멤버십 회원은 프로모션 미적용 금액의 30%를 할인 받는다.
        - [x] 멤버십 할인의 최대 한도는 8000원이다.
        - [x] 프로모션 적용 후 남은 금액에 대해 멤버십 할인을 적용한다.
    2. 프로모션 정책
        - [x] 프로모션은 N개 구매 시 1개 무료 증정 형태로 진행된다.
        - [x] 프로모션 혜택은 프로모션 재고 내에서만 적용할 수 있다.
            - [x] 프로모션 재고가 부족하여 일부 수량을 프로모션 혜택 없이 결제해야 하는 경우, 그 수량에 대해 정가로 결제한다.



