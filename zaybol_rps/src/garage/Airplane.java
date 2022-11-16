package garage;

public class Airplane extends Vehicle {

    protected int numOfWings;

    public int getNumOfWings() {
        return numOfWings;
    }

    public void setNumOfWings(int numOfWings) {
        this.numOfWings = numOfWings;
    }

    public Airplane(String color, String regNo, int yearOfManufacturing, int numOfWings) {

        super(color, regNo, yearOfManufacturing);
        this.numOfWings = numOfWings;
    }



}

