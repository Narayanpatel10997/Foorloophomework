
    import java.util.Scanner;

    public class Rno {
        public static void main(String[] args) {
            // create a Scanner object to read input from the user
            Scanner input = new Scanner(System.in);

            // read the input number from the user
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            // reverse the number using a for loop
            int reversedNum = 0;
            for (; num != 0; num /= 10) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
            }

            // print the reversed number
            System.out.println("The reversed number is: " + reversedNum);
        }
    }

