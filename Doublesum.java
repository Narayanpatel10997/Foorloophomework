import java.util.Scanner;
public class Doublesum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a positive number n: ");
            int n = input.nextInt();
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }
            System.out.println("Sum of the number is: " + sum);
        }
    }



