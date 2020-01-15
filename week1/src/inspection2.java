import java.util.Random;

public class inspection2 {

    /* Without changing the code what is the contents of a at the end of a run?
    */
    public static void main(String[] args){
        int[] a = new int[10];
        Random rand = new Random(10);
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(10);
        }
        System.out.print(a);
    }
}
