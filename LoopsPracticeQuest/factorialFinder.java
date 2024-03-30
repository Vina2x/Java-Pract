/*Program to find the factorial of any number entered by the user. */

import java.util.*;
public class factorialFinder {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int facto=1;

        do {
            facto*=number;
            number-=1;
        } while (number>=1);

        System.out.println("Factorial is: "+facto);
    }
}
