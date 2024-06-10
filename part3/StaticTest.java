package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // a + b = ?
        int sum = StaticTest.hap(a, b);  // 아래의 hap을 호출
        System.out.println("sum = " + sum);  // 30

    }


    // Q. 매개변수로 2개의 정수를 입력 받아서 / 총 합을 구하여 / 리턴하는 [메서드를 정의] 하시오.
    public static int hap(int a, int b){
        int v = a + b;
        return v;

    }

}
