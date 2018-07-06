public class Exit extends _Command {
    public Exit() {
        String name = "Exit";
        String description = "Closes console.";
    }

    public String Execute() {
        System.exit(0);
        return null;
    }
}