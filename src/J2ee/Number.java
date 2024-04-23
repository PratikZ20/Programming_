package J2ee;

public class Number {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;

        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even divisors: " + count);
    }
}
