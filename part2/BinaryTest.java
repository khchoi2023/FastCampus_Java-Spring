package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;
        boolean b = false;
        char c = 'A';
        String s = "APPLE"; // = java.lang.String s;

        // 69를 10진수, 2진수, 8진수, 16진수로 출력하시오
        int decimal = 69;
        System.out.println("decimal = " + decimal);

        int binary = 0b01000101; // 2진수는 앞에 '0b'를 붙임
        System.out.println("binary = " + binary);

        int octal = 0105; // 8진수는 앞에 '0'을 붙임
        System.out.println("octal = " + octal);

        int hexa = 0x45; // 16진수는 앞에 '0x'를 붙임
        System.out.println("hexa = " + hexa);



    }
}
