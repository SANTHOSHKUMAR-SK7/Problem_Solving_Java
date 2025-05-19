package Recursion;

public class Recursion_Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        int fact=1;
        if(n<=1){
            return 1;
        }
        fact=n*fact(n-1);
        return fact;
    }
}
