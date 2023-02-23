import java.util.Scanner;
public class Exercise48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  =1 ;
        int sum = 0;
       
        do{
             sum = sum + n;
        n = n+1;
        }while(n>10);
        System.out.println(sum);;
    }
}
