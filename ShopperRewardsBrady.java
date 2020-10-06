//Kabrina Brady

import java.util.Scanner;

public class ShopperRewardsBrady {
    public static void main(String[] args) {
        double groceries;
        double discountPercent;
        double total;
        double noDiscount = 0;
        double percentSaved;
        double centsSaved;
        Scanner input = new Scanner(System.in);

        //Prompts user for cost of groceries and assigns to variable
        System.out.println("Please enter the cost of your groceries: ");
        groceries = input.nextDouble();

        //Calls grocery discount method
        discountPercent = Discount(groceries);

        //Calculates final price
        if (discountPercent == noDiscount){
            total = groceries;
        }
        else{
            total = groceries * discountPercent;
        }

        //Used in output
        percentSaved = discountPercent * 100;

        //Calls fuel discount
        centsSaved = FuelRewards(groceries);

        //Displays receipt
        System.out.printf("You receive a discount coupon of $%.2f (" + Math.round(percentSaved) + " percent of your order). ", total);
        System.out.printf("You have earned $%.2f off per gallon of gas.", centsSaved);
    }

    public static double Discount(double totalCost){
        int low = 10;
        int med = 70;
        int high = 150;
        int veryHigh = 250;

        double noDiscount = 0;
        double lowDiscount = 0.04;
        double medDiscount = 0.07;
        double highDiscount = 0.1;
        double veryHighDiscount = 0.15;

        if (totalCost < low){
            return noDiscount;
        }
        else if (totalCost >= low && totalCost <= med){
            return lowDiscount;
        }
        else if (totalCost > med && totalCost <= high){
            return medDiscount;
        }
        else if (totalCost > high && totalCost <= veryHigh){
            return highDiscount;
        }
        else{
            return veryHighDiscount;
        }
    }

    public static double FuelRewards(double totalCost){
        int low = 1;
        int med = 49;
        int high = 100;

        double noDiscount = 0;
        double lowDiscount = 0.01;
        double medDiscount = 0.02;
        double highDiscount = 0.03;

        if (totalCost < low){
            return  noDiscount;
        }
        else if (totalCost >= low && totalCost <= med){
            return lowDiscount;
        }
        else if (totalCost > med && totalCost <= high){
            return medDiscount;
        }
        else {
            return highDiscount;
        }
    }
}
