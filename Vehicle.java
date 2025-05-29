public class Vehicle {
    double speed;
    String name;

    Vehicle (double speed, String name) {
        this.speed = speed;
        this.name = name;
    }


    public String toString(){
        return this.name;

    }



    void go() {

        System.out.println("This vehcle is moving");
    }

    void stop() {
        System.out.println("This vehcle is stopped");
    }

    void moves() {
        System.out.println("All vehcles moves");
    }










    
}
