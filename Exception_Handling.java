import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Exception_Handling obj = new Exception_Handling();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int a = in.nextInt();
        System.out.print("Enter num2 : ");
        int b = in.nextInt();
        String s = "SANTHO";
        try{
            System.out.println(obj.division(a,b));
        }catch (Exception msg) {
            System.out.println("Divided by zero");
        }finally {
            System.out.println("It will run automatically whether there is error occur or not");
        }
    }

    double division(int a , int b){
        if(b == 0){
            throw new ArithmeticException();
        }
        return (double)a/(double)b;
    }
}
