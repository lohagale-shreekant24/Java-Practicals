import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (1 to N): ");
        int n = scanner.nextInt();

        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
