package Recursion;

public class Recursion_Sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={1,2,3,4,5,6,7,5};
        System.out.println("First Array is sorted array : "+sort(arr,0));
        System.out.println("Second Array is sorted array : "+sort(arr2,0));
    }
    static boolean sort(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sort(arr,index+1);
    }
}
