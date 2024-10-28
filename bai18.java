public class bai18 {
    public static void main(String[] args) {
        int[] chuoi = new int[10];
        chuoi[0] = 1;
        int[] increments = {6, 9, 21, 42, 94};
        for (int i = 1; i < chuoi.length; i++) {
            if (i <= increments.length) {
                chuoi[i] = chuoi[i - 1] + increments[i - 1];
            } else {
                chuoi[i] = chuoi[i - 1] + increments[increments.length - 1];
            }
        }
        for (int number : chuoi) {
            System.out.print(number + " ");
        }
    }
}