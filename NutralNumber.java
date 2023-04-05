import java.util.Scanner;
public class NutralNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("The sum of first " + num + " natural numbers is: " + sum);
        }
    }


