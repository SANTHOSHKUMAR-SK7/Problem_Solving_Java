public class Count_Zeros {
    static int count=0;
    public static void main(String[] args) {
        int num = 12000001;
        int sum=Count(num);
        System.out.println(sum);
    }
    static int Count(int num){

        while (num > 0) {
            int temp=num%10;
            if(temp==0){
                count++;
            }
            return Count(num/10);
        }
        return count;
    }
}
