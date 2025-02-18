import java.util.Scanner;

public class Reverse_number_function {

    static int reverse(int a){
        int reverse=0;
        while (a!=0){
            int temp1=(a%10);
            reverse=reverse*10+temp1;
            a=a/10;
        }
        return reverse;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = input.nextInt();
        System.out.print("The reversed number is : "+reverse(a));

    }
}