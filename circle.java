import java.util.Scanner;


public class circle
    {
        double radius = 1.0;
        String color = "red" ;


        circle(){

            System.out.println("the color of the circle is " +color );
        }
        void area(double radius)
        {
            double z = 3.14 * radius * radius;
            System.out.println("the area of the circle is "+z+" sq units");
        }

        double getRadius(){
            return radius;
        }
        double getArea(){
            return ( 3.14 * radius * radius);
        }


        public static void main(String args[])
        {

            circle ob = new circle();
            ob.area(2.5);
        }
    }



