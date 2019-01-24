package kr.re.kitri.hello.java8datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeDemo2 {
    public static void main(String[] args) {

        LocalDate imf = LocalDate.of(1997, 12, 15);

        LocalDate today = LocalDate.of(2019, 1, 24);

        Period gap = imf.until(today);

        System.out.println(gap.getYears()
                + "년" + gap.getMonths()
                + "월" + gap.getDays() + "일 지났어요");
    }
}
