import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // Optional prompt for clarity
        int n = sc.nextInt(); // Must enter a valid integer

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
        sc.close();
    }
}