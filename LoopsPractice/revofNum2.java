import java.util.*;
public class revofNum2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to reverse :)");
        int num= sc.nextInt();
        int rev=0;
        while (num>0) {
            int lastDig= num%10;
            rev= (rev*10)+lastDig;
            num= num/10;
        }
    System.out.println(rev);
    }
}
