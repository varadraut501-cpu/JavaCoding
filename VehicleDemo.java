package JavaCoding;

// Vehicle Interface
interface Vehicle {
    String name = "Generic Vehicle";
    int maxPassenger = 0;
    int maxSpeed = 0;
}

// LandVehicle Interface
interface LandVehicle extends Vehicle {
    int numWheels = 4;

    void drive();
}

// SeaVehicle Interface
interface SeaVehicle extends Vehicle {
    int displacement = 1000;

    void launch();
}

// Car Class
class Car implements LandVehicle {

    @Override
    public void drive() {
        System.out.println("Car is driving on land.");
    }

    public void openDoor() {
        System.out.println("Car door opened.");
    }
}

// Ship Class
class Ship implements SeaVehicle {

    @Override
    public void launch() {
        System.out.println("Ship is launched in water.");
    }

    public void anchor() {
        System.out.println("Ship anchor dropped.");
    }
}

// HoverCraft Class
class HoverCraft implements LandVehicle, SeaVehicle {

    @Override
    public void drive() {
        System.out.println("HoverCraft is moving on land.");
    }

    @Override
    public void launch() {
        System.out.println("HoverCraft is moving on water.");
    }

    public void enterLand() {
        System.out.println("HoverCraft entering land mode.");
    }

    public void enterSea() {
        System.out.println("HoverCraft entering sea mode.");
    }
}

// Main Class (Demo Application)
public class VehicleDemo {
    public static void main(String[] args) {

        // Car Object
        Car car = new Car();
        car.drive();
        car.openDoor();

        System.out.println();

        // Ship Object
        Ship ship = new Ship();
        ship.launch();
        ship.anchor();

        System.out.println();

        // HoverCraft Object
        HoverCraft hover = new HoverCraft();
        hover.drive();
        hover.launch();
        hover.enterLand();
        hover.enterSea();
    }
}