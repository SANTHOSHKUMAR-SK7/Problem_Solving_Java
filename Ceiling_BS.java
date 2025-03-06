public class Ceiling_BS {
    public static void main(String[] args) {
        int [] arr={1,3,4,5,7,9,55,60,77};
        int target = 10;
        System.out.println( celing(arr,target));

    }

    static int celing(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
        }
        return arr[start+1];
    }
}
