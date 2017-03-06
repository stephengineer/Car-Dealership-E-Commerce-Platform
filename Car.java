/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

/**
 *
 * @author
 */
public class Car {

    private String make;
    private int year;
    private String model;
    private int price;
    private String color;
    private String type;
    private Engine engine;
    private Interior interior;
    private Trunk trunk;
    private Option options;

    public Car(String make, int year, String model, int price, String color, String type) {
        this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public Car(String make, int year, String model, int price, String color, String type,
            Engine engine, Interior interior, Trunk trunk, Option option) {

        this(make, year, model, price, color, type);

        this.engine = engine;
        this.interior = interior;
        this.trunk = trunk;
        this.options = option;
    }

    public void SetEngine(Engine engine) {
        this.engine = engine;
    }

    public void SetInterior(Interior interior) {
        this.interior = interior;
    }

    public void SetTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public void AddOpption(Option opption) {
        // A choice for customers to add any opption, NEED to modify later
    }

    public String Opentrunk() {
        return trunk.toString();
    }

    public String CheckEngine() {
        return engine.toString();
    }

    public String CheckInterior() {
        return interior.toString();
    }

    public String ShowOptions() {
        return options.toString();

    }

    public String toString() {
        String s = color + " " + year + " " + make + " " + model + " for $" + price;
        return s;
    }

    public String CompareTo(Car otherCar) {

        String s = "";
        String car1 = this.year + " " + this.make + " " + this.model;
        String car2 = otherCar.year + " " + otherCar.make + " " + otherCar.model;
        System.out.println("Comparing " + car1 + " & " + car2);

        // Compare Mpg
        if (this.engine.getMpg() == otherCar.engine.getMpg()) {
            s += "Both cars have same MPG";
        } else {
            if (this.engine.getMpg() > otherCar.engine.getMpg()) {
                s += car1;
            } else {
                s += car2;
            }
            s += " has better MPG";
        }
        s += "\n";

        // Compare price
        if (this.price == otherCar.price) {
            s += "Both cars have same price";
        } else {
            if (this.price < otherCar.price) {
                s += car1;
            } else {
                s += car2;
            }
            s += " is less expensive";
        }
        s += "\n";

        //Compare year
        if (this.year == otherCar.year) {
            s += "Both cars have same year";
        } else {
            if (this.year > otherCar.year) {
                s += car1;
            } else {
                s += car2;
            }
            s += " is newer";
        }
        s += "\n";

        //compare fuel type
        if (this.engine.getFuelType().equals(otherCar.engine.getFuelType())) {
            s += "Both cars run on " + this.engine.getFuelType();
        } else {
            s += car1 + " runs on " + this.engine.getFuelType();
            s += " while ";
            s += car2 + " runs on " + otherCar.engine.getFuelType();
        }
        s += "\n";

        //compare horse power
        if (this.engine.getHorsePower() == otherCar.engine.getHorsePower()) {
            s += "Both cars have same horse power";
        } else {
            if (this.engine.getHorsePower() > otherCar.engine.getHorsePower()) {
                s += car1;
            } else {
                s += car2;
            }
            s += " has a more powerful engine";
        }
        s += "\n";

        //compare capacity
        if (this.engine.getCapacity() == otherCar.engine.getCapacity()) {
            s += "Both cars have " + this.engine.getCapacity() + " cylinders";
        } else {
            s += car1 + " has " + this.engine.getCapacity() + " cylinders";
            s += " while ";
            s += car2 + " has " + otherCar.engine.getCapacity() + " cylinders";
        }
        s += "\n";

        //compare navigation
        if (this.options.getNavigation() && otherCar.options.getNavigation()) {
            s += "Both cars have navigation";
        } else if (!this.options.getNavigation() && !otherCar.options.getNavigation()) {
            s += "Neither of cars has navigation";
        } else {
            if (this.options.getNavigation()) {
                s += car1 + " has navigation";
            } else {
                s += car1 + "does not have navigation";
            }
            s += " while ";
            if (otherCar.options.getNavigation()) {
                s += car2 + " has navigation";
            } else {
                s += car2 + "does not have navigation";
            }
        }
        s += "\n";

        // compare sport
        if (this.options.getSport() && otherCar.options.getSport()) {
            s += "Both cars have sport";
        } else if (!this.options.getSport() && !otherCar.options.getSport()) {
            s += "Neither of cars has sport";
        } else {
            if (this.options.getSport()) {
                s += car1 + " has sport";
            } else {
                s += car1 + "does not have sport";
            }
            if (otherCar.options.getSport()) {
                s += car2 + " has sport";
            } else {
                s += car2 + "does not have sport";
            }
        }
        s += "\n";

        // compare bluetooth
        if (this.options.getBluetooth() && otherCar.options.getBluetooth()) {
            s += "Both cars have bluetooth";
        } else if (!this.options.getBluetooth() && !otherCar.options.getBluetooth()) {
            s += "Neither of cars has bluetooth";
        } else {
            if (this.options.getBluetooth()) {
                s += car1 + " has bluetooth";
            } else {
                s += car1 + "does not have bluetooth";
            }
            if (otherCar.options.getBluetooth()) {
                s += car2 + " has bluetooth";
            } else {
                s += car2 + "does not have bluetooth";
            }
        }
        s += "\n";

        return s;
    }
}