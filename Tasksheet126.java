class Vehicle{
    String make;
    String model;
    int year;

        Vehicle(String make, String model, int year){
        this.make=make;
        this.model= model;
        this.year= year;
    }
}

class Car extends Vehicle{
    
    int numOfDoors;

        Car(String make, String model, int year, int numOfDoors){
        super(make, model, year);
        this.numOfDoors=numOfDoors;
    }

    public void carDetails(){
        System.out.println("Car Details:");
        System.out.println("Make: "+ make);
        System.out.println("Model: "+ model);
        System.out.println("Year: "+ year);
        System.out.println("Number of Doors: "+ numOfDoors);

    }

}


public class Tasksheet126 {
    public static void main(String[] args) {
        Car car1= new Car("Honda", "Civic", 2015, 4);

        car1.carDetails();
    }
}
