import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Binary value ");
        int binary=scan.nextInt();
        int tempbinary=binary;
        int decimal=0;
        int n=0;
        while(binary>0){
            int temp=binary%10;
            decimal= (int) (decimal+temp*Math.pow(2,n));
            n++;
            binary=binary/10;
        }
        System.out.println("Decimal value for "+tempbinary+" is "+decimal);
    }
}
