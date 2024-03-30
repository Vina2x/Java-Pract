public class ContinueWithoutOdd {
    public static void main(String[] args){
        for (int i = 1; i <=10; i++) {
            if (i%2!=0) { //this will basically help us in skipping all the odd numbers in the given range above
                continue;
            }
            System.out.println(i);
        }
    }
}
