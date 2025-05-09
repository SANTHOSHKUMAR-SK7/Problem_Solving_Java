import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int k=0;
        int median=0;
        int row= matrix.length;
        int col=matrix[0].length;
        int[] Matrix=new int[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<matrix[i].length;j++){
                Matrix[k++]=matrix[i][j];
                }
        }
        Arrays.sort(Matrix);
        System.out.println(Arrays.toString(Matrix));
        int MatrixLength=Matrix.length;
        if(MatrixLength%2==0){
            median = (Matrix[MatrixLength / 2 - 1] + Matrix[MatrixLength / 2]) / 2;

        }
        else median=Matrix[MatrixLength/2];
        System.out.println(median);
    }

}
