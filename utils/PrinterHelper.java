package logicaloperators.utils;

public class PrinterHelper {

    //showMainMenu is a public static, doesn't return a value
    public static void showMainMenu() {
        System.out.println("*--- ::Check your BMI:: ---*");
        System.out.println("*--- ::Select an option:: ---*");
        System.out.println("*--- ::a. Enter your weight and height :: ---*");
        System.out.println("*--- ::b. Exit program:: ---*");
        System.out.println("******************************");
    }


    public static void showWeightMenu(){
        System.out.println("*--- ::a1. Enter your weight in kg:: ---*");
        System.out.println("******************************");
    }

    public static void showHeightMenu(){
        System.out.println("*--- ::a2. Enter your height in metres:: ---*");
        System.out.println("******************************");
    }

    //showGradeFeedback is a public static method, that takes in ONE PARAMETER
    public static void showBmiFeedback(String feedback){
        System.out.println("*--- ::BMI result:: ---*");
        System.out.println(feedback);
    }

    public static void showInvalidEntry(){
        System.out.println("*--- ::INVALID INPUT:: ---*");
        System.out.println("*--- ::a. Enter 'a' or 'b':: ---*");
        System.out.println("******************************");
    }

}
