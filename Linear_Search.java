public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {4,3,5,7,8,1};
        int val = 8;
        int Target = Linear_fun(arr,val);
        if(Target!=-1){
            System.out.println("The Target element is at "+Target);
        }
        else{
            System.out.println("The Target element is not found");
        }
    }

    public static int Linear_fun(int arr[],int val) {
        for(int i=0;i< arr.length;i++){
            if (arr[i]==val) {
                return i;
            }
        }
        return -1;
    }
}
