package fc.java.part2;

import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("정수를 입력하세요:");
        int num = scan.nextInt(); // 블럭상태 (잠시 멈춰있는 상태)
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요:");
        float f = scan.nextFloat(); // 블럭상태 (잠시 멈춰있는 상태)
        System.out.println("f = " + f);

        System.out.print("문자열을 입력하세요:"); // "A", "ABC"
        String str = scan.next(); // 블럭상태 (잠시 멈춰있는 상태), 띄어쓰기 이후는 입력안됨
        System.out.println("str = " + str);

        scan.nextLine();  // 버퍼 비우기(스트림 비우기) : 이게 없으면 앞의 띄어쓰기 한게 다음 코드에 자동으로 입력되어버림

        System.out.print("문자열을 입력하세요:"); // "A", "ABC"
        String str1 = scan.nextLine(); // 블럭상태 (잠시 멈춰있는 상태), 띄어쓰기 이후도 입력됨
        System.out.println("str1 = " + str1);

        scan.close();
    }
}
