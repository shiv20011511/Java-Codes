package quiz;



public class MethodOverloading {
    //making a calculator With goal of method overloaading
    int calculate(int a,int b){
        System.out.println("ADD");
        return a+b;


    }
    float calculate(float a,float b){
        System.out.println("divide");
        return a/b;

    }
    double calculate(double a,double b){
        System.out.println("Multiply");
        return a*b;
    }
    short calculate(short a,short b){
        System.out.println("sub");
        return (short) (a-b);
    }
    public static void main(String args[]){
        MethodOverloading m=new MethodOverloading();
        System.out.println(m.calculate((short)5,(short)2));

    }
}
