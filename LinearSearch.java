public class LinearSearch {
    public static void main(String[] args) {
        String str = "SANTHOSH";
        char ch ='T';
        if(Search(str,ch)==-1){
            System.out.println("Element is not found");
        }
        else {
            System.out.println("Element found at "+Search(str,ch));
        }

    }
    static int Search(String str,char ch){
        for(int i = 0 ; i<str.length();i++){
            if(ch == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

}
