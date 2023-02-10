import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter money(bath) : ");
        float bath = input.nextFloat();
        double money = bath / 35.5;
        // double dollar = 0.028169014084507043;
        // double money = bath * dollar;

        System.out.print("You have money  " + money + " dollar");

    }

}