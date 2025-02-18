import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a radius  : ");
        int rad = scan.nextInt();
        System.out.println("Perimeter of a circle : "+perimeter(rad));

    }
    static double perimeter(int rad){

        double Perimeter = 2 * Math.PI * rad;
        return Perimeter;
    }
}
