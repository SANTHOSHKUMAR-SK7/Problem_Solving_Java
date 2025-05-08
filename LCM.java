public class LCM {
    public static void main(String[] args) {
        int num1=20;
        int num2=40;
        int hcf=0;
        int lcm=0;
        int min=num1<num2?num1:num2;
        while (min>2){
            if(num1%min==0 && num2%min==0){
                hcf=min;
                break;
            }
        }
        lcm=(num1*num2)/hcf;
        System.out.println(lcm);
    }
}

