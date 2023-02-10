import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int i = input.nextInt();

        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);

            }
        }
        i++;
    }
}