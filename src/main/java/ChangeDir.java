import java.util.ArrayList;

public class ChangeDir extends _Command {
    public ChangeDir() {
        String name = "Change directory";
         String description = "«cd [argument]» Changes current directory to [argument].";
    }

    public String Execute(String[] args) {

        __TestMain.currentPath = args[0];
        return "";
    }
}