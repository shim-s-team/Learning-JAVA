// 컴파일 옵션 -encoding UTF-8

import java.util.Calendar;

public class CalendarTest
{
    public static void main(String[] args)
    {
        Calendar now = Calendar.getInstance();

        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);

        System.out.println("현재시간은 " + hour + "시 " + min + "분 입니다.");
    }
}