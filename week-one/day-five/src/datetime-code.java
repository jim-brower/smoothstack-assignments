import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

class DateTimeCode {

    // question 5
    public static List<Integer> getMonthLengthsInYear(int year) {
        GregorianCalendar yr = new GregorianCalendar(year, 0, 1);
        int i = 0;
        List<Integer> daysInMonths = new ArrayList<>();
        do {
            daysInMonths.add(yr.getActualMaximum(Calendar.DAY_OF_MONTH));
            yr.roll(Calendar.MONTH, true);
            ++i;
        } while (i < 12);
        return daysInMonths;
    }

    // question 6
    public static List<Integer> getMondaysInMonth(int month) {
        GregorianCalendar thisYear = new GregorianCalendar();
        GregorianCalendar targetMonth =
                new GregorianCalendar(thisYear.get(Calendar.YEAR), month, 1);
        int i = 1;
        List<Integer> mondays = new ArrayList<>();
        do {
            if (Calendar.MONDAY == targetMonth.get(Calendar.DAY_OF_WEEK)) {
                mondays.add(targetMonth.get(Calendar.DAY_OF_MONTH));
            }
            targetMonth.roll(Calendar.DAY_OF_MONTH, true);
            ++i;
        } while (i <= targetMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        return mondays;
    }

    // question 7
    public static boolean fridayThirteenth(int year, int month, int day) {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        return (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
                && calendar.get(Calendar.DAY_OF_MONTH) == 13);
    }
}
