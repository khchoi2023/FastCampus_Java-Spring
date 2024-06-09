package fc.java.part2;

public class CharExam {
    public static void main(String[] args) { // 'main' + 엔터 또는 'psvm' + 엔터
        
        // '1' '2' '3' '4' '5' = 15가 나오도록 프로그래밍 하시오
        int sum = 0; // '0' 0-> 48
        sum = sum + ('1' - '0'); // '1' -> 49 - '0'(48) = 1
        sum = sum + ('2' - '0');
        sum = sum + ('3' - '0');
        sum = sum + ('4' - '0');
        sum = sum + ('5' - '0');
        System.out.print("sum = " + sum); // 255 -> 15
        System.out.println(); // println은 print에서 줄바꿈(개행) 추가 된 것임

    }
}
