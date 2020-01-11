public class Problem5 {

    /** In this program we attempt to multiply matices
    *   the gaol is AB = C. What went wrong?
    *   how can you fix it?
     *
     *   should print:
     *   3, 4,
     *   2, 17,
     *
     *   Hint: 3
    */
    public static void main(String[] args){
        int[][] a = {{1,0},{0,1}};
        int[][] b = {{3,4},{2,17}};
        int[][] c = {{0,0},{0,0}};

        for(int i = 0; i < c.length; i++){
            for(int j = 0; i < c[i].length; j++) {
                c[i][j] = dot(a,b,i,j) + c[i][j];
            }
        }

        for (int [] row: c ) {
            for(int col: row){
                System.out.print(col + ", ");
            }
            System.out.println();
        }
    }

    public static int dot(int[][] a, int[][] b, int i, int j){
        int dot = 0;
        for(int k=0; k < a.length; i++){
            dot+= a[i][k]*b[j][k];
        }
        return dot;
    }
}
