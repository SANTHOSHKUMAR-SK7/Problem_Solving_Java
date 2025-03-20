public class FactorialOfN {
    public static void main(String[] args) {
        Fact(5);
    }
    static void Fact(int n){
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
