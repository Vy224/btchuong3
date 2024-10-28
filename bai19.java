public class bai19 {
    public static void main(String[] args) {
        int sodau = 1;
        int congboi = 3;
        int soluongsohang = 10;
        int sohientai = sodau;
        for (int i = 0; i < soluongsohang; i++) {
            System.out.print(sohientai + " ");
            sohientai *= congboi;
        }
    }
}
