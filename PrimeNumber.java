import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Prime=1;
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        for(int i =2; i<num;i++)
        {
            if(num%i == 0){
                System.out.println("It is a not PrimeNumber");
                Prime = 0;
                break;
            }
        }
        if(Prime==1){
            System.out.println("It is a Prime Number");
        }
    }
}
