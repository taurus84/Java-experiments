package timeExample;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by davidtran on 2017-08-14.
 */
public class TimeExample {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1984, Month.MAY, 14);
        LocalDate myBirthday2 = LocalDate.of(2017, Month.AUGUST, 13);

        LocalDate now = LocalDate.now();

        Period sinceIWasBorn = myBirthday.until(now);

//        System.out.println(sinceIWasBorn.getMonths());
//        System.out.println(myBirthday.until(now, ChronoUnit.MONTHS));
//        System.out.println(myBirthday.until(now, ChronoUnit.DAYS));

    }
}
