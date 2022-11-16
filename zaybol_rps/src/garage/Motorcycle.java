package garage;

public class Motorcycle extends Vehicle {
    protected int numOfWheels;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Motorcycle(String color, String regNo, int yearOfManufacturing, int numOfWheels) {

        super(color, regNo, yearOfManufacturing);
        this.numOfWheels = numOfWheels;
    }




}
