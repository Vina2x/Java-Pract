public class Breaktheloop {
    public static void main(String[] args){
        for (int i=1; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("value 3 reached, out of the loop!");

    }
    
}
