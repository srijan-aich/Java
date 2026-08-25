
enum Status{

    Running, Failed, Again_running, Success; 
}

public class enum_switch {
    public static void main(String[] args) {
        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("The program is running.");
                break;
            case Failed:
                System.out.println("The program failed.");
                break;
            case Again_running:
                System.out.println("The program is running again.");
                break;
            case Success:
                System.out.println("The program completed successfully.");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }
}
