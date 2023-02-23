import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width : ");
        int width = input.nextInt();
        System.out.print("Enter length : ");
        int length = input.nextInt();
        int area = width*length;
        System.out.println("Your area : " +area);

    }    
}
