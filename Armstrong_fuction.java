import java.util.Scanner;

public class Armstrong_fuction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = scan.nextInt();
        printResult(num);


    }

    public static boolean isArmstrong(int num) {

        int count = 0;
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            count++;

        }
        int temp2 = num;
        while (temp2 != 0) {
            int digit = temp2 % 10;
            sum = sum + (int) Math.pow(digit, count);
            temp2 = temp2 / 10;
        }

        return sum == num;
    }

    public static void printResult(int num) {
        if (isArmstrong(num)) {
            System.out.println(num + " is a Armstrong number");

        } else {
            System.out.println(num + " not a armstrong number");
        }
    }
}