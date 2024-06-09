package fc.java.part2;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("안녕, World");
    }
}


// 컴파일 하는 법(한글이 없을 때) : javac.exe -d ..\out\production\FastCampus HelloWorld.java
// 컴파일 하는 법(한글이 있을 때) : javac.exe -d ..\out\production\FastCampus HelloWorld.java -encoding UTF-8
// 실행 하는 법                : java.exe -classpath ..\out\production\FastCampus HelloWorld.class