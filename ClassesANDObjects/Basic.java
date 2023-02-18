package JAVA.Tutorial.ClassesANDObjects;

class Pen{
    String color;
    String Type;
    public void write(){
        System.out.println("Anything: ");
    }
    public void PrintColor(){
        System.out.println(this.color);
    }
    public void PrintType(){
        System.out.println(this.Type);
    }
}
class Student{
    String name;
    int roll;
    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.roll);
    }
}

public class Basic {
    public static void main(String[] args){
        Pen Pen1=new Pen();
        Pen Pen2=new Pen();
        Pen1.color="Blue";
        Pen2.color="Red";
        Pen1.Type="Gel";
        Pen2.Type="Dot";
        Pen1.PrintColor();
        Pen1.PrintType();
        Pen2.PrintColor();
        Pen2.PrintType();
        Pen1.write();
        Pen2.write();
        Student S=new Student();
        S.name="Anurag";
        S.roll=1236;
        S.PrintInfo();
    }
}
