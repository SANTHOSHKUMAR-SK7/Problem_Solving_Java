public class Search_2D {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},{33,22,11},{22,55,66,77,88}};
        int tar = 22;
        search(arr,tar);
    }

    static void search(int[][] arr,int tar){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                    if(tar==arr[row][col]){
                        System.out.println("Element found at "+row+"th row ,"+col+"th col");
                    }
            }
        }
    }
}
