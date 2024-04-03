//Printing star pattern using nested loops

public class Star {
    public static void main(String[]args){
        int n=5;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star<=line; star++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
