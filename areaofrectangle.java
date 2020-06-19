import java.util.Scanner;

public class test2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:");
        int l= sc.nextInt();
        int b= sc.nextInt();
        int area = l * b ;
        System.out.println("Area of rectangle is " +area);

    }
}
