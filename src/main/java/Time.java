import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time extends _Command {
    public Time() {
        String name = "Time";
        String description = "Shows current time.";
    }

    public String Execute() {
        Calendar time = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        //System.out.println(sdf.format(cal.getTime()));
        return sdf.format(time.getTime());
    }
}
