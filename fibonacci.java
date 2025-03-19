public class fibonacci {
    int st=0;
    int pre=0;
    int next=1;
    int current =0;
    public static void main(String[] args) {
        fibonacci f = new fibonacci();
        f.fibo(0,1);
    }
     void fibo(int pre,int next){
        current=pre+next;
        pre=next;
        next=current;
        System.out.print(current+" ");
        if(current>100){
            return;
        }
        fibo(pre, next);
    }
}
