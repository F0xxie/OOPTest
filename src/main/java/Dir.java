import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.io.File;

public class Dir extends _Command {
    public Dir() {
        String name = "File";
        String description = "Shows all files in directory.";
    }

    public String Execute() {
        //String currentPath = new File("").getAbsolutePath();

        File folder = new File(__TestMain.currentPath);
        String[] listOfFiles = folder.list();
        for (String file : listOfFiles) {
                System.out.println("- " + file);
        }
        return " ";
    }
}