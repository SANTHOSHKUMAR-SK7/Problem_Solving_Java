import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int target = -1;
        if(binary(arr,target)==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at "+binary(arr,target));
        }

    }

    static int binary(int[] arr,int tar){
        Arrays.sort(arr);
        int right=arr.length-1;
        int left=0;

        while (left<=right){
            int mid = (right+left)/2;
            if (arr[mid]==tar){
                return mid;
            }
            else if (arr[mid]>tar) {
                right=mid-1;
            }
            else if (arr[mid]<tar) {
                left=mid+1;
            }
        }
        return -1;
    }
}
