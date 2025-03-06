package practice.LibrarySystem;

public class Librarian {
    /*
    사서 역할의 클래스
    회원에게 책을 대출해 주는 기능 lendBook()을 가지고 있다.
     */
    public void lendBook(Member member, Book book) {
        /*
        책을 빌려주는 기능을 하는 메서드 생성
        매개변수란? 메서드가 실행될 때 필요한 정보를 제공하는 것
        - lendBook() 메서드는 회원(Member)과 책(Book)이 필요하다.
        - 그래서 member와 book 두 개의 매개변수를 받는 것
        Member member → "책을 빌릴 회원"
        Book book → "빌려줄 책"
         */
        member.borrowBook(book);
        // 회원이 책을 빌리도록 회원(Member) 클래스의 borrowBook() 메서드를 실행
        System.out.println("📚 " + book.getBookInfo() + " 책을 " + member.getName() + " 님에게 대출해 줬습니다.");
        /*
        book.getBookInfo → 책 정보(제목과 저자) 반환
        member.checkBorrowedBook() → "허서현 님이 빌린 책: 자바의 정석 - 남궁순" 출력
         */
    }
}
/*
 사서는 lendBook() 메서드를 통해 회원에게 책을 빌려준다.
 회원은 borrowBook()을 통해 책을 저장
 checkBoorowedBook()을 사용해 빌린 책을 확인
*/