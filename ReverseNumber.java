import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("enter no :-");
        int Reversableno=0;
        for (; number!= 0; number /= 10)
        {
        int digit = number%10;
            int reversible = Reversableno * 10 + digit;
        }
        System.out.println("reversable no :-" + Reversableno);
    }

}
