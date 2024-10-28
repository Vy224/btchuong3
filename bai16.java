public class bai16 {
    public static void main(String[] args) {
        int sum = 0, sole = 3;
        for (int i = 0; i < 10; i++) {
            System.out.print(sum + " ");
            sum += sole;
            sole += 2;
        }
    }
}
