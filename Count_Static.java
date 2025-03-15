public class Count_Static {
    static int count=0;
    static void countIncrement(){
        count++;
    }
    void display(){
        System.out.println("Count value :"+count);
    }
    public static void main(String[] args) {
        Count_Static.countIncrement();
        Count_Static.countIncrement();
        Count_Static.countIncrement();

        Count_Static obj = new Count_Static();
        obj.display();
    }
}
