import java.util.*;

public class Code01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter number 3");
        int num3 = sc.nextInt();

        float average = (num1 + num2 + num3) / 3.0f;

        System.out.println("The average is " + average);

        sc.close();
    }
}