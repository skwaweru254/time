
import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);// get the current year
        int yr = Year.now().getValue();// alternative to get current year
        int currentYear = YearMonth.now().getYear();
        System.out.println("Current year is " + year + " or " + yr + " or " + currentYear);

    }


}