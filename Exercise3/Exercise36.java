import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int i = 1;
        // = input.nextInt();

        double result, i;
        result = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                result = result * i;
            }
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                                                                                ");
        System.out.println("The result of multiplying even numbers from 1 to 100. = "+ result);
        System.out.println("                                                                                 ");
        System.out.println("---------------------------------------------------------------------------------");
    }
}