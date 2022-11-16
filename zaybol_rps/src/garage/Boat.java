package garage;

public class Boat extends Vehicle {

    protected int numOfPropellers;

    public int getNumOfPropellers() {
        return numOfPropellers;
    }

    public void setNumOfPropellers(int numOfPropellers) {
        this.numOfPropellers = numOfPropellers;
    }

    public Boat(String color, String regNo, int yearOfManufacturing, int numOfPropellers) {
        super(color, regNo, yearOfManufacturing);
        this.numOfPropellers = numOfPropellers;
    }

    }


