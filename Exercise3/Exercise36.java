import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 1;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                answer = answer * i;
                i++;
            }

        }

        System.out.println("ผลคูณของเลขคู่ตั้งแต่ 1 - 100 : " + answer);
    }
}