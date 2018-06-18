package com.foodlibrary;
import java.util.Scanner;
public class FoodLibrary {
public static void menuChoice(){
    int foodChoice;
    String weight = "ounces";
    String[] recipes = new String[]{"Chicken Tacos","Salmon: Lemon Dill","Pork Chops"};
//recipe and ingredients by type
    //chicken tacos
    String[] chickenTacos = new String[]{"Onion","tortilla", "tomato", "cilantro", "cheese","chicken"};
    double[] ingredientsCT = new double[] {.5,3,.25,.10,.5,4};
//lemon dill salmon
    String[] lemonDillSalmon = new String[]{"dill","lemons", "butter", "garlic", "salt", "pepper", "salmon"};
    double[] ingredientsLDS = new double[] {.10,.25,.25,.10,.01,.01,4};
//pork chops
    String[] porkchops = new String[]{"onion","cumin", "oil", "salt", "pepper","pork chop"};
    double[] ingredientsPC = new double[] {.5,.01,.25,.10,.01,4};
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int x = c;
    int  g = chickenTacos.length;
    int  y = ingredientsCT.length;
    if(g != y){System.out.println("Check values");
    }
    //   System.out.println(chickenTacos.length);
    //System.out.println("Please choose a recipe:");
    int m = 0;
   // for(int i = 0; i < recipes.length; i++){ System.out.println(++m + " " + recipes[i]);}

    // for(int i = 0; i < chickenTacos.length; i++){ System.out.println(++m + " " + chickenTacos[i]);}
    //  for(int i = 0; i < ingredientsCT.length; i++){ System.out.println(ingredientsCT[i]);}

    switch(x) {
        case 1: System.out.println("Ingredient List:");
            for (int ct = 0; ct < chickenTacos.length; ct++) {
                System.out.println(chickenTacos[ct] + " " + ingredientsCT[ct] + " " + weight);
            }
        case 2: System.out.println("Ingredient List:");
            for (int lds = 0; lds < lemonDillSalmon.length; lds++) {
                System.out.println(lemonDillSalmon[lds] + " " + ingredientsLDS[lds] + " " + weight);}

        case 3: System.out.println("Ingredient List:");
            for (int pc = 0; pc < porkchops.length; pc++) {
                System.out.println(porkchops[pc] + " " + ingredientsPC[pc] + " " + weight);    }
            break;

    }

}}
