import java.util.Random;



// VARIABLES scope
// Local = declared inside a method visible only to that method

// Global = declared outside a method but within a class visible to all parts of a class



public class DiceRoller {

    int number;
    Random random;
    


    // constructor
    DiceRoller () {
        random = new Random();
        //roll();
    
        }



    
    void roll(int times) {
        number = random.nextInt(5)+1;
        System.out.println("you can roll just "+times+"\n");
        System.out.println( "your roll number is " + number);
    }


    public static void main(String[] args) {
        DiceRoller gambler_1 = new DiceRoller(); // Create an instance of DiceRoller
        gambler_1.roll(3);
    }





     
}

