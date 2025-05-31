package package2;
import package1.*;

public class C {


    // no modifier
    // basiclly availabe to classes in the SAME package folder
     String no_modiefier_text = "This is def";


     // public modifier
    //  availabe to all classes in ANY package folder { internal or external }
    public String public_text = "This is a public txt";


    // protected modifier
    // availabe to all child classes that extends from this current parent class 
    // in any package folder, internal or external
    // cc A.java for the sample


    // private modifier
    //  is only availabe to the class in which it was defined not even class 
    // in same  package folder or external
    private String private_text = "This is a private txt";

   
    

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.private_text);
    
}


}