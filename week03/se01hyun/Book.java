package practice.LibrarySystem;

public class Book {
    private String title;
    private String author;
    /*
    private 키워드: 클래스 내부에서만 사용할 수 있도록 제한하는 키워드
    - private가 붙은 변수나 메서드는 '이 클래스 안에서만 사용할 수 있다'라는 의미
    - 외부에서는 직접 접근하거나 수정할 수 없다.
    - ex) 은행 계좌의 비밀번호. 은행 시스템 내부에서는 비밀번호를 관리할 수 있지만,
      외부(고객)에서는 직접 비밀번호를 변경할 수 없도록 보호해야 한다,
    - 대신 gettr와 setter 메서드를 만들어 값을 설정하거나 가져올 수 있다.
     */

    public Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
        /*
        '책 객체를 만들 때, 제목과 저자를 설정할 수 있도록 하는 생성자(Constructor)'
        Book 객체가 생성될 때, bookTitle과 bookAuthor 값을 받아서 title과 author 변수에 저장
        ex) new Book("자바의 정석", "남궁성")
        → 새로운 Book 객체를 만들면서 제목을 "자바의 정석", 저자를 "남궁성"으로 설정
         */
    }
    public String getBookInfo() {
        return title + " - " + author;
        /*
        '책 정보를 가져오는 메서드'
        getBookInfo()를 호출하면 책의 제목과 저자를 문자열로 반환한다.
        즉, "자바의 정석 - 남궁석"과 같은 형식으로 책 정보를 가져올 수 있다.
         */
    }
}
 /*
1. title과 author 변수를 이용해 책 정보를 저장하고
2. 생성자(Book(...))를 이용해 책의 제목과 저자를 설정하고
3. getBookInfo() 메서드를 이용해 책 정보를 반환
 */