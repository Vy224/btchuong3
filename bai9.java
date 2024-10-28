public class bai9 {
    public static void main(String[] args) {
        int solonnhatchiahetcho7 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i > solonnhatchiahetcho7) {
                solonnhatchiahetcho7 = i;
            }
        }
        System.out.println("The biggest number divisible by 7 in the range of 1 to 100 is: " + solonnhatchiahetcho7);
    }
}
