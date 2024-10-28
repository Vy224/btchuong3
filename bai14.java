public class bai14 {
    public static void main(String[] args) {
       int chieucao = 4;
       for (int i = 1; i <= chieucao; i++) {
           for (int j = 1; j <= chieucao - i; j++) {
               System.out.print("     ");
           }
           for (int k = 1; k <= 2 * i - 1; k++) {
               System.out.print("  *  ");
           }
           System.out.println();
       }
    }
}
