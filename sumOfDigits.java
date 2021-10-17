import java.util.Scanner;

public class sumOfDigits {

        public static void main(String[] args) {
            int n;
            int sum = 0;

            Scanner input = new Scanner(System.in);

            System.out.println("enter a value : ");
            n = input.nextInt();
            while (n > 0) {
                int temp = n % 10;
                sum = sum + temp;
                n = n / 10;

            }
            System.out.println(sum);
        }

}
