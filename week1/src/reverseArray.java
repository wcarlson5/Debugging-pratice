import java.util.Arrays;

public class reverseArray {
 /** In this program we attempt to reverse an array and print it out
 *
 *   Hint: 2 errors
 */
    public static void main(String[] args){
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = i;
        }

        int[] b = new int[a.length];

        for(int i=1; i <= b.length; i++){
            b[i-1] = a[a.length-1-i];
        }

        System.out.println(b);
    }
}
