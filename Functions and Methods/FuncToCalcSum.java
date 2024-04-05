import java.util.*;
public class FuncToCalcSum {
    
    public static int calculateSum(int num1,int num2 ){ // >> these are the parameters 
        
        int sum= num1+num2;
        return sum;
    
    
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b= sc.nextInt();
        int sum= calculateSum(a, b); // arguments 
        System.out.println("Sum is: "+ sum);
        calculateSum(a,b);
    }
}
