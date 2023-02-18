package JAVA.Tutorial.ClassesANDObjects;
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Created a constructor:");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a horse:");
    }
    public void walk(){
        System.out.println("Walks on four legs");
    }
}
class Hen extends Animal{
    public void walk(){
        System.out.println("Walks on two legs");
    }
}
public class AbstractionConcept {
    public static void main(String[] args){
        Horse H=new Horse();
        H.walk();
    }
}
