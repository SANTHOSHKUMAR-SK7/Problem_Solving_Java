import java.util.Arrays;

public class BS_InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 1, 1, 4, 5, 6, 6, 6, 8, 9, 11, 11, 12, 13, 14, 31, 31, 31, 31, 45, 46, 46, 54, 54, 64, 64, 64, 65, 65, 66, 68, 68, 84, 84, 86, 86, 94, 98, 148, 465, 468, 489, 564, 613, 645, 645, 654, 654, 684, 684, 686, 861, 864, 951, 4689, 8458, 8614, 9648, 9889, 45849};
        int target =64;
        ArraySize(arr,target);
    }

    static void ArraySize(int[] arr,int target){
        int start = 0;
        int end = 5;
        while(target>arr[end]){
            int newStart=end+1;
            end = end + (end - start +1)*2;
            start=newStart;
            binary(arr,target,start,end);
        }
    }
    static void binary(int[] arr , int target,int start,int end){
        while(start<end){
            int mid = start + (end - start)/2;
            if(target==arr[mid]){
                System.out.println("Found at "+mid);
                break;
            }
            else if (target > arr[mid]) {
                start=mid+1;
            }
            else if(target < arr [mid]){
                end = mid+1;
            }
            else System.out.println("Not found");
        }
    }
}
