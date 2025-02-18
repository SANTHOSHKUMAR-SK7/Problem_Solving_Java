import java.util.Arrays;
import java.util.Scanner;

public class ArrayImplementation {
    public static void main(String[] args) {
        //int[] arr = new int[5];//declaration
      int[]  arr={-21,2,53,53,4,4,65};
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        int result = binaryySearch(arr,37);
//        if(result != -1){
//            System.out.println(arr[result]+ " Target found at " + result);
//        }else {
//            System.out.println("NOT found"+ result);
//        }
        System.out.println(Arrays.toString(arr));
        int[] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));

    }
    public static int linearSearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] == target) {
             //  System.out.println("Target found at " + i);
               return i;
           }
        }
        //System.out.println("Target not found");
        return -1;
    }

    public static int binaryySearch(int [] arr,int target){
        int l =0;
        int h = arr.length-1;  //1 2 3 4 5
        while(l<=h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static int[] bubbleSort(int[] arr){
        for (int outer = 0; outer < arr.length; outer++) {
            for (int i = 0; i < arr.length-1-outer; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length-1-i;
           int maximum = greatestNo(arr,last);
           //swapping area
           int temp = arr[maximum];
          arr[maximum] = arr[last];
          arr[last] = temp;
        }
        return arr;
    }
    public static int greatestNo(int[] arr,int last){
        int max=0;
        for (int i = 1; i <=last ; i++) {
            if(arr[i]>arr[i-1]){
                max= i;
            }
        }
        return max;
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[]left,int[]right){
        int[] result = new int[left.length + right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j< right.length){
            if(left[i]<right[j]){
              result[k]= left[i];
              i++;
              k++;
            }else{
                result[k]= right[j];
                j++;
                k++;
            }
        }
        while (i< left.length){
            result[k]=left[i];
            i++;
            k++;
        }
        while (j< right.length){
            result[k]=right[j];
            j++;
            k++;
        }
        return result;
    }

}
