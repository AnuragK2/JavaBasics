package JAVA.Tutorial.ClassesANDObjects;

class Student{
String name;
int age;
public void PrintInfo(String name){
    System.out.println(name);
}
public void PrintInfo(int age){
    System.out.println(age);
}
public void PrintInfo(String name, int age){
    System.out.println(name+" "+age);
}
}
public class FnOverloading{
    public static void main(String[] args){
        Student s=new Student();
        s.name="Anurag";
        s.age=20;
        s.PrintInfo(s.name);
        s.PrintInfo(s.age);
        s.PrintInfo(s.name,s.age);
    }
}