package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {

        // Q. 한 사람의 데이터를 저장할 [변수를 선언] 하세요.
        // 모델링 된 Person 클래스를 이용하여 [객체를 메모리에 생성] 하세요.
        // [인스턴스를 만드는 과정]

        // 변수를 선언 -> Person p; (p는 객체변수)
        // 객체를 생성 -> new Person(); (new 연산자 + 생성자 메서드())
        // 생성된 객체를 변수에 할당 -> Person p=new Person(); (p는 인스턴스 변수)

        Person p;  // fc.java.part3.Person p; 같은 패키지(디렉토리) 안에 있기 때문에 생략할 수 있다.
        p = new Person();
        p.name="홍길동";
        p.age=30;
        p.phone="010-1111-1111";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);
        p.play();
        p.eat();
        p.walk();


    }
}
