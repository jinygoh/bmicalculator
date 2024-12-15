package logicaloperators.bmicalc;

public class BmiCalc{
    double weightInKg;
    double heightInMeters;

    public BmiCalc() {  //empty constructor (overloading)
        double weightInKg = 0;
        double heightInMeters = 0;
    }

    public BmiCalc(double weight,double height) {
        this.weightInKg = weight;
        this.heightInMeters = height;
    }
    //    bmi = weight / height(squared)
    //    We’ll round to the nearest tenth, so that gives us a final BMI of 23.7
    //     tip: Remember, when rounding to the nearest tenth, you look at the number’s value in the 100ths place (in this case, it was the number 9). If the number in the 100ths place is 5 or greater, you round the 10ths place number up one digit. So instead of rounding to 23.6, it became 23.7.

    public String showBmiResult(){ //
        double squaredHeight = Math.pow(heightInMeters, 2);
        double bmi = weightInKg / squaredHeight;
        bmi = Math.round(bmi * 10.0) / 10.0;

        String msg = "Your BMI result is: ";
        String result;

        if(bmi < 18.5)
            result = "Underweight. Could be Better\n";
        else if (bmi >= 18.5 && bmi <= 24.9 )
            result = "Healthy Weight. That is good\n";
        else if (bmi >= 25.0 && bmi <= 29.9)
            result = "Overweight. Could be Better\n";
        else if (bmi >= 30.0)
            result = "Obesity. Could be Better\n";
        else
            result = "Invalid Entry\n";

        return msg + result;
    }
}
