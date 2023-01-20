
import java.util.Scanner;
public class inputdata {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your Name : ");
        String name = input.nextLine();
        System.out.println("Enter your surname : ");
        String surname = input.nextLine();
        System.out.println("Enter your nickname : ");
        String nickname = input.nextLine();
         System.out.println("Enter your major : ");
        String major = input.nextLine();
        System.out.print("Enter your student ID :  ");
        int ID = input.nextInt();
       
        input.close();

        System.out.println("My name is " + name + " " + surname);
        System.out.println("My nickname is " + nickname);
        System.out.println("My student ID is " + ID);
        System.out.println("I am studying in " + major);
        
    }
        
    }

