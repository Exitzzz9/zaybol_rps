package garage;
import java.util.ArrayList;

public class Garage {
    public static ArrayList <Vehicle> vehicleList = new ArrayList<Vehicle>();
    static void initalizeParking(){
        vehicleList.add(new Boat("yellow", "Yu-20", 1997, 1));
        vehicleList.add(new Car ("black", "YH-1029Y", 1960, 4));
        vehicleList.add(new Airplane("white", "BO0982", 1998, 2));
        vehicleList.add(new Motorcycle("brown", "K1P0", 2010, 4));
        vehicleList.add(new Bus("green", "TR7", 2015, 6));
    }

    public static void parkVehicle() {
        System.out.println("Do you want to park your vehicle?");


    }
}
