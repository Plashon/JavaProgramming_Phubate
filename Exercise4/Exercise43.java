import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amout : ");
        int n = input.nextInt();
        System.out.print("Enter price : ");
        int x = input.nextInt();
        int result = n*x;
        System.out.println("Total price : "+ result);

    }
}
