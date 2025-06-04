

public class Fish implements Predator, Prey {


    @Override
    public void flee () {
        System.out.println("Fish is fleeing as a prey");

    }


    @Override
    public void hunt () {
        System.out.println("Fish is hunting as a predator");
    }


    
}
