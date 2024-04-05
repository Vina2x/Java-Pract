import java.util.*;
public class FuncToProdAandB {
    public static int multiply(int a, int b){
        int product= a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b= sc.nextInt();
        int prod= multiply(a, b);
        System.out.println("A x B = "+ prod);
    }
}
