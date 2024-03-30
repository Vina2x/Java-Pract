import java.util.*;
public class revOFNum {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);

       System.out.println("Enter the Number you want to reverse :)");
        int num= sc.nextInt();

        while (num>0){
            int lastDig= num%10;
            System.out.print(lastDig);
            num= num/10;
        }
    }
}
