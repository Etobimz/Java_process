public class Boat extends Vehicle {


    // already in the suoer class constructor not needed anymore
    double speed;
    String name;





    Boat(double speed, String name) {
            super(speed, name);
            //TODO Auto-generated constructor stub
        }
    



    @Override
    void mov_1() {
        // TODO Auto-generated method stub
       System.out.println("Overridden but testing polymorhism, objects with more than one Dtypes");
    }
    
}
