// 컴파일 옵션 -encoding UTF-8

public class VariableTest
{
    public static void main(String[] args)
    {
        char myChar = '\u0041'; // 유니코드로 A
        System.out.println("myChar = " + myChar);

        int myInt = 0x15; // 16진수로 21
        System.out.println("myInt = " + myInt);

        float myFloat = 15.1F;
        System.out.println("myFloat = " + myFloat);

        System.out.println("Single Quote(\')\tBackslash(\\)"); // 제어문자 출력
    }
}