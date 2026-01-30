
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}

