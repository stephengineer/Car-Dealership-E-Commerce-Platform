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

public class Trunk {

    private boolean hasSpareTire;
    private boolean hasFirstAidKit;
    private boolean hasCarpet;
    private boolean hasJack;
    private String carpetColor;

    public Trunk(boolean hasSpareTire, boolean hasFirstAidKit, boolean hasCarpet, boolean hasJack, String carpetColor) {
        this.hasSpareTire = hasSpareTire;
        this.hasFirstAidKit = hasFirstAidKit;
        this.hasCarpet = hasCarpet;
        this.hasJack = hasJack;
        this.carpetColor = carpetColor;
    }

    public String toString() {
        String s = "This car ";
        if (hasSpareTire) {
            s += "has sapre tire, ";
        } else {
            s += "dose not have spare tire, ";
        }
        if (hasFirstAidKit) {
            s += "has first aid kit, ";
        } else {
            s += "dose not have first aid kit, ";
        }
        if (hasCarpet) {
            s += "has car pet, which color is " + carpetColor + ", ";
        } else {
            s += "dose not have car pet, ";
        }
        if (hasJack) {
            s += "has jack";
        } else {
            s += "does not have jack";
        }
        return s + "\n";
    }
}
