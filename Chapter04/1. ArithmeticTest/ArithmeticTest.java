// 컴파일 옵션 -encoding UTF-8

public class ArithmeticTest
{
    public static void main(String[] args)
    {
        int num = 256;

        System.out.println("주어진 수 : " + num);

        System.out.println(" 1의 자리 : " + num % 10);

        num = num / 10;
        System.out.println(" 10의 자리 : " + num % 10);

        num = num / 10;
        System.out.println(" 100의 자리 : " + num % 10);
    }
}