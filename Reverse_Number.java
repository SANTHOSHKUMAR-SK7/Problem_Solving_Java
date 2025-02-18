import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = input.nextInt();
        int digit = 0;
        int reverse = 0;
        while(a!=0)
        {
            digit = a %10;
            reverse = reverse * 10 +digit;
            a=a/10;
        }
        System.out.println("The reversed number is : "+reverse);
    }
}