package fc.java.part2;

public class OverLoadingTest {
    public static void main(String[] args) {

        float v=add(35.6f, 56.7f);  // float v=add_float_float(35.6f, 56.7f);로 컴파일 됨
        System.out.println("v = " + v);

        int vv=add(10,50);  // int vv=add_int_int(10,50);로 컴파일 됨
        System.out.println("vv = " + vv);

    }

    // Q. 매개변수로 두개의 정수 값을 받아서 / 총 합을 구하여 / 리턴하는 / [메서드를 정의] 하세요.
    public static int add(int a, int b){  // public static int add_int_int(int a, int b){로 컴파일 됨
        int sum = a + b;
        return sum;
    }

    // Q. 매개변수로 두개의 실수 값을 받아서 / 총 합을 구하여 / 리턴하는 / [메서드를 정의] 하세요.
    public static float add(float a, float b){  // public static float add_Float_float(float a, float b){로 컴파일 됨
        float sum = a + b;
        return sum;

    }
}
