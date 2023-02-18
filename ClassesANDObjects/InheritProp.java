package JAVA.Tutorial.ClassesANDObjects;

class Shape{
    public void area(){
        System.out.println("Displays Area");
    }
}                                                           //single level inheritance
class triangle extends Shape{
    public void area(int h,int b){
        System.out.println(1/2*b*h);
    }
}
class EquilateralTriangle extends triangle{                 //multilevel inheritance
    public void area(int h,int b){
        System.out.println(1/2*b*h);
    }
}
class Circle extends Shape{                                 //heirarchial inheritance
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


public class InheritProp {
    public static void main(String[] args){
        triangle t1=new triangle();
        t1.area(6,6);
    
    }
}
