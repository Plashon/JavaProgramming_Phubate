import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height (cm.)");
        double height = input.nextDouble();
        System.out.print("Enter your weight (kg.)");
        double weight = input.nextDouble();
        double heightM = height / 100;
        double BMI = weight / (heightM * heightM);
        System.out.println("Your BMI = " + BMI);

        String status = " ";
        if (BMI >= 30)
            status = "Very fat";
        else if (BMI >= 25)
            status = "fat";
        else if (BMI >= 23)
            status = "Over Weight";
        else if (BMI >= 18)
            status = "Normal";
        else
            status = "Too skinny";

        System.out.println("You are : " + status);

    }
}