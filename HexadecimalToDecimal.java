import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal :");
        String hex=scan.nextLine();
        hex=hex.toUpperCase();
        String digit="0123456789ABCDEF";
        int value=0;
        for(int i=0;i<hex.length();i++){
            char ch=hex.charAt(i);
            int d=digit.indexOf(ch);
            value=value*16+d;
        }
        System.out.println("Value of Hexadecimal "+hex+" in decimal is "+value);
    }
}
