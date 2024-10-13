class Vehicle {
    protected int wheels;
    protected String color;

    public Vehicle() {
        this.wheels = 0;
        this.color = "";
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Number of wheels: " + wheels + ", Color: " + color);
    }
}

class Car extends Vehicle {
    private String make;

    public Car() {
        super();
        this.make = "";
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Make: " + make);
    }
}

class Boat extends Vehicle {
    private boolean hasSails;

    public Boat() {
        super();
        this.hasSails = false;
    }

    public void setHasSails(boolean hasSails) {
        this.hasSails = hasSails;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Has Sails: " + hasSails);
    }
}

public class Important {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        for (int i = 0; i < 2; i++) {
            String vehicleType = System.console().readLine("Enter vehicle type (Car/Boat): ").toLowerCase();

            if (vehicleType.equals("car")) {
                Car car = new Car();
                car.setWheels(4);
                car.setColor("Red");
                car.setMake("Toyota");
                vehicles[i] = car;
            } else if (vehicleType.equals("boat")) {
                Boat boat = new Boat();
                boat.setWheels(0);
                boat.setColor("Blue");
                boat.setHasSails(true);
                vehicles[i] = boat;
            }
        }

        // Print details of all vehicles
        for (Vehicle vehicle : vehicles) {
            vehicle.printDetails();
        }
    }
}