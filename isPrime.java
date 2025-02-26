import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n){
        int i=2;
        if(n<=1){
            return false;
        }
        while (i*i <= n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
