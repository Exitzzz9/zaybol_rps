package garage;

public class Bus extends Vehicle {
    protected int numOfWheels;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Bus(String color, String regNo, int yearOfManufacturing, int numOfWheels) {
        super(color, regNo, yearOfManufacturing);
        this.numOfWheels = numOfWheels;
    }




}
