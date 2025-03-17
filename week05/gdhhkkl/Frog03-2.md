### **상속과 인터페이스**

**상소관계**: 하위클래스는 상위클랫의 한 부류  |  **인터페이스**:구현클래스는 인터페이스할수있다. 

즉, 클래스는 특성(속성과 메서드)을 상속해주고, 인터페이스는 클래스가 '무엇을 할 수 있다.' 라고 하는 기능을 구현하도록 강제 하게된다. 

### 클래스는  풍성하게  인터페이스는 빈곤하게
긴 세월과 수많은 시행착오를 거치며 5가지 원칙이 정리되다. 

객체지향 설계 5원칙 **SOLID(SRP,OCP,LSP,ISP,DIP)**

![[Pasted image 20250317131618.png]]

LSP:**서브 타입은 언제나 기반 타입으로 교체**할 수 있어야 한다는 것을 뜻한다.
서브타입....?(다형성?)

**부모클래스 변수명 = new 자식클래스();**(업캐스팅)
    자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행이 보장되어야 한다는 의미이다.
    업캐스팅이 정상작동되어야한다. (다형성)



ISP: 클라이언트는 자신이 사용하지 않는 메소드에 의존 관계를 맺으면 안된다. 




형변환 연산 명시적 형변환 연산과 암묵적 형변환에대해 

### 오버로딩?오버라이딩?
오버로딩: 중복의 정의 : 같은 메서드명 다른 인자 리스트->다형성에 대한 사용 편의성
public int add(int a, int b) {
        return a + b;
    }

public int add(int a, int b, int c) {
        return a + b + c;
    }

오버라이딩: 재정의: 같은 메서드와 메서드 명,같은 인자 리스트
public void setWidth(int width){  
    this.width = width;  
}

@Override  
public void setWidth(int width){  
    this.width = width;  
    this.height= width;  
    System.out.println("정사각형 넓이"+width);  
}
### 캡술화
객체 멤버의 접근 제어자
private,defalut, protected, public
![[Pasted image 20250317144342.png]]
