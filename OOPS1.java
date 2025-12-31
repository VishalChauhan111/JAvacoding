import java.util.*;
import bank.*;

class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class OOPS1 {
    public static void main(String arg[]){
//        bank.Account account1 = new bank.Account();
//        account1.name ="customer";
    }
}
