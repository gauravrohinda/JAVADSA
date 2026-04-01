import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        System.out.print("Enter day number (1-7): ");
        try (Scanner sc = new Scanner(System.in)) {  // try-with-resources block
            int week = sc.nextInt(); // Read user input

            switch (week) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid Input");
            }
        } // Scanner is automatically closed here
    }
}
