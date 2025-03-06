package practice.LibrarySystem;

public class Member {
    /*
    도서관 회원 정보를 관리하는 역할의 클래스
    회원은 책을 빌릴 수 있고, 자신이 빌린 책을 확인할 수 있다.
     */
    private String name;
    // 회원의 이름을 저장하는 변수
    private Book borrowedBook;
    /*
    borrowedBook 변수: 회원이 빌린 책을 저장
    Book 클래스 타입의 변수기 때문에 Book 객체(책 정보)를 저장할 수 있다.
    만약 회원이 책을 빌리지 않았다면, borrowedBook은 null 상태
     */


    public Member(String memberName) {
        name = memberName;
        /*
        생성자 (회원 이름 설정)
        - 생성자는 new Member("허서현") 이런 식으로 객체를 만들 때 회원의 이름을 설정하는 역할
        - memberName에 입력된 값을 클래스 내부의 name 변수에 저장
         */
    }

    public void borrowBook(Book book) {
        borrowedBook = book;
        /*
        책을 빌리는 메서드 borrowBook()
        - 회원이 책을 빌릴 때 호출하는 메서드
        - Book 객체를 매개변수로 받아 borrowedBook 변수에 저장
        - 즉, 어떤 책을 빌렸는지 기록하는 역할
         */
    }

    public String checkBorrowedBook() {
        // 회원이 빌린 책이 있는지 확인하는 역할의 메서드
        if (borrowedBook != null) { // borrowedBook이 null이 아니면(= 책을 빌린 상태라면)
            return name + " 님이 빌린 책: " + borrowedBook.getBookInfo();
            // name과 borrowedBook.getBookInfo() (책 정보)를 합쳐 문자열로 반환
            // borrowedBook.getBookInfo(): 책 정보(제목과 저자)를 반환하는 Book 클래스의 메서드
        } else {
            return name + " 님은 빌린 책이 없습니다.";
            // 만약 borrowedBook이 null이면(= 빌린 책이 없으면) " 님은 빌린 책이 없습니다."라고 반환
        }
    }
    public String getName() {
        return name;
    }
}
/*
회원(Member) 객체를 만들면 이름을 설정할 수 있고, borrowBook() 메서드로 책을 대출받습니다.
checkBorrowedBook()을 호출하면 회원이 현재 빌린 책 정보를 확인할 수 있습니다.
 */