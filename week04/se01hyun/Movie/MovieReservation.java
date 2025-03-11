package practice.Movie;

public class MovieReservation {

    public static void main(String[] args) {

        // 객체 생성: Movie 클래스의 인스턴스를 생성
        Movie movie1 = new Movie("미키17");

        // 메서드 호출: reserveTicket() 메서드를 실행하여 영화 예약
        movie1.reserveTicket("허서현");
    }
}

