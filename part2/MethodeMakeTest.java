package fc.java.part2;

public class MethodeMakeTest {
    public static void main(String[] args) {

        int a=3;
        int b=5;

        // a+b=?
        // int sum=a+b;
        // System.out.println("sum = " + sum);

        // add라는 메서드를 호출하여 두 수의 합의 결과를 받아보자.
        int result = add(a,b);
        System.out.println("result = " + result);

    }

    // Q. [매개변수로 2개의 정수를 받아서] [총 합을 구하여] [리턴] 하는 [메서드를 정의] 하세요.
    public static int add(int a, int b){
        int sum=a+b;
        return sum;

    }


}
