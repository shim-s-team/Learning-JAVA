// 컴파일 옵션 -encoding UTF-8

public class ShortCircuitTest
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 4;

        if((++a > 4) && (++b > 8))
            System.out.println("if문이 수행되었습니다.");

        System.out.println("a : " + a + ", b : " + b);
    }
}