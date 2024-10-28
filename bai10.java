public class bai10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the numbers divisible by 7 between 1 and 100 is: " + sum);
    }
}
