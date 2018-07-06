import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date extends _Command {
    public Date() {
        String name = "Date";
        String description = "Shows current date.";
    }

    public String Execute() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar time = Calendar.getInstance();
        //System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
        return dateFormat.format(time.getTime());
    }
}
