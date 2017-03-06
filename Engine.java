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

public class Engine {

    private String fuelType;
    private int noOfCylinders;
    private int capacity;
    private int horsePower;
    private float mpg;

    public Engine(String fuelType, int noOfCylinders, int capacity, int horsePower, float mpg) {
        this.fuelType = fuelType;
        this.noOfCylinders = noOfCylinders;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.mpg = mpg;
    }

    public String toString() {
        String s = fuelType + ", " + noOfCylinders + " cylinders," + capacity + ", cc " + horsePower + " hp, " + mpg + " average mpg.";
        return s + "\n";
    }

    public int getHorsePower() {
        return this.horsePower = horsePower;
    }

    public float getMpg() {
        return this.mpg = mpg;
    }

    public String getFuelType() {
        return this.fuelType = fuelType;
    }

    public int getCapacity() {
        return this.capacity = capacity;
    }

    public int getNoOfCylinfers() {
        return this.noOfCylinders = noOfCylinders;
    }

}
