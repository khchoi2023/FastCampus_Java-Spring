package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {

        // Q. [객체 배열]을 이용하여 4명의 학생(Student) 데이터를 저장하고 출력하세요.
        Student[] std = new Student[4];
        std[0] = new Student("홍길동", "컴공", 33, "bit@empas.com", 20231101, "010-1111-1111");
        std[1] = new Student("나길동", "전기", 43, "bit@empas.com", 20231102, "010-1111-1111");
        std[2] = new Student("김길동", "건출", 25, "bit@empas.com", 20231103, "010-1111-1111");
        std[3] = new Student("이길동", "통신", 51, "bit@empas.com", 20231104, "010-1111-1111");

        for (int i=0;i<std.length;i++){
            System.out.println(std[i].toString());
        }

        for (Student st : std){
            System.out.println(st.toString());
        }

    }
}
