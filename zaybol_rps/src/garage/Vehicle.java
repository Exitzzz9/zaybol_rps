package garage;
import java.util.Scanner;

public abstract class Vehicle {
    protected String color;
    protected static String regNo;
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
    public static void getVehicleByRegNo() {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Please enter the registration number you are looking for: ");
        String userInput = keyboardInput.nextLine();
        if (userInput == regNo)
            System.out.println("Here is the number" + regNo);

    }

}

