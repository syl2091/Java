package date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Date2 {
    public static void main(String args[]) {
        Date2 date = new Date2();
        date.testZonedDateTime();
    }

    public void testZonedDateTime() {
        // 获取当前时间日期
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1: " + date1);
        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当期时区: " + currentZone);
        //默认时区
        ZonedDateTime date2 = ZonedDateTime.now();
        ZonedDateTime dateTime1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime dateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println(date2);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}