import java.util.Scanner;

public class complex {

        int real, imaginary;

        complex() {
        }

        complex(int tempReal, int tempImaginary)
        {
            real = tempReal;
            imaginary = tempImaginary;
        }


        complex addComp(complex C1, complex C2)
        {

            complex temp = new complex();

            temp.real = C1.real + C2.real;

            temp.imaginary = C1.imaginary + C2.imaginary;

            return temp;
        }

        complex subtractComp(complex C1, complex C2) {

            complex temp = new complex();
            temp.real = C1.real - C2.real;
            temp.imaginary = C1.imaginary - C2.imaginary;
            return temp;
        }
        complex productComp(complex C1 , complex C2){
            complex temp = new complex();
            temp.real = (C1.real * C2.real) - (C1.imaginary * C2.imaginary) ;
            temp.imaginary = (C1.real * C2.real) + (C1.imaginary * C2.imaginary);
            return temp;
        }
        void printComplexNumber()
        {
            System.out.println("Complex number: "
                    +real + " + "
                    + imaginary + "i");
        }



        public static void main(String[] args) {

            complex C1 = new complex(3,2);
            //System.out.println("enter the real part:"+C1.real);

           C1.printComplexNumber();

           complex C2 = new complex(9,5);

            C2.printComplexNumber();


            complex C3 = new complex();


            C3 = C3.addComp(C1, C2);

            System.out.print("Sum of ");
            C3.printComplexNumber();

            C3 = C3.subtractComp(C1, C2);
            System.out.print("Difference of ");
            C3.printComplexNumber();

            C3 = C3.productComp(C1 , C2);
            System.out.print("Product of ");
            C3.printComplexNumber();
        }
    }