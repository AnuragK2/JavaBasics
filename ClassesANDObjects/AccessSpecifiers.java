package JAVA.Tutorial.ClassesANDObjects;

class bank{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getpassword(){
        return this.password;
    }
    public void setpassword(String pass){
        this.password=pass;
    }
}

public class AccessSpecifiers {
    public static void main(String[] args){
        bank b1=new bank();
        b1.name="Anurag";
        b1.email="anurag2404@gmail.com";
        b1.setpassword("anurag123");
        System.out.println(b1.getpassword());
    }
}
