// 컴파일 옵션 -encoding UTF-8

public class DataTypeTest
{
    public static void main(String[] args)
    {
        // 변수 선언
        int i;
        float f;
        double d;
        char c;
        boolean b;

        // 값 할당
        i = 120;
        f = 12.23f; // f는 12.23이 float형이라는 점을 명시
        d = 12.23; // 실수 뒤에 아무 표시도 안하면 double로 취급
        c = 'a';
        b = true;

        System.out.println("Data Practice Program");
        System.out.println("---------------------");

        // 값 출력
        System.out.println("int : " + i);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println("char : " + c);
        System.out.println("boolean : " + b);
    }
}