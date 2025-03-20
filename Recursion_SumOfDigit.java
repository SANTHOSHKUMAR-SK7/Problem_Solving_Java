public class Recursion_SumOfDigit {
    public static void main(String[] args) {
        int sum=sum(324);
        System.out.println("SUM : "+sum);
        int Product=Product(3240);
        System.out.println("PRODUCT : "+Product);
    }
    static int sum(int n){
        if(n<2){
            return 1;
        }
        int temp=n%10;
        return temp+sum(n/10);
    }
    static int Product(int n){
        if(n%10==n){
            return n;
        }
        int temp=n%10;
        return temp*Product(n/10);
    }
}
