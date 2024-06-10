package fc.java.part3;
// 객체(object) = 상태정보(멤버 변수) + 행위정보(멤버 메서드)

public class Person {

    public String name;
    public int age;
    public String phone;

    // 기본 생성자 메서드
    public Person(){
    }
    // public Person(){ } -> 객체를 생성하는 코드 생략

    public void play(){
        System.out.println("운동을 한다.");
    }

    public void eat(){
        System.out.println("음식을 먹다.");
    }

    public void walk(){
        System.out.println("걷다.");
    }

}
