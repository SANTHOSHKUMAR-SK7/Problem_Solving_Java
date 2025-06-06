import java.util.Arrays;

public class RotateClockwise {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(matrix));
        int len= matrix.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
