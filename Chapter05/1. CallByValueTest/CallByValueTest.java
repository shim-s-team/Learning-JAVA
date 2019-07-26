// 컴파일 옵션 -encoding UTF-8

public class CallByValueTest
{
    public static void swap(int x, int y)
    {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        System.out.println("swap() 메서드 호출 전 : " + a + ", " + b);
        swap(a, b);
        System.out.println("swap() 메서드 호출 후 : " + a + ", " + b);
    }
}