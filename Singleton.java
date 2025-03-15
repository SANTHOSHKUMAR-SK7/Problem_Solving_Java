public class Singleton {
    private static Singleton obj;
    private Singleton(){}
    static Singleton getObj(){
        if (obj == null) {
            obj= new Singleton();
            System.out.println(obj);
        }
        System.out.println(obj);
        return obj;
    }
    void display(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Singleton obj1=Singleton.getObj();
        Singleton obj2=Singleton.getObj();

        obj1.display("This is for obj1");
        obj2.display("This is for obj2");

        if(obj1==obj2){
            System.out.println("true");
        }
    }
}
