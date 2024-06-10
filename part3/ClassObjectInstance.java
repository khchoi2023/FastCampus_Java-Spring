package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1;  // st1 : object
        Student st2;  // st2 : object
        Student st3;  // st2 : object

        st1 = new Student("홍길동", "컴퓨터공학과", 37, "bit@empas.com", 20231101, "010-1111-1111");  // st1 : instance
        st2 = new Student("김길동", "컴퓨터공학과", 37, "bit@empas.com", 20231101, "010-1111-1111");  // st2 : instance
        st3 = new Student("나길동", "컴퓨터공학과", 37, "bit@empas.com", 20231101, "010-1111-1111");  // st3 : instance

        System.out.println(st1.toString());  // st1.toString()
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
