import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int i = 1;
        // = input.nextInt();

        var gg, i;
        gg = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                gg = gg * i;
            }
        }
        System.out.println(gg);
    }
}