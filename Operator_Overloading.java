public class Operator_Overloading {

    double real;
    double imaginary;
    Operator_Overloading(double real,double imaginary){
        this.imaginary=imaginary;
        this.real=real;
    }

    Operator_Overloading complexAdd(Operator_Overloading obj2){
        real = this.real+obj2.real;
        imaginary= this.imaginary+obj2.imaginary;
        return new Operator_Overloading(real,imaginary);
    }

    void display(){
        System.out.println(real+" + "+imaginary+"j");
    }
    public static void main(String[] args) {
        Operator_Overloading obj1 = new Operator_Overloading(12,12);
        Operator_Overloading obj2 = new Operator_Overloading(13,1);

        Operator_Overloading add=obj1.complexAdd(obj2);
        add.display();
    }
}
