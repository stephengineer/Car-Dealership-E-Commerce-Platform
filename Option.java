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

public class Option {

    private boolean Navigation;
    private boolean Sport;
    private boolean Bluetooth;

    public Option(boolean Navigation, boolean Sport, boolean Bluetooth) {
        this.Navigation = Navigation;
        this.Sport = Sport;
        this.Bluetooth = Bluetooth;
    }

    public String toString() {
        String s = "This car options: ";
        if (Navigation) {
            s += "Navigation, ";
        } 
        if (Sport) {
            s += "Sport, ";
        } 
        if (Bluetooth) {
            s += "Bluetooth, ";
        }
        if(!Navigation && !Sport && ! Bluetooth) {
            s += "None";
        }

        return s + "\n";
    }

    public boolean getNavigation() {
        return this.Navigation = Navigation;
    }

    public boolean getSport() {
        return this.Sport = Sport;
    }

    public boolean getBluetooth() {
        return this.Bluetooth = Bluetooth;
    }
}
