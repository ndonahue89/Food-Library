package com.foodlibrary;


public class BMRCalc {
    double weight;
    double height;
    double age;
    double rate;
    //BMR formula: women: BMR = 655 + (4.35 x weight in pounds) + (4.7 x height in inches) - (4.7 x age in years)
    //men: BMR = 66 + (6.23 x weight in pounds) + (12.7 x height in inches) - (6.8 x age in years)
    int  gender = 1;



        public static double wBMR(double weight, double height, double age){
        double rate = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
        return rate;}
        public static double mBMR(double weight, double height, double age){
        double  rate = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
        return rate;




    }
}
