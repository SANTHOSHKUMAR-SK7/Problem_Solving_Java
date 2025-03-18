public class Recursion {
    public static void main(String[] args) {
        msg();
        System.out.println();
        msg1();
     }
    static void msg(){
        System.out.println("hai");
        msg1();
    }
    static void msg1(){
        System.out.println("hai1");
        msg2();
    }
    static void msg2(){
        System.out.println("hai2");
    }
}
