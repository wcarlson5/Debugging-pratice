public class Problem3 {
    /* Without changing the code what is the contents of b at the end of a run?
     */
    public static void main(String[] args){
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = i;
        }

        int b[] = new int[a.length];

        for(int i=1; i <= b.length; i++){
            b[i-1] = a[a.length-i];
        }

        System.out.print(b);

    }
}
