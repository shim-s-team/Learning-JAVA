// 컴파일 옵션 -encoding UTF-8

import java.util.Random;

public class RandomTest
{
    public static void main(String[] args)
    {
        Random r = new Random();

        System.out.println("0 ~ 99 범위의 난수 : " + Math.abs(r.nextInt() % 100));
    }
}