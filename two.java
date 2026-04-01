import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");           // Ask user to enter name
        String name = sc.nextLine();                     // Read name input
        
        System.out.print("Enter your age: ");            // Ask user to enter age
        int age = sc.nextInt();                          // Read age input

        if (age >= 18) {
            System.out.println(name + ", you are eligible to vote.");
        } else {
            System.out.println(name + ", you are not eligible to vote until age 18.");
        }
    }
};
