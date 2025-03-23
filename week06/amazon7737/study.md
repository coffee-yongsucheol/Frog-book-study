# 04. 자바가 확장한 객체 지향

### abstract 키워드 - 추상 메서드와 추상 클래스

추상 메서드는 구현을 하지 않는다. 선언만 메서드이다.

```java
public class Driver {
  public static void main(String[] args) {
    동물[] 동물들 = new 동물[5];

    동물들[0] = new 쥐();
    동물들[1] = new 고양이();
    동물들[2] = new 강아지();
    동물들[3] = new 송아지();
    동물들[4] = new 병아리();

    for (int i=0; i < 동물들.length; i++) {
      동물들[i].울어보세요();
    }
  }
}
```



```java
public class 동물 {
  void 울어보세요() {
    System.out.println("나는 동물! 어떻게 울어야 하나요?");
  }
}
```

위 예제는 상위 클래스 울어보세요()는 반드시 존재해야하는 메서드이다.

구현 후 하위 클래스 울어보세요()를 호출가능하도록 한다.

```java
public class 고양이 extends 동물 {
  void 울어보세요() {
    System.out.println("나는 고양이! 야옹! 야옹!");
  }
}
```

##### 아래와 같은 조건을 고려하고 있을떄

동물 객체는 어떻게 울어야 할까?
실수로 동물객체를 만들면 어떻할까?

추상클래스는 객체를 생성할 수 없는 클래스이다.

하위 클래스인 울어보세요() 를 오버라이딩 하지 않으면 컴파일 에러가 발생한다.
이럴때 추상클래스를 활용하기 좋다.


#### 추상클래스, 추상 메서드에 대한 내용을 정리

- 추상 클래스는 인스턴스, 즉 객체를 만들 수 없다. 즉, new를 사용할 수 없다.
- 추상 메서드는 하위 클래스에게 메서드의 구현을 강제한다. 오버라이딩 강제.
- 추상 메서드를 포함하는 클래스는 반드시 추상 클래스여야 한다.

## 생성자(객체 생성자 메서드)

클래스의 인스턴스, 객체를 만들 때마다 new 키워드를 사용한다.

반환값이 없으며, 클래스 이름으로 선언한다.


```java
public class Driver02 {
  public static void main(String[] args) {
    동물 뽀로로 = new 동물("뽀로로");
    동물 무명 = new 동물();
  }
}
```

위 예제에서 new 동물() 밑에 빨간줄이 생길것이다. 그리고 컴파일을 거부한다. 무엇이 문제일까?

- 개발자가 아무런 생성자도 만들지 않으면 자바는 인자가 없는 기본 생성자를 자동으로 만들어준다.
- 인자가 있는 생성자를 하나라도 만든다면 자바는 기본 생성자를 만들어 주지 않는다.

생성자는 개발자가 필요한 만큼 오버로딩해서 만들 수 있다.

### 클래스 생성 시의 실행 블록, static 블록

클래스를 static 영역에 배치하여 static 블록에서 실행할 수 있다


#### static 블록의 특성

```java
public class Driver04 {
  public static void main(String[] args) {
    System.out.println("main 메서드 시작");
    동물 뽀로로 = new 동물();
    동물 피카츄 = new 동물();
  }
}
```

위 예제의 동물 클래스 static 블록은 단 한번만 실행된다.

왜 사용될때 한번만 로딩이 되는가? => static 영역도 메모리이기 떄문이다.

> static 블록과 유사하게 클래스의 인스턴스를 위한 인스턴스 블록도 존재한다.
> 아무런 표시 없이 {} 블록을 사용하게 되면 인스턴스가 생성될 때마다 {} 블록이 실행된다.
> {} 블록은 객체 생성자가 실행되기 전에 먼저 실행된다.


### final 키워드

"최종" 이라는 의미를 가진 단어다.

'상속을 허락하지 않겠다'는 의미다.


### final과 변수

변수에 final이 붙었다면?
변경 불가능한 상수가 된다.

- 정적 상수
  - 정적생성자 (static 블록)
- 객체상수
  - 객체생성자 (인스턴스 블록)
- 지역 상수
  - 최초 한번만 초기화

### final과 메서드

메서드에 final이라면 오버라이딩을 금지하게 된다.

### instanceof 연산자

클래스 인스턴스를 확인한다.

만들어진 객체가 특정 클래스의 인스턴스인지 물어보는 연산자다.

### 주의

LSP를 위반할 수 있다.

리팩터링의 대상이 아닌지 점검해 봐야 한다.

instanceof 연산자는 클래스들의 상속 관계뿐만 아니라 인터페이스의 구현 관계에서도 동일하게 적용된다.

```java
interface 날수있는 {

}

class 박쥐 implements 날수있는 {

}

class 참새 implements 날수있는 {

}

public class Driver {
  public static void main(String[] args) {
    날수있는 박쥐객체 = new 박쥐();
    날수있는 참새객체 = new 참새();

    System.out.println(박쥐객체 instanceof 날수있는);
    System.out.println(박쥐객체 instanceof 박쥐);

    System.out.println(참새객체 instanceof 날수있는);
    System.out.println(참새객체 instanceof 참새);
  }
}
```

위 예제를 실행해보면 모두 true를 반환한다.

### package 키워드

네임스페이스(이름공간)를 만들어주는 역할을 한다.

패키지는 해당 클래스를 소유한다.

서로 다른 두 부서의 Customer

### interface 키워드와 implements 키워드

메서드 : public , abstract
속성 : public , static, final

인터페이스는 추상 메서드와 정적 상수만 가질 수 있기에 위 속성을 알아서 붙여준다.

### this 키워드

객체가 자기 자신을 지칭할 때 쓰는 키워드다.

"나" 라고 하는 대명사와 같은 것이라고 보면 된다.


#### 알아야할 것

- 지역 번수와 속성(객체 변수, 정적 변수)의 이름이 같은 경우 지역 변수가 우선한다.
- 객체 변수와 이름이 같은 지역 변수가 있는 경우 객체 변수를 사용하려면 this를 접두사로 사용한다.
- 정적 변수와 이름이 같은 지역 변수가 있는 경우 정적 변수를 사용하려면 클래스명을 접두사로 사용한다.

### super 키워드

바로 위 상위 클래스의 인스턴스를 지칭하는 키워드다.

```java
class 동물 {
  void method() {
    System.out.println("동물");
  }
}

class 조류 extends 동물 {
  void method() {
    super.method();
    System.out.println("조류");
  }
}

class 펭귄 extends 조류 {
  void method() {
    super.method();
    System.out.println("펭귄");
  }
}

public class Driver {
  public static void main(String[] args) {
    펭귄 뽀로로 = new 펭귄();
    뽀로로.method();
  }
}
```

위 예제는 super 키워드를 이용해 상위 클래스의 인스턴스 메서드를 호출하고 있음을 볼 수 있다.

바로 위 상위 클래스 인스턴스에는 접근할 수 있지만 super.super 형태는 불가능하다.

### 알아두면 좋은 것들

객체 멤버 메서드는 스태틱영역에 단 1개만 생성한다.
(여러개 X)

this.객체참조변수명

++ 람다 관련 예제 추가예정
