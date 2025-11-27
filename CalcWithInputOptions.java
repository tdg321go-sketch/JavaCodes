import java.util.Scanner;

public class CalcWithInputOptions {
public static void main(String[] args) {
        
    
         Scanner sc = new Scanner (System.in);

        System.out.println("Calculator with Options");
        System.out.print("Operators \n 1) Add \n 2) Minus \n 3) Multiply \n 4) Divide \n 5) Modulus \n 6) Maximum & Minimum \n 7) Odd or Even \n 8) All of the Above \n 9) Exit \n Your Option : ");
        String X = sc.next();
    
    if (X.equals("9")) {
            System.out.println("Thank You");
    }
    else {
        System.out.print("Value A = ");
        float A = sc.nextFloat();
        System.out.print("Value B = ");
        float B = sc.nextFloat();
        if (X.equals("1")) {
            System.out.println("Sum is " + ((double)A+B));
        }
        else if (X.equals("2")) {
            System.out.println("Difference is " + ((double)A-B));
        }
        else if (X.equals("3")) {
            System.out.println("Product is " + ((double)A*B));
        }
        else if (X.equals("4")) {
            System.out.println("Quotient " + ((double)A/B));
        }
        else if (X.equals("5")) {
            System.out.println("Remainder is " + ((double)A%B));
        } 
        else if (X.equals("6")) {
            if (A>B) {
                System.out.println("Here A is greater than B \n i.e B is smaller than A");
            }
            else if (A<B) {
                System.out.println("Here B is greater than A \n i.e A is smaller than B");
            }
            else {
                System.out.println("Here A is equal to B");
            }
        }
        else if (X.equals("7")) {
            if(A%2 == 1 && B%2 == 1) {
            System.out.println("Both the numbers are Odd");
            }
            else if(A%2 == 0 && B%2 == 0) {
            System.out.println("Both the numbers are Even");
            }
            else if(A%2 == 1 && B%2 == 0) {
            System.out.println("A is Odd & B is Even");
            }
            else{
            System.out.println("A is Even & B is Odd");
            }
        }   
        else if (X.equals("8")) {
            System.out.println("Sum is " + ((double)A+B));
            System.out.println("Difference is = " + ((double)A-B));
            System.out.println("Product is = " + ((double)A*B));
            System.out.println("Quotient is = " + ((double)A/B));
            System.out.println("Remainder is = " + ((double)A%B));
            if (A>B) {
                    System.out.println("A is greater than B \n i.e B is smaller than A");
            }
                else if (A<B) {
                    System.out.println("B is greater than A \n i.e A is smaller than B");
                }
                else {
                    System.out.println("A is equal to B");
                }
            if(A%2 == 1 && B%2 == 1) {
                System.out.println("Both the numbers are Odd");
            }
                else if(A%2 == 0 && B%2 == 0) {
                System.out.println("Both the numbers are Even");
                }
                else if(A%2 == 1 && B%2 == 0) {
                System.out.println("A is Odd & B is Even");
                }
                else {
                System.out.println("A is Even & B is Odd");
                }
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
    sc.close();
}   
}


