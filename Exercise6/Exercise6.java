import java.util.Scanner;

public class Exercise6 {
    // Method
    // check number
    // 1
    public void PrintType1(int num) {
        if (num == 0) {
            System.out.println(num + " is Zero");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    // 2
    public void printType2(int num) {
        if (num == 0) {
            System.out.println(num + " is Zero ");
        } else if (num % 2 == 0) {
            System.out.println(num + " is Even number");
        } else {
            System.out.println(num + " is odd number");

        }

    }

    // 5___________________ Parametter&Argument
    public void isPositive(int num, Scanner input) {
        while (num <= 0) {
            System.out.println("Please, enter positive a number ");
            num = input.nextInt();
        }
        System.out.println("this positive a number ");

    }

    // 6
    public void isOdd(int num, Scanner input) {
        while (num % 2 == 0) {
            System.out.println(" this not a odd number ");
            System.out.print("Please, enter odd number : ");
            num = input.nextInt();
        }
        System.out.println("this odd number ");

    }

    // 7
    public void isDividedByN(int n) {
        while (i <= n) {
            if ((i % x == 0)) {

                System.out.print(i + " , ");
            }

            i++;
        }
    }

    // check character
    // 3
    public void checkVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println("This character is a vowel.");
        } else {
            System.out.println("This character is not a vowel.");
        }
    }

    // 4
    public void checkChar(char c) {
        if (c >= 65 && c < 90) {
            System.out.println("This Character is in Uppercase!");
        } else if (c >= 94 && c <= 122) {
            System.out.println("This Character is in Lowercase!");
        } else {
            System.out.println("This not a letter");
        }
    }

    // public void checkChar(char c) {
    // if (Character.isUpperCase(c)) {
    // System.out.println("Character is in Uppercase!");
    // } else if (Character.isLowerCase(c)) {
    // System.out.println("Character is in Lowercase!");
    // } else {
    // System.out.println("It is not a letter");
    // }
    // }

    // to run code
    // public static void main(String[] args) {
    // Exercise6 ex = new Exercise6();
    // Scanner input = new Scanner(System.in);
    // System.out.print("Please, enter a Odd number : ");
    // int num = input.nextInt();
    // // 5ex.PrintType1(num);
    // // ex.printType2(num);
    // ex.isOdd(num, input);
    // }

    // public static void main(final String[] args) {
    // Exercise6 ex = new Exercise6();
    // Scanner input = new Scanner(System.in);
    // System.out.println("Please, enter a character");
    // String text = input.next();
    // char a = text.charAt(0);
    // // ex.checkVowel(c);
    // ex.checkChar(c);
    // }

    public static void main(String[] args) {
        Exercise6 ex = new Exercise6();
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter desired amount : ");
        int n = input.nextInt();
        System.out.print("Please, enter desired amount : ");
        int x = input.nextInt();
        ex.isDividedByN(n);
    }
}
