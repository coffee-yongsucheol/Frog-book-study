
결합도 : 클래스 간의 상호 의존 정도 , 결합도가 낮으면 객체 재사용에 용이
응집도 : 하나의 클래스 내부에 존재하는 기능적 관련성, 하나의 책임에 집중 하여 재사용에 용이

SOLID는 응집도를 높이고, 결합도는 낮추는 원칙을 재정립 한 것

### SRP (단일 책임 원칙)
Single Responsibility Principle

어떤 클래스를 변경해야 하는 이유는 오직 하나뿐이어야 한다.
### OCP (개방 폐쇄 원칙)
Open Closed Principle

소프트웨어 엔티티(클래스, 모듈, 함수 등)는 확장에 대해서는 열려 있어야 하지만 변경에 대해서는 닫혀 있어야 한다

### LSP (리스코프 치환 원칙)
Liskov Substitution Principle

서브 타입은 언제나 자신의 기반 타입(base type)으로 교체할 수 있어야 한다.

### ISP (인터페이스 분리 원칙)
Interface Segregation Principle

클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안된다.

### DIP (의존 역전 원칙)
Dependency Inversion Principle

고차원 모듈은 저차원 모듈에 의존하면 안된다.
이 두 모듈 모두 다른 추상화된 것에 의존해야 한다.
추상화된 것은 구체적인 것에 의존하면 안된다.
구체적인 것이 추상화된 것에 의존해야 한다.
자주 변경되는 클래스에 의존하지 말라.
-> 자신보다 변하기 쉬운 것에 의존하지 마라.

### 예제

![image](https://github.com/user-attachments/assets/7dedb9d3-6d35-463c-9bcc-71a45b54bac9)

![image](https://github.com/user-attachments/assets/364386bb-8add-416f-9866-8a2f0ac950a2)


사실 어떻게보면 인터페이스 분리 잡아주면서 상위 클래스를 추상화하여 구조를 잡으면

왠만한 solid의 원칙을 자연스레 지켜지게 된다.

코드를 통해서도 검증가능하고, 직접 실습해보아야한다.



### 정리

관심사의 분리(Separation Of Concern): <br/>

관심이 같은 것 끼리는 하나의 객체 안으로 또는 친한 객체로 모으고, <br/>
관심이 다른 것은 가능한 한 따로 떨어져 서로 영향을 주지 않도록 분리하라는 것이다. <br/>

