# 상속과 인터페이스

## 상속과 인터페이스의 쓰임새 차이

인터페이스는 상속과는 다르게 쓰는 것이 유용하다.

![image](https://github.com/user-attachments/assets/2b92ad73-7550-42b9-92e9-a00358c5368b)

위의 상속도를 보았을때, 박쥐와 참새는 '날 수 있는' 이라는 행위를 포함한다.
고래와 펭귄은 '헤엄칠 수 있는' 이라는 행위를 포함한다.

인터페이스는 행위의 형태를 만들어서 구성하는 것이 좋다.

### 타 인터페이스의 행위들

- Serializable 인터페이스 : 직렬화할 수 있는
- Cloneable 인터페이스 : 복제할 수 있는
- Comparable 인터페이스 : 비교할 수 있는
- Runnable 인터페이스 : 실행할 수 있는

### 인터페이스가 구성해야 하는 내용

인터페이스는 클래스가 '무엇을 할 수 있다'를 강제하여 구현하게 된다.

상위 클래스는 물려줄 특성이 풍성할수록 좋고, 인터페이스는 구현을 강제할 메서드의 개수가 적을 수록 좋다.

상위 클래스가 좋은 이유는 LSP(리스코프 치환 원칙)에 따른 이유이다.
인터페이스에 메서드가 적을수록 좋은 이유는 ISP(인터페이스 분할 원칙)에 따른 이유이다.

### 인터페이스 구조 예제

```java
public class 동물 {
  String myClass;

  동물() {
    myClass = "동물";
  }

  void showMe() {
    System.out.println(myClass);
  }
}
```

```java
public interface 날수있는 {
  void fly();
}
```

```java
public interface 헤엄칠수있는 {
  void swim();
}
```

```java
public class 포유류 extends 동물 {
  포유류() {
    myClass = "포유류";
  }
}
```

```java
public class 조류 extends 동물 {
  조류() {
    myClass = "조류";
  }
}
```

```java
public class 고래 extends 포유류 implements 헤엄칠수있는 {
  고래() {
    myClass = "고래";
  }

  @Override
  public void swim() {
    System.out.println(myClass + " 수영 중. 어프!!! 어프!!!");
  }
}
```

```java
public class 박쥐 extends 포유류 implements 날수있는 {
  박쥐() {
    myClass = "박쥐";
  }

  @Override
  public void fly() {
    System.out.println(myClass + " 날고 있삼.. 슈웅!! 슈웅!!!");
  }
}
```

```java
public class 참새 extends 조류 implements 날수있는 {
  참새() {
    myClass = "참새";
  }

  @Override
  public void fly() {
    System.out.println(myClass + " 날고 있삼.. 허우적!!! 허우적!!!);
  }
}
```

```java
public class 펭귄 extends 조류 implements 헤엄칠수있는 {
  펭귄() {
    myClass = "펭귄";
  }

  @Override
  public void swim() {
    System.out.println(myClass + " 수영 중. 푸악!!! 푸악!!!");
  }
}
```

```java
public class Driver {
  public static void main(String[] args) {
    날수있는 날라리1 = new 박쥐();
    날라리1.fly();

    날수있는 날라리2 = new 참새();
    날라리2.fly();

    헤엄칠수있는[] 맥주병들 = new 헤엄칠수있는[2];

    맥주병들[0] = new 고래();
    맥주병들[1] = new 펭귄();

    for (헤엄칠수있는 맥주병 : 맥주병들) {
      맥주병.swim();
    }
  }
}
```

행위를 기반으로 인터페이스를 만들고 동물의 종류에 따라서 상속구조를 둠으로써 행위를 강제하고 종류에 따른 생성자메소드와 추상 메소드의 구현을 작성한다.

## 다형성
다형성은 오버라이딩(overriding)과 오버로딩(overloading)이라고 할 수 있다.

오버라이딩(overriding) : 같은 메서드 이름, 같은 인자 목록으로 상위 클래스의 메서드를 재정의
오버로딩(overloading) : 같은 메서드 이름, 다른 인자 목록으로 다수의 메서드를 중복 정의

### 예시
```
public class Penguin extends Animal {
  public String habitat;

  public void showHabitat() {
    System.out.printf("%s는 %s에 살아\n", name, habitat);
  }

  public void showName() {
    System.out.println("어머 내 이름은 알아서 뭐하게요?");
  }

  public void showName(String yourName) {
    System.out.printf("%s 안녕, 나는 %s라고 해\n", yourName, name);
  }
}
```

## 다형성을 사용편의성이라 정의한 이유

자바의 정수 자료형으로는 byte, short, int, long, char가 부동소수점 수 자료형으로는 float, double이 있다. 가운데 두 개의 형식으로 조합할 수 있는 경우의 수는 7*7 = 49다. 그 중에서 인자 목록이 중복되는 함수를 제외해도 대략 42개의 함수를 작성해야만 두 수를 더하는
모든 경우를 만족시킬 수 있고 함수의 이름은 다 달라야 한다.

오버로딩은 함수명 하나를 가지고 인자 목록만 달리하면 되니 얼마나 사용하기 편리한지 알 수 있다.
특히 자바 5에서 추가된 제너릭을 이용하면 하나의 함수만 구현해도 다수의 함수를 구현한 효과를 낼 수 있다.
다형성에 대해 사용 편의성이라고 정의한 이유이다.

오버라이딩의 경우에도 하위 클래스가 재정의한 메서드를 알아서 호출해 줌으로써 형변환이나 instanceof 연산자를 써서 하위 클래스가 무엇인지 신경 쓰지 않아도 된다.
상위 클래스 타입의 객체 참조 변수에서 하위 클래스가 오버라이딩한 메서드를 자동으로 호출해 줌으로써 깔끔한 코드를 유지할 수 있게 된다.

## 캡슐화 == 정보은닉

정보 은닉이라고 하면 접근 제어자인 private, [default], protected, public이 있다.

### 객체 멤버의 접근 제어자

자신의 멤버가 아닌 다른 객체의 멤버에 접근하는 경우에는 다른 객체를 생성한 후 접근해야 한다.

### 참조 변수의 복사

```java
public class CallByValue {
  public static void main(String[] args) {
    int a = 10;
    int b = a;

    b = 20;

    System.out.println(a); // 10
    System.out.println(b); // 20
  }
```

- a에 10대입
- 변수 b에 변수 a가 가진 값 복사
- 변수 b에 20을 할당
- a가 가진 값이 단순히 b에 복사, a와 b 변수는 다른 관계는 없음

```java
public class CallByReference {
  public static void main(String[] args) {
    Animal ref_a = new Animal();
    Animal ref_b = ref_a;

    ref_a.age = 10;
    ref_b.age = 20;

    System.out.println(ref_a.age); // 20
    System.out.println(ref_b.age); // 20
    System.out.println(ref_a); // reference.Animal@15db9742
    System.out.println(ref_b); // 바로 위와 같은 값이 출력됨
  }
}

class Animal {
  public int age;
}
```

위 예제를 실행해보면 ref_a 와 ref_b는 같은 참조값을 가지고 있는 것을 알 수 있다.

### 정리

- 기본 자료형 변수는 값을 값 자체로 판단한다.
- 참조 자료형 변수는 값을 주소, 즉 포인터로 판단한다.
- 기본 자료형 변수를 복사할 때, 참조 자료형 변수를 복사할 때 일어나는 일은 같다. 즉, 가지고 있는 값을 그대로 복사해서 넘겨 준다.

### 자바 키워드와 OOP 4대 특성

| 예약어 |
|--------|
| abstract |
| assert |
| boolean |
| break |
| byte |
| case |
| catch |
| char |
| class |
| const |
| continue |
| default |
| do |
| double |
| else |
| enum |
| extends |
| final |
| finally |
| float |
| for |
| goto |
| if |
| implements |
| import |
| instanceof |
| int |
| interface |
| long |
| native |
| new |
| package |
| private |
| protected |
| public |
| return |
| short |
| static |
| strictfp |
| super |
| switch |
| synchronized |
| this |
| throw |
| throws |
| transient |
| try |
| void |
| volatile |
| while |


