package practice.Movie;

public class Movie {

    /*
    인스턴스 변수 title:
    - Movie 객체(영화)의 제목을 저장하는 변수
     */
    private String title; // 영화 제목 저장

    /*
    생성자 Movie(String title):
    - 객체가 생성될 때 자동으로 호출되는 메서드
    - 매개변수로 받은 title 값을 인스턴스 변수 title에 저장하여 영화에 제목을 부여
     */
    public Movie(String title) {
        this.title = title;
    }

    /*
    메서드 reserveTicket(String customer):
    - 매개변수 customer(고객 이름)를 받아 영화 예약 내용을 출력
     */
    public void reserveTicket(String customer) {
        System.out.println(customer + " 님이 '" + title + "' 영화를 예약했습니다! 🍿");
    }
}

