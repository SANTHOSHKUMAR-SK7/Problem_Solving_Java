public class Recursion {
    public static void main(String[] args) {
        num(5);
        System.out.println("---------------------------------------------");
        numRev(5);
    }
    static void num(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        num(n-1);
    }
    static void numRev(int n){
        if(n==0){
            return;
        }
        numRev(n-1);
        System.out.println(n);
    }
}
