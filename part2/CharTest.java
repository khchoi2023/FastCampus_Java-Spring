package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c);

        int a = 'A'; // 'A'의 아스키 코드값이 저장됨
        System.out.println("a = " + a);
        
        int b ='B' + 1; // 'B'의 아스키 코드값에 +1을 함
        System.out.println("b = " + (char)b); // 67 + 1-> C로 바꿈

        // '가'라는 한글 한 문자를 변수에 저장하고 출력하시오
        char han = '가';
        System.out.println("han = " + han);
        
        int hanD = '가'; // 44032
        System.out.println("hanD = " + hanD);
        
        int hanU = '\uAC00';
        System.out.println("(char)hanU = " + (char)hanU);

        // 대문자 'A'를 문자 'a'로 변환하여 출력하시오(ASCII 코드 참고)
        char upper = 'A';
        char lower = (char)(upper + 32); // 캐스팅이라고 함
        System.out.println("lower = " + lower);
        
        char lower1 = 'u'; // 117
        int upper1 = lower1 - 32; // 117 - 32 = 85 = 'U'
        System.out.println("upper1 = " + (char)upper1); // 85 -> U

        // '1' + '2' = 3이 나오도록 프로그래밍 하시오
        int data = '1' + '2'; // 99
        System.out.println("data = " + data);
        
        char i = '1'; // 49 - 48 = 1
        char j = '2'; // 50 - 48 = 2
        // int sum = (i - 48) + (j - 48);
        int sum = (i - '0') + (j - '0');
        System.out.println("sum = " + sum); // 3


    }
}
