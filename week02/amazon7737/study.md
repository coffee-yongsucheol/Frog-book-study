## 03 자바와 객체지향

#### 객체지향의 4대 특성

- 캡슐화(Encapsulation) : 정보 은닉(Information Hiding)
- 상속(Inheritance) : 재사용
- 추상화(Abstraction) : 모델링
- 다형성(Polymorphism) : 사용 편의

#### 추상화

추상 : 여러 가지 사물이나 개념에서 공통되는 특성이나 속성 따위를 추추랗여 파악하는 작용

객체 지향의 추상화와 그림으로서의 추상화, 사전적의미의 추상화는 같은 의미
사전적 의미에서 공통 특성 추출 이라는 부분에 집중.

#### 추상화는 모델링과 같다
'객체 지향의 추상화는 곧 모델링이다' 라는 관점에서 구체적인 것은 떼어내고, 관찰자가 알아야하는 특성(정보) 들만 가지고 정의하는 것이라고 할 수 있다.

#### 인스턴스(instance)

클래스를 이용해 object를 만들었다는 것을 강조할때는 object라는 표현보다는 클래스의 인스턴스(instance)라는 표현을 쓴다

#### 내가 만들고자 하는 세상에 따라서 클래스의 내용이 달라진다

만약 병원 애플리케이션을 만들고 있다면 사람은 환자를 의미하는 좀 더 구체적인 이름으로 바꿀 수 있을 것이고 클래스 설계도 달라질 것이다. 은행 애플리케이션을 만들고 있다면 사람은 고객이라는 구체적인 이름으로 바꿀 수 있을 것이고 클래스 설계도 역시 달라져야 한다.

<table>
<tr>
<td>애플리케이션 경계</td>
<td>병원 애플리케이션</td>
<td>은행 애플리케이션</td>
</tr>

<tr>
<td>사람이란 </td>
<td>사람은 환자다.</td>
<td>사람은 고객이다.</td>
</tr>

<tr>
<td>클래스 모델링</td>
<td>
  <img src = "https://github.com/user-attachments/assets/901056a5-8f52-407b-a6a7-42ea3aa4b9eb" width = "400" height = "auto" />
</td>
<td>
  <img src = "https://github.com/user-attachments/assets/9f86a777-60ce-44cb-8b55-7d06344275bd" width = "400" height = "auto" />
</td>
</tr>


</table>
