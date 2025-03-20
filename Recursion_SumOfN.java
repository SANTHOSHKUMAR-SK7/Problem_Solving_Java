public class Recursion_SumOfN {
    public static void main(String[] args) {
        int sum=sum(10);
        System.out.println("SUM : "+sum);
        int Product=Product(5);
        System.out.println("PRODUCT : "+Product);
    }
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
    static int Product(int n){
        if(n<=1){
            return 1;
        }
        return n*Product(n-1);
    }
}
