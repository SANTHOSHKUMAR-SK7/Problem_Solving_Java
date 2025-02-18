import java.util.Scanner;

public class Frequnency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = scan.nextInt();

        int[] occurance=new int[10];

        while(num!=0){
            int number = num % 10;
            occurance[number]++;
            num = num / 10;
        }

        for(int i = 0;i <=9;i++){
            if(occurance[i]>0){
                System.out.println("Digit  "+i+" "+"occur "+occurance[i]+" times");
            }
        }
    }
}
