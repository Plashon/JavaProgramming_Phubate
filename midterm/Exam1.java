import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amout : ");
        int amout = input.nextInt();
        float sum = 0;

        for (int i = 1; i <= amout; i++) {
            System.out.print("Enter price for product piece " + i + " : ");
            float price = input.nextFloat();
            sum = sum + price;
        }
        System.out.println("total price " + sum + " bath");
        System.out.print("money received from customers : ");
        float pay = input.nextFloat();
        float change = pay - sum;
        System.out.println("change money to customer " + change + " bath");
    }
}