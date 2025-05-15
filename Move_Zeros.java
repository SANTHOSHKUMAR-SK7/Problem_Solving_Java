import java.util.Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        int[] mat={4,5,0,1,9,0,5,0};
        int[] temp=new int[mat.length];
        int k=0;
        for(int i=0;i<mat.length;i++){
            if(mat[i]!=0){
                temp[k++]=mat[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
