public abstract class Vehicle {


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

    void  moves() {
        System.out.println("All vehcles moves");
    }


    
    //cc the error from trying to name or put some features or todo in a methodwith "abstract" keyword
    // void abstract moves_1() {
        // System.out.println("All vehcles moves"); }

        abstract void  mov_1(); 
    






    
}
