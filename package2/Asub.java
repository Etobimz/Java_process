package package2;
import package1.*;

public class Asub extends A {

    public static void main(String[] args) {



    C c = new C();

    System.out.println(c.no_modiefier_text);
    System.out.println(c.public_text);


    
    Asub asub = new Asub();
    System.out.println(asub.protected_text);




        
    }
    

    
}
