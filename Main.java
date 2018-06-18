package com.foodlibrary;


import  java.util.Scanner;
public class Main {
 public static void main(String[] args) {
//Setup scanner for input
  Scanner fc = new Scanner(System.in);
  //get information for BMR
  System.out.println("Please enter your information for determining daily calories needs:");
  System.out.println("Gender, please choose 1 for female, 2 for male:");
  int g = fc.nextInt();
  System.out.println("Age:");
  double a = fc.nextDouble();
  System.out.println("Height in inches:");
  double h = fc.nextDouble();
  System.out.println("Weight in lbs:");
  double w = fc.nextDouble();
  double f;
  if (g == 1) {
   f = BMRCalc.wBMR(w, h, a);
   System.out.println("Your daily Basal Metabolic Rate is " + " " + f);
  } else if (g == 2) {
   f = BMRCalc.mBMR(w, h, a);
   System.out.println("Your daily Basal Metabolic Rate is " + " " + f);
  } else {
   System.out.println("Invalid, Please choose 1 or 2:");}
   //get information for activity burn
   // code here
   //List available recipes
   String[] recipes = new String[]{"Chicken Tacos", "Salmon: Lemon Dill", "Pork Chops"};
   //print results to console of daily burn
   //make food decisions based on information
   System.out.println("Please choose a recipe:");
   //choose recipe and display ingredients and calculate calories
   int m = 0;
   for (int i = 0; i < recipes.length; i++) {
    System.out.println(++m + " " + recipes[i]);
   }
   FoodLibrary.menuChoice();
  }
 }

