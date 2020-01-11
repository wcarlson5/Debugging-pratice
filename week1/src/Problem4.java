import java.util.Random;

public class Problem4 {
    /* Without changing the code what is the length of a?
     */
    public static void main(String[] args){

        Random rand = new Random(11);
        int[] a = new int[len(rand)];
        System.out.print(a);

    }

    private static int len(Random rand){
        return rand.nextInt(10000);
    }
}
