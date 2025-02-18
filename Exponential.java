import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter a num2 : ");
        int num2 = scan.nextInt();

        int result = expo(num1, num2);
        System.out.println(result);
    }
        static int expo ( int num1, int num2){
            int power = (int) Math.pow(num1, num2);
            return power;
        }
}