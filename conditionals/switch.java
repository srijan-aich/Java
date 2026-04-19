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
*/