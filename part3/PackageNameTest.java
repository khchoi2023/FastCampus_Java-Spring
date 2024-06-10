package fc.java.part3;

// import java.lang.*;  // default package 생략되어있음

// import java.util.Scanner;
// import fc.java.model.CarDTO;

import java.util.*;
import fc.java.model.*;

public class PackageNameTest {
    public static void main(java.lang.String[] args) {

        // Q. 지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자.

        // java.lang.String str;
        // java.util.Scanner scan = new java.util.Scanner(System.in);
        // java.lang.System.out.println("Hello World");

        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");


        // Q. 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자
        // fc.java.model.CarDTO car = new fc.java.model.CarDTO();  // import fc.java.model.CarDTO;
        // fc.java.model.CarDAO dao = new fc.java.model.CarDAO();  // import fc.java.model.CarDAO;

        CarDTO car = new CarDTO();  // import fc.java.model.CarDTO;
        CarDAO dao = new CarDAO();  // import fc.java.model.CarDAO;

    }
}
