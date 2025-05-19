package Recursion;

public class Recursion2 {
    static void print(int n){
        System.out.println(n+" passed into this method.....!");
        if(n==10){
            return;
        }
        print(n+1);
    }
    public static void main(String[] args) {
        print(1);
    }
}
