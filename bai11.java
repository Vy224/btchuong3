public class bai11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "");
            if (i % 2 == 0) {
                System.out.println(" EVEN");
            } else {
                System.out.println(" UNEVEN");
            }
        }
    }
}
