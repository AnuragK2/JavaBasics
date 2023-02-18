package JAVA.Tutorial.ClassesANDObjects;

interface Animals{
    public void walk();
}
interface Herbivore{
    
}
class Horse implements Animals, Herbivore{                          //multiple inheritance
    public void walk(){
        System.out.println("Walks on 4 legs:");
    }
}

public class IntefaceConcept {
    public static void main(String[] args){
        Horse h=new Horse();
        h.walk();
    }
}
