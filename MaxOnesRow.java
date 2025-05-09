public class MaxOnesRow {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,1},
                {0,1,1},
                {1,1,1}
        };
        int row=matrix.length;
        int col=matrix[0].length;
        int MaxOnes=0;
        int j=col-1;
        for(int i=0;i<row;i++){
            while(j>=0 && matrix[i][j]==1){
                MaxOnes=i;
                j--;
            }
        }
        System.out.println("Max ones Row "+MaxOnes);
    }
}
