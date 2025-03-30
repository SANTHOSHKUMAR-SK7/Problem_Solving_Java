import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Recursion_LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr={1,5,4,2,6,7,4,8};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the value to be search : ");
        int target=scan.nextInt();
        System.out.println("Element found in first index at :"+searchFirstIndex(arr,target,0));
        System.out.println("Element found in last index at :"+searchLastIndex(arr,target,arr.length-1));
        SearchAllIndex(arr,target,0);
        System.out.println("Elements found at "+list);
    }
    static int searchFirstIndex(int[] arr,int target,int index){
        if(index>arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchFirstIndex(arr,target,index+1);

    }
    static int searchLastIndex(int[] arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchLastIndex(arr,target,index-1);

    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void SearchAllIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        SearchAllIndex(arr,target,index+1);
    }
}
