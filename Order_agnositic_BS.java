public class Order_agnositic_BS {
    public static void main(String[] args) {
        char[] ch = {'Z','y','a','j','d','a'};
        System.out.println(isAss(ch));

    }

    static boolean isAss(char[] ch){
        int st=0;
        int end=ch.length-1;
        if(ch[st]>ch[end]){
            return true;
        }
        return false;
    }
}
