import java.util.*;
public class primeChecker{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int n= sc.nextInt();
        boolean isPrime=true;
        if (n==2){
            System.out.println(n + " is a prime number!");
        }
        else{
            for (int i = 2; i<=Math.sqrt(n); i++) {
                if (n%i==0){ //n is a multiple of i (and i is not equal to 1 or n)
                    isPrime=false;
                }
            }
            if (isPrime){
                System.out.println(n + " is a prime number!");
            }
            else{
                System.out.println(n + " is not a prime number!");
            }

    }

    }
}