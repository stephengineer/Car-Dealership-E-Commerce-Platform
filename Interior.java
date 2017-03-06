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

public class Interior {

    private String color1;
    private String color2;
    private boolean hasSunRoof;
    private boolean hasMoonRoof;

    public Interior(String color1, String color2, boolean hasSunRoof, boolean hasMoonRoof) {
        this.color1 = color1;
        this.color2 = color2;
        this.hasMoonRoof = hasMoonRoof;
        this.hasSunRoof = hasSunRoof;
    }

    public String toString() {
        String s = "interiorColor 1 is: " + color1 + ", interiorColor 2 is: " + color2;
        if (hasSunRoof) {
            s += ", has sun roof";
        } else {
            s += ", does not have sun roof";
        }
        if (hasMoonRoof) {
            s += ", has moon roof";
        } else {
            s += ", does not have moon roof";
        }
        return s + "\n";
    }
}
