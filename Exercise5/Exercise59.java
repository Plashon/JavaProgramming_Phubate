import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your birtday year : ");
        int birthday_year = scan.nextInt();

        while (birthday_year >= 2566) {
            System.out.println("ท่านระบุข้อมูลผิด");
            System.out.print("Enter your birtday year : ");
            birthday_year = scan.nextInt();
        }
        birthday_year++;

        int sum = 2566 - birthday_year;
        System.out.println("Name : " + name);
        System.out.println("Age : " + sum);
    }
}