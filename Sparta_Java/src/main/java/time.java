import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class time {
    public static void main(String[] args) {
        System.out.println("now usages");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date); // 2022-08-29
        System.out.println(time); // 시:분:초
        System.out.println(dateTime); // 날짜,시간

        System.out.println("of() usage");
        LocalDate dateOf = LocalDate.of(2021, 03, 30); // 직접 입력
        LocalTime timeOf = LocalTime.of(22, 50, 0); // 직접 입렵

        System.out.println(dateOf);
        System.out.println(timeOf);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shortFormat = formatter.format(LocalTime.now());
        System.out.println(shortFormat); // 오후(오전) 시:분

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String myDate = formatter1.format(LocalDate.now());
        System.out.println(myDate); // formatter1 형식으로 만들어짐

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2020,1,1);
        Period period = Period.between(today, birthday);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd h/mm");
        String nodw = formatter2.format(LocalDateTime.now());
        System.out.println(nodw);
    }
}
