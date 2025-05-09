import java.util.Arrays;

public class SprialTraversalMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int RowLow=0;
        int RowUp= matrix.length-1;
        int ColUp=matrix[0].length-1;
        int ColLow=0;

        while (RowLow<=RowUp && ColLow<=ColUp) {

            //FROM LEFT TO RIGHT
            for (int i = ColLow; i <= ColUp; i++) {
                System.out.print(matrix[RowLow][i] + " ");
            }
            RowLow++;

            //TOP TO BOTTOM
            for (int i = RowLow; i <= RowUp; i++) {
                System.out.print(matrix[i][ColUp] + " ");
            }
            ColUp--;

            //LEFT TO RIGHT
            if(ColUp>ColLow){
                for (int i = ColUp; i >= ColLow; i--) {
                    System.out.print(matrix[RowUp][i] + " ");
                }
                RowUp--;

            }

            //BOTTOM TO UP
            if(RowUp>RowLow){
                for(int i=RowUp;i>=RowUp;i++){
                    System.out.print(matrix[i][ColLow] + " ");
                }
                ColLow++;
            }

        }

    }
}