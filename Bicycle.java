public class Bicycle extends Vehicle {

    int wheels;
    String rider_gender;

    

    Bicycle (double speed, String name, String rider_gender) {

        super(speed, name);
        this.rider_gender = rider_gender;
        


    }

   
    public String toString(){
        return super.toString() + "  " + rider_gender ;

    }


    @Override
    void moves() {
        System.out.println("All bicycles moves with at least " + wheels + " wheels");
    }

    

    }
 
