import java.util.Random;

public class inspection1 {
    /* Without changing the code what is the contents of a at the end of a run?
     */
    public static void main(String[] args){
        int[] a = new int[10];
        Random rand = new Random(11);
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(10);
        }

        int b[] = a;

        for(int i=0; i < b.length; i++){
            b[i] = 0;
        }

        System.out.print(a);

    }
}
