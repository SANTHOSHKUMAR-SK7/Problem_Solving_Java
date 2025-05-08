public class GCF {
    public static void main(String[] args) {
        int num1=20;
        int num2=30;
        int min=num1>num2?num1:num2;
        while(min>2){
            if(num1%min==0 && num2%min==0){
                System.out.println(min);
                break;
            }
            else min--;
        }
    }
}
