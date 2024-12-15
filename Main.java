package logicaloperators;

import logicaloperators.bmicalc.BmiCalc;
import logicaloperators.utils.PrinterHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char option; //store the option the user enters
        double weightInKg;
        double heightInMeters;
        Scanner scanner = new Scanner(System.in); //Scanner to obtain system input from user

        do {                        //do-while user input is not 'b' (exit program)

            PrinterHelper.showMainMenu();   //invoke static method ShowMainMenu from PrinterHelper class
            option = scanner.next().charAt(0);

            if(option != 'a' && option != 'b'){     //if option not 'a' and 'b' we continue the loop
                PrinterHelper.showInvalidEntry();   // a static method to inform the user of a wrong entry via PrinterHelper
                continue;
            }

            if(option == 'b') //if 'b' option is entered, break to discontinue
                break;

            PrinterHelper.showWeightMenu();
            weightInKg = scanner.nextDouble(); // obtain thcde weight (double) and store in variable weightInKg
            PrinterHelper.showHeightMenu();
            heightInMeters = scanner.nextDouble(); // obtain the height (double) and store in variable heightInMeters

            BmiCalc bmicalc = new BmiCalc(weightInKg, heightInMeters); // instance of a BmiCalc - overloaded constructor invoked (visible)
            PrinterHelper.showBmiFeedback(bmicalc.showBmiResult());    // show the user his/her BMI result

        }while (option != 'b');
    }
}

