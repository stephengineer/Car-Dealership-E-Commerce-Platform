/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

/**
 *
 * @author Stephen Zq Wang
 */

/*
 * The car inventory is stored in a text file in the following format. Each line in the file holds information about a single car. 
 * You need to convert your current inventory to the following text format and load your cars from the text file.
 */
import java.util.Scanner;

public class CISCDApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dealership dealership = new Dealership();
        System.out.println("Welcome to CIS department’s Car Dealership!\n"
                + "To view a list of commands, enter Commands \n\n");

        Scanner sc = new Scanner(System.in);

        boolean continous = true;
        int index = -1;

        while (continous) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            switch (parts[0]) {

                case "command":
                case "Command":
                case "commands":
                case "Commands":
                    System.out.println("Commands: shows a list of all available commands\n"
                            + "List: lists the inventory of cars\n"
                            + "Compare [n1] [n2]: compares two cars\n"
                            + "Select [n]: selects car No. n and shows the details (there is a space between select and number)\n"
                            + "Engine: shows the details of the engine of the selected car\n"
                            + "Interior: Show the details of the interior of the selected car\n"
                            + "Trunk: Show the items in the trunk of the selected car\n"
                            + "Options: show the details of options installed on the selected car\n"
                            + "Quit: terminate the program\n");
                    break;

                case "list":
                case "List":
                    String list = dealership.ListAllCars();
                    System.out.println(list);
                    break;

                case "compare":
                case "Compare":
                    
                    if (parts.length < 3) {
                        System.out.println("Please entry 'compare' + 'car 1' + 'car 2'\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }
                    if (parts.length > 3) {
                        System.out.println("Please compare two cars only\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }

                    if (!isInteger(parts[1]) || !isInteger(parts[2])) {
                        System.out.println("Plean enter compare two numbers means two cars other than anything else\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }

                    int CheckNo1 = Integer.parseInt(parts[1]);
                    int CheckNo2 = Integer.parseInt(parts[2]);
                    if (CheckNo1 > dealership.getTotalCars() || CheckNo2 > dealership.getTotalCars() || CheckNo1 < 1 || CheckNo2 < 1) {
                        System.out.println("Please compare cars from 1 to " + dealership.getTotalCars() + ", thank you.\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }
                    if(CheckNo1 == CheckNo2) {
                        System.out.println("Please compare two different cars, thank you.\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }
                    
                    int index1, index2;
                    index1 = Integer.parseInt(parts[1]);
                    index2 = Integer.parseInt(parts[2]);
                    String compare = dealership.Compare(index1, index2);
                    System.out.println(compare);
                    break;

                case "select":
                case "Select":

                    if (parts.length < 2) {
                        System.out.println("Please entry 'select' + 'space' + 'number'\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }
                    if (parts.length > 2) {
                        System.out.println("Please select one car only\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }

                    if (!isInteger(parts[1])) {
                        System.out.println("Please enter 'select' and one number other than anything else\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }

                    int CheckNo = Integer.parseInt(parts[1]);
                    if (CheckNo > dealership.getTotalCars() || CheckNo < 1) {
                        System.out.println("Please select 1 to " + dealership.getTotalCars() + ", thank you.\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }

                    index = Integer.parseInt(parts[1]);
                    String details = dealership.SelectCar(index);
                    System.out.println("This " + details + " is great! You can view engine, interior, and trunk of the car\n");
                    break;

                case "engine":
                case "Engine":
                    if (index < 0) {
                        System.out.println("Please select a car first, and then check the engine of the selected car.\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }
                    String engine = dealership.CheckEngine();
                    System.out.println(engine);
                    break;

                case "interior":
                case "Interior":
                    if (index < 0) {
                        System.out.println("Please select a car first, and then check the interior of the selected car.\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }
                    String interior = dealership.CheckInterior();
                    System.out.println(interior);
                    break;

                case "trunk":
                case "Trunk":
                    if (index < 0) {
                        System.out.println("Please select a car first, and then open the trunk of the selected car.\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }
                    String trunk = dealership.OpenTrunk();
                    System.out.println(trunk);
                    break;

                case "option":
                case "Option":
                case "options":
                case "Options":
                    if (index < 0) {
                        System.out.println("Please select a car first, and then show options of the selected car.\n"
                                + "To view a list of commands, enter Commands \n");
                        break;
                    }
                    String options = dealership.ShowOption();
                    System.out.println(options);
                    break;

                case "quit":
                case "Quit":
                    System.out.println("Thank you for using CIS department's car dealership application!\n");
                    continous = false;
                    break;

                default:
                    System.out.println("Command not found\n"
                            + "To view a list of commands, enter Commands \n");
                    break;
            }
        }
    }

    public static boolean isInteger(String s) {
        return isInteger(s, 10);
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) {
                    return false;
                } else {
                    continue;
                }
            }
            if (Character.digit(s.charAt(i), radix) < 0) {
                return false;
            }
        }
        return true;
    }
}
