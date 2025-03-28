public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int rot=3;
        rotate(arr,rot);
        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    static void rotate(int[] arr,int rot){
            int len = arr.length;
            int k = rot % len;
            reverse(arr,0,len-1);
            reverse(arr,0,k-1);
            reverse(arr,k,len-1);
    }
    static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
