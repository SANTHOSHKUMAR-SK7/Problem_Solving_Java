public class CommonElementsInAllRow {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {1,3,5},
                {4,3,1}
        };
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i< matrix.length;i++){
            boolean isCommon=true;
            int current=matrix[0][i];

            for(int j=0; j< row;j++){
                boolean found=false;
                for(int k=0; k<col ; k++){
                    if(matrix[j][k]==current){
                        found=true;
                        break;
                    }
                }
                if(!found){
                    isCommon=false;
                    break;
                }
            }

            boolean printAlready =false;
            for(int z=0;z<i;z++){
                if(matrix[0][z]==current){
                    printAlready=true;
                    break;
                }
            }

            if(isCommon && !printAlready){
                System.out.print(current+" ");
            }
        }
    }
}
