import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class __TestMain {
    public static String currentPath = new File("").getAbsolutePath();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, _Command> comlist = new HashMap<String, _Command>();
        comlist.put("time", new Time());
        comlist.put("exit", new Exit());
        comlist.put("date", new Date());
        comlist.put("file", new Dir());
        comlist.put("cd", new ChangeDir());
        comlist.put("help", new Help());

        while (true) {
            System.out.print(currentPath + ">");
            //String input = scanner.nextLine();
            String command = scanner.nextLine();
            //_Command c = commands.get(command);
            _Parser pars = new _Parser();
            List<String> commands = pars.Parse(command, ' ');
            //if(comlist.containsKey(comlist.get(0))){
            _Command c = (_Command) comlist.get(commands.get(0));
            if (commands.size() == 1) {
                if (c == null) {
                    System.out.println("Command not found.");
                } else {
                    System.out.println(c.Execute());
                }
            } else {
                commands.remove(0);
                String[] commArgs = new String[commands.size()];
                for (int i = 0; i < commands.size(); i++) {
                    commArgs[i] = commands.get(i);
                }
                if (c == null) {
                    System.out.println("Command not found.");
                } else {
                    System.out.println(c.Execute(commArgs));
                } ;
                //    }
                //}

                //if (c==null){
                //    System.out.println("Command not found.");
                //}

            }
        }
    }
}
