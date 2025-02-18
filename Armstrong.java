import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, count = 0;

        int temp = num;

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count); // digit^digits
            temp /= 10;
        }
        if(num==sum)
        {
            System.out.println("It is armstrong");
        }
        else
        {
            System.out.println("Not a armstrong");
        }
    }
}
