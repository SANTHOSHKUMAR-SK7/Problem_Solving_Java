public class Recursion_Reverse {
    public static void main(String[] args) {
        Reverse(123);
        System.out.println(sum);
    }
    static int sum=0;
    static void Reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        Reverse(n/10);
        }
}
