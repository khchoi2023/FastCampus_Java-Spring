package fc.java.part2;

public class FindAPI {
    public static void main(String[] args) {
        int a; // 변수선언
        a = 10;
        System.out.println("a = " + a);

        // "APPLE" 문자열 저장하고 출력

        String s;
        // = java.lang.String s;와 동일함(생략해서 쓸 수 있음)
        // External Libraries내에, java.base 폴더 내에, java 폴더 내에,
        // lang폴더 내에, String이라는 API(Class)가 있음
        
        s = "APPLE";
        System.out.println("s = " + s);

        System.out.println(s.length()); // s의 길이를 구함 -> 5 출력

    }
}
