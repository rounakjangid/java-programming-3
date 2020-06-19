
import java.util.Scanner;
public class pattern {
    int no, num;

    void printpattern(int n, int k) {
        if (Math.abs(n) <= num) {
            if (n > 0) {
                System.out.print(" " + n);
                printpattern(n - k, k);
            }
            if (n <= 0) {
                no = n;
                System.out.print(" " + no);
                no = Math.abs(no);
                while (Math.abs(no) < num) {
                    no = no - k;
                    System.out.print(" " + Math.abs(no));
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        pattern p = new pattern();
        p.num = n;
        p.printpattern(n, k);


    }
}