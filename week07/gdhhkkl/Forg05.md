OOD : 객체 지향 원칙을 사용하여 소프트웨어를 구조화하는데 중점을 둔 계획단계. (기초를 마련)
OOP : java,kotlin,swift와 같은 프로그래밍 언어를 사용하여 OOD디자인을 실제 코드로 변환하는 구현 단            계(구축한다.)
결합도와 응집도는 소프트웨어 설계의 아주 핵심적인 원리이다. solid의 배경 개념중 하나다이다. 
결합도와 응집도에 관한 실천적 가이드라인 
solid 는 oop에서 유지보수성 좋고, 확장성 좋은 코드를 만들기 위해 5가지 원칙 
### Single Responsibility Principle
 어떤 클래스를 변경해야 하는 이유는 오직 하나뿐이어야 한다. 
 책임을 분리한는것 - 단일 책임 원칙
 소변보다() 메서드는 각각의 변수들이 필요하는것이니 클래스로 분활하고  강아지라는것을 추상클래스로 둬서 상속받게끔 하는것이 단일 책임 원칙을 진킨것이다. 그래서 모델링과정을 담당하는것이 추상화라는것 이게 단일 책임 원칙이 지켜지단는것
중복

### Open Closed Principle
소프트웨어 엔티티(클래스,모듈,함수 등)는 확장에 대해서는 열려 있어야하지만 변경에 대해서는 닫혀 있어야한다.

자신의 확장에는 열려있고 주변의 변화에 대해서는 닫혀 있어야 한다.

유연성,제사용성,유지보수성

기존의 코드를 변경하지 않으면서, 기능을 추가할 수 있도록 설계되어야 한다는 원친
확장에 대해서는 개방적이되 수정에 대해서는 폐쇄적이어야 한다는 말이다. -->추상화
![스크린샷 2025-04-07 132454](https://github.com/user-attachments/assets/3afaca74-96fb-4675-b508-7798108055b5)

'추상화란 다른 모든 종류의 객체로부터 식별될 수 있는 객체의 본질적인 특징'

 추상 메서드 설계에서 적당한 추상화 레벨을 선택함으로써, 어떠한 행위에 대한 본질적인 정의를 서브 클래스에 전파함으로써 관계를 성립되게 하는 것이다.

동물 클래스에 타입에맞게 인사 클래스에서 인사말을 해주는데 이걸 메인에서 객체를 생성해서 고양이 강아지 객체를 만들었지만 양이라는 새로운 객체와 그에 맞는 울음소리를 내려고하니 인사클래스를 변경해줘야 하는 일이 발생 이를 해결하기 위해 동물클래스를 추상클래스로 두고 고양이 강아지를 클래스화 시켜 메인에서 돌아가게 하면 OCP원칙 성공

Q개방패쇄원칙이 적용되서면 자연스럽게 LSP가 된건가?

### Liskov Substitution Principle
서브타입은 언제나 자신의 기반 타입으로 교체할 수 있어야한다.
**-하위클래스는 상위분류위 한 종류이다.**
	아버지 춘향이 = new 딸();------>동물 뽀로로 = new 팽귄();
	"하위 클래스의 인스턴스는 상위형 객체 참조 변수에 대입해 상위 클래스의 인스턴스 역할을 하는 데 문제가 없어야한다. "
	업캐스팅(형변환): 하위 클래스 인스턴스를 상위 클래스 타입으로 참조
	업캐스팅 왜 하냐? 다형성을 위해서이다.
	업캐스팅은 지금이 나리ㅏ 나중을 위한 설계다..? 단순하지 않은 코드에서는 업캐스팅이 좋다...........
	업캐스팅한 객체를 다시 자식 클래스 타입으로 되돌리는 다운 캐스팅(down casting)
Q 왜 구지 업캐스팅 하는데.....


**-구현분류는 인터페이스 할 수 있어야한다.** 

### Interface Segregation Principle
클라이언트 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안되다.
 단일 책임 원칙에서 분리를 시키지 않고 인퍼테이스 분리 원칙을 쓰면 행동을 인터페이스로 둬서 각 클래스에 맞제 하는것
 특별한 경우가 아니라면 단일 책임 원칙을 적용하는 것이 더 좋은 해결책이라고 생각한다.
 최소주의 원칙: 외부에 제공할 때는 최소한의 메서드만 제공하는라는것 
SCP는 **모든 객체지향 설계의 출발점**이고,  
ISP는 **특정 설계 상황에서 엄청 유용한 고급 원칙**.
### Dependency Inversion Priciple
자신보다 변하기 쉬운 것에 의존하지 마라


SOLID원칙을 적용함으로써 논리를 더욱 잘 분할 하고, 잘 표현하기에 이해하기 쉽고, 개발 하기 쉬우며, 유지와 관리, 보수하기 쉬운 소스가 만들어진다. 

현실 세계를 모델링(추상화)한것
