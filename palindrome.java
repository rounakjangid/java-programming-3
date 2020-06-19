import java.util.Scanner;
 public class palindrome{
    public static boolean isPal(int number)
    {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
        return true;
    }
        return false;
    }

    public static void main(String[]args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        int palindrome = scanner.nextInt();

        if(isPal(palindrome))
            System.out.println(palindrome + " is a palindrome");
        else
         System.out.println(palindrome+ " is not a palindrome");
    }
}

         
