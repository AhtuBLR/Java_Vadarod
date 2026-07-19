package Task21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        dateFormat1();
        dateFormat2();
        dateFormat3();
        dateFormat4();
    }

    //1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
    public static void dateFormat1() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        String result = localDate.format(formatter);
        System.out.println(result);
    }

//2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String

    public static void dateFormat2() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", new Locale("ru"));
        String result = localDateTime.format(formatter);
        System.out.println(result);
    }

  //3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
    public static void dateFormat3() {
        String input = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", Locale.ENGLISH);
        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
        System.out.println(dateTime);
    }

//4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:

    public static void dateFormat4() {
        String input = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE dd.MM.yy 'г.' 'время:' HH:mm:ss", new Locale("ru"));
        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
        System.out.println(dateTime);
    }
}
