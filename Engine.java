package JavaCoding;

// File Name: Engine.java

// Engine Component (renamed to avoid conflict)
class EngineComponent {
    void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Tyre {
    void rotateTyre() {
        System.out.println("Tyres are rotating");
    }
}

class Door {
    void openDoor() {
        System.out.println("Door opened");
    }

    void closeDoor() {
        System.out.println("Door closed");
    }
}

class Car {
    EngineComponent engine;
    Tyre[] tyres;
    Door[] doors;

    Car() {
        engine = new EngineComponent();

        tyres = new Tyre[4];
        for (int i = 0; i < 4; i++) {
            tyres[i] = new Tyre();
        }

        doors = new Door[4];
        for (int i = 0; i < 4; i++) {
            doors[i] = new Door();
        }
    }

    void startCar() {
        engine.startEngine();
    }

    void moveCar() {
        for (Tyre t : tyres) {
            t.rotateTyre();
        }
        System.out.println("Car is moving...");
    }

    void stopCar() {
        engine.stopEngine();
    }

    void operateDoors() {
        for (Door d : doors) {
            d.openDoor();
            d.closeDoor();
        }
    }
}

// ✅ Main class (must match file name)
public class Engine {
    public static void main(String[] args) {

        Car car = new Car();

        car.operateDoors();
        car.startCar();
        car.moveCar();
        car.stopCar();
    }
}