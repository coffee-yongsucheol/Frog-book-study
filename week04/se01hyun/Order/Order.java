package practice.Order;

public class Order {
    public static void main(String[] args) {

        // 객체 생성: Customer 클래스의 인스턴스를 생성
        Customer customer = new Customer("허서현");

        // 메서드 호출: orderFood() 메서드를 실행하여 음식 주문
        customer.orderFood("피자");

    }
}
/*
◎ 인스턴스(Instance): 클래스를 기반으로 생성된 실제 객체
ex) 클래스 - 설계도, 인스턴스 - 그 설계도를 바탕으로 만들어진 실체
'자동차'라는 클래스를 만든다고 하면, 자동차의 속성과 동작을 정의하는 설계도가 클래스.
즉, 자동차 설계도(클래스)를 바탕으로 만들어진 실제 자동차(인스턴스)가 바로 인스턴스
 */
