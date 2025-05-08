package Package2;

import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String hex;
        System.out.print("Enter the HexDecimal value : ");
        hex=scan.nextLine();
        String digits="0123456789ABCDEF";
        hex=hex.toUpperCase();
        int val=0;
        for(int i=0;i<hex.length();i++){
            char c=hex.charAt(i);
            int d=digits.indexOf(c);
            val=16*val+d;
        }
        System.out.println("The decimal value is : "+val);
    }
}
