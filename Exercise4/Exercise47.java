import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number(1) : ");
        int a = input.nextInt();
        System.out.print("Enter number(2) : ");
        int b = input.nextInt();
        if (a > b) {
            System.out.println("a more than b");
        } else {
            if (a < b) {
                System.out.println("b more than a");
            } else {
                System.out.println("a equal to b");
            }
        }
    }

}
