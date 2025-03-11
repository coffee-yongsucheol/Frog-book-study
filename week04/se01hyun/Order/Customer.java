package practice.Order;

public class Customer {

    /*
    인스턴스 변수 name:
    - Customer 객체(고객)의 이름을 저장하는 변수
    - 각 객체마다 개별적으로 관리됨
     */
    private String name; // 고객의 이름을 저장하는 인스턴스 변수


    /*
    생성자 Customer(String name):
    - 객체가 생성될 떄 자동으로 호출되는 메서드
    - 매개변수로 받은 name 값을 인스턴스 변수 name에 저장하여 객체에 이름을 부여
     */
    public Customer(String name) {
        this.name = name;
        // 생성자의 매개변수(String name) name 값을 인스턴스 변수(private String name) name에 저장
    }

    /*
     메서드 orderFood(String food):
     - 매개변수 food(음식 이름)를 받아 주문 내용을 출력
     */
    public void orderFood(String food) {
        System.out.println(name + " 님이 " + food + "를 주문했습니다! 🍽️");
    }
}
/*
클래스: 설계도, 객체를 만들기 위한 템플릿
인스턴스: 클래스를 바탕으로 실제로 만들어진 객체
객체: 클래스의 설계대로 만들어진 실체로, 인스턴스라고도 부름
 */