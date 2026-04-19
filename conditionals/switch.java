public class Demo {
    public static void main(String[] args) {
        
        int n = 4;

        switch(n) {
            case 1:
                System.out.println("Monday");
                break; // Exit the switch
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                // This runs if 'n' doesn't match any of the above
                System.out.println("Enter a valid day (1-7)");
        }
    }
}

/* Modern Java 
switch(n) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    case 4 -> System.out.println("Thursday");
    default -> System.out.println("Invalid Day");
}

as an expression:

int alarmTime = switch (day) {
    case "MON", "FRI" -> 7;
    case "SAT", "SUN" -> 10;
    default -> 8;
}; // Semicolon is required here because it's a variable assignment

yield example:

String status = switch (day) {
    case "MON" -> "First day of the week";
    case "FRI" -> {
        System.out.println("Almost there...");
        yield "Weekend eve"; // This is the value 'status' will get
    }
    default -> "Regular day";
};
*/