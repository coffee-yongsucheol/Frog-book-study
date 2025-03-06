package practice.LibrarySystem;

public class LibrarySystem { // 메인 클래스
    public static void main(String[] args) {
        // 사서 객체 생성
        Librarian librarian = new Librarian();
        /*
        1. 도서관 시스템(LibrarySystem) 안에 사서(Librarian)가 필요하다.
        - 도서관이 정상적으로 운영되려면 사서가 있어야 된다.
        - 그래서 LibrarySystem 클래스 안에 사서 객체를 만들어야 한다.
        - 클래스는 어떤 객체가 가져야 할 속성(변수)과 행동(메서드)을 정의하는 틀
        2. new Librarian(); → 새로운 사서를 만든다.
        - new 키워드: 새로운 객체 생성
        - new Librarian();는 새로운 Librarian 객체(사서)를 생성하는 코드
        - 즉, '새로운 사서를 만든다!'
        - 이렇게만 사용하면 이 객체를 사용할 수 없어, 변수에 저장해야 한다.
        3. Librarian librarian = new Librarian(); → 만든 사서를 변수에 저장한다!
        - Librarian librarian; → "사서를 저장할 공간(변수)을 만든다!"
        - new Librarian(); → "새로운 사서를 만들어서 변수에 넣는다!"

        ➡ "LibrarySystem 클래스 안에서 새로운 Librarian(사서)을 하나 만든다!"
        ➡ "사서를 librarian 변수에 저장해서 나중에 사용한다!"
         */

        // 책 객체 생성
        Book book = new Book("객체 지향의 원리와 이해", "김종민");

        // 회원 객체 생성
        Member member = new Member("허서현");

        // 사서가 회원에게 책을 빌려준다.
        librarian.lendBook(member, book);

        // 회원이 빌린 책을 확인
        System.out.println(member.checkBorrowedBook());

    }
}
