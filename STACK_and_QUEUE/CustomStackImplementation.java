package STACK_and_QUEUE;

public class CustomStackImplementation {
    protected int[] data;
    private static final int DEFAULT_SIZE=15;
    int ptr=-1;//Initially its at -1,when the new value is added it increase the pointer

    public CustomStackImplementation(int size){
        this.data=new int[size];  // When size is passed through the constructor, it creates new int array of size passing
    }

    public CustomStackImplementation(){
        this(DEFAULT_SIZE); //When nothing is passed, it should use of default size
    }

    private boolean isFull(){
        return ptr==data.length-1; //Here ptr is at last index
    }

    private boolean isEmpty(){
        return ptr==-1;
    }

    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack is full...!");
            return false;
        }
        ptr++;
        data[ptr]=val;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Itz Empty");
        }
        return data[ptr--];
    }

//    public

}
