public class Recursion_BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,78,99,100,111,123,234,345};
        int result =BSearch(arr,4,0,arr.length-1);
        if(result<0){
            System.out.println("Not found");
        }
        else System.out.println("Found at "+result+" index");
    }
    static int BSearch(int[] arr,int target,int st,int end){
        if(st>end){
            return -1;
        }
        int mid= st + (end - st)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (target < arr[mid]) {
            return BSearch(arr,target,st,mid-1);
        }
        return BSearch(arr,target,mid+1,end);
    }
}
