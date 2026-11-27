import java.util.*;

public class Code07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0, zeros = 0;

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);

        sc.close();
    }
}