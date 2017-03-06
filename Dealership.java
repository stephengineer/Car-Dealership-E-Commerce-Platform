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

import java.io.*;

public class Dealership {

    private Car[] cars;
    private Car selectedCar;
    int TotalCars = 0;
    
    public Dealership() {

        // The name of the file to open.
        String fileName = "cars.txt";

        // This will reference one line at a time
        String line = null;
        
        int NumOfCar = 0;
        Engine engine;
        Interior interior;
        Trunk trunk;
        Option option;
        Car car;

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            
            while ((line = bufferedReader.readLine()) != null) {
                TotalCars++;
            }
            bufferedReader.close();
            
            cars = new Car[TotalCars];

            bufferedReader = new BufferedReader(new FileReader(fileName));

            while ((line = bufferedReader.readLine()) != null) {

                String[] info = line.split(",");

                engine = new Engine(info[6], Integer.parseInt(info[7]), Integer.parseInt(info[8]), Integer.parseInt(info[9]), Float.parseFloat(info[10]));

                interior = new Interior(info[16], info[17], Boolean.parseBoolean(info[18]), Boolean.parseBoolean(info[19]));

                trunk = new Trunk(Boolean.parseBoolean(info[11]), Boolean.parseBoolean(info[12]), Boolean.parseBoolean(info[13]), Boolean.parseBoolean(info[14]), info[15]);

                option = new Option(Boolean.parseBoolean(info[20]), Boolean.parseBoolean(info[21]), Boolean.parseBoolean(info[22])); // Navigation, Sport, Bluetooth

                car = new Car(info[2], Integer.parseInt(info[1]), info[3], Integer.parseInt(info[4]), info[0], info[5], engine, interior, trunk, option);

                cars[NumOfCar] = car;

                NumOfCar++;
            }
            
            // Always close files.
            bufferedReader.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
            
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }

    public String ListAllCars() {

        String result = "";
        for (int i = 0; i < cars.length; i++) {
            Car c = cars[i];
            String s = c.toString();
            result = result + (i + 1) + "-" + s + "\n";
        }
        //System.out.println(result);
        return result;
    }

    public String SelectCar(int index) {
        selectedCar = cars[index - 1];
        return selectedCar.toString();
    }

    public String OpenTrunk() {
        return selectedCar.Opentrunk();
    }

    public String CheckEngine() {
        return selectedCar.CheckEngine();
    }

    public String CheckInterior() {
        return selectedCar.CheckInterior();
    }

    public String Compare(int firstCarIndex, int secondCarIndex) {
        return cars[firstCarIndex - 1].CompareTo(cars[secondCarIndex - 1]);
    }

    public String ShowOption() {
        return selectedCar.ShowOptions();
    }
    
    public int getTotalCars() {
        return TotalCars;
    }
}
