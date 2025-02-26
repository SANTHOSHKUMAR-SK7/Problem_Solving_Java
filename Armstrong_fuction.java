import java.util.Scanner;

public class Armstrong_fuction {
    public static void main(String[] args) {
        System.out.println("Armstrong Numbers are : ");
        int count=0;
        for(int i = 1;i<1000;i++){

            if(isArmstrong(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println();
        System.out.println("There are "+count+" Armstrong numbers");
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
}