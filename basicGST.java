import java.util.*;
public class VDQ3 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the price of the Pencil:");
        float pencil= sc.nextFloat();
        System.out.print("Enter the price of the Pen:");
        float pen= sc.nextFloat();
        System.out.print("Enter the price of the Eraser:");
        float eraser= sc.nextFloat();
        float total= pencil+pen+eraser;
        float total_w_gst= total + total*(18f/100f);
        System.out.println("Your total bill is: "+ total_w_gst);

    }
}
