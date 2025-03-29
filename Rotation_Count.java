public class Rotation_Count {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,0,1,2,3};
        for (int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                System.out.println(i-1);
            }
        }
    }
}
