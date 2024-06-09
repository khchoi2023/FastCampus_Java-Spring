package fc.java.part2;

public class CarTest {
    public static void main(String[] args) {

        // 자동차의 정보를 저장 하려고 한다. 변수를 만들어 보시오
        String model = "BMW528i"; // 문자열, 사용자 정의 자료형
        System.out.println("model = " + model);

        long distance = 1000000L; // 8 byte 정수 - long은 숫자뒤에 'L'을 붙여줘야 한다
        System.out.println("distance = " + distance + "km");

        int price = 9000000; // 4 byte 정수
        System.out.println("price = " + price);

        String company = "BMW"; // 문자열, 사용자 정의 자료형
        System.out.println("company = " + company);

        char type = 'A'; // 2 byte 문자
        System.out.println("type = " + type + "Type");

        boolean auto = true; // 1 byte 논리형
        System.out.println("auto = " + auto);

        int year = 2000; // 4 byte 정수
        System.out.println("year = " + year);

        float gasmi = 12.55f; // 4 byte 실수
        System.out.println("gasmi = " + gasmi + "L");


        // 변수
        // int a = 10; // 상수
        // int b = a;  // 변수
        // int c = b * 10; // 연산식
        // int d = even(c); // 메서드 호출문

        // 1 byte = 8 bit = 2^8
        // int = 4 byte = 32 bit = 2^32 -> 21억 까지 표현가능?
        // double = 8 byte =

    }
}
