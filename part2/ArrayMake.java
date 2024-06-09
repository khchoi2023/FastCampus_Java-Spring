package fc.java.part2;

public class ArrayMake {
    public static void main(String[] args) {

        // [정수 5개]를 저장 할 [배열을 생성] 하시오
        // int[] a;
        // a = new int[5];
        int[] a = new int[5];

        a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        a[4] = 10;

        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);

        // 반복문(for, while)
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        float[] f = new float[5]; // 길이가 고정

        Book b1, b2, b3;
        Book[] b = new Book[3]; // 책 3권을 저장할 배열을 생성

    }
}
