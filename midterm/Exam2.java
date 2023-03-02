import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amout of number : ");
        int n = input.nextInt();
        int odd = 0;
        int even = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        System.out.println("Number of even number : " + even);
        System.out.println("Number of odd number : " + odd);
    }

}
