public class bai13 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i && j < n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j >= i && j < n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}