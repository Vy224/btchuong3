public class bai8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        double average = (double) sum / 100;
        System.out.println("The average of all the integer numbers from 1 to 100 is: " + average);
    }
}
