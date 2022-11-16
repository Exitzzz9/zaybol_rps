package garage;

public abstract class Vehicle {
    protected String color, regNo;
    protected int yearOfManufacturing;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public Vehicle(String color, String regNo, int yearOfManufacturing) {
        this.color = color;
        this.regNo = regNo;
        this.yearOfManufacturing = yearOfManufacturing;
    }

}

