interface Animals{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animals{
    @Override
    public void groom(){
        // lather, rinse, repeat
        System.out.println("Grooming the Gorilla");
    }

    @Override
    public void pet(){
        // pet at your own risk
        System.out.println("Petting the Gorilla");
    }

    @Override
    public boolean feed(boolean timeToEat){
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Time to feed the Gorilla ");
            return true;
        }
        return false;
    }

}

public class Tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla=new Gorilla();

        gorilla.pet();
        gorilla.groom();
        gorilla.feed(true);
    }
}