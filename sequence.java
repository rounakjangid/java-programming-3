

import java.util.Scanner;
public class sequence {
    int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        sequence s = new sequence();
        s.num = n;
        s.printsequence( n);

    }

     void printsequence(int n) {


        if  (n < -num)
        System.out.print("");

        else
        System.out.print("" + Math.abs(n));
        printsequence(n - 1);

    }
}


