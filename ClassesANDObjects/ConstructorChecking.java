package JAVA.Tutorial.ClassesANDObjects;

class Student{
    String name;
    int roll;
    int age;
    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.age);
    }
    Student(String name,int roll,int age){
        this.name=name;
        this.roll=roll;
        this.age=age;
    }
}

public class ConstructorChecking {
    public static void main(String[] args){
        Student s=new Student("Anurag", 1236, 20);
        s.PrintInfo();
    }
}
