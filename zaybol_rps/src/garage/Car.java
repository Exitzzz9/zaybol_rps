package garage;

public class Car extends Vehicle {

    protected int numOfSeatbelts;

    public int getNumOfSeatbelts() {
        return numOfSeatbelts;
    }

    public void setNumOfSeatbelts(int numOfSeatbelts) {
        this.numOfSeatbelts = numOfSeatbelts;
    }

    public Car(String color, String regNo, int yearOfManufacturing, int numOfSeatbelts) {

        super(color, regNo, yearOfManufacturing);
        this.numOfSeatbelts = numOfSeatbelts;
    }

}

