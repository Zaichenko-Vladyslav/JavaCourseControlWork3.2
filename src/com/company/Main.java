/*
 *
 * Classname: Main
 *
 * @version 22.06.2020
 * @author Vladyslav Zaichenko

 * Module 3 task 2
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework
 *
 * Choose a subject according to your number.
 * Develop a service using all your best in OOP and Java collections.
 *
 * Six methods must be written like in the following example.
 * A point for each one.
 *
 * Creative approaches are welcome.
 *
 * EXAMPLE
 *
 * A company contains two types of employees:  full-time and  part-time ones.
 *
 * 1. Create two appropriate classes and 5 objects of each one.
 * 2. Calculate the total salary of a month.
 * 3. Find the highest salary employee.
 * 4. Find he lowest salary employee
 * 5.  The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 * /----------------  Subjects according to your number ------------------
 *
 * 1. Employees.
 * 2. Candies in boxes and by weight.
 * 3. Beer draft  and  bottled.
 * 4. Sugar packed and by weight.
 * 5. Cafe : standard lunch and ordering.
 * 6. Air fly : low-cost and business-class.
 * 7.  Trip by train: social sitting places and business-class.
 * 8. Hotel: only bed  and lux.
 * 9. Taxi: payment for km and for time.
 * 10. Fitness centre:  minimal month subscription and free choice.
 *
 * I was born 14 October 1998, that is why I take variant 4
 *
 */

package com.company;

import com.company.model.PackedSugar;
import com.company.model.WeightSugar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println
                ("\n ------------------- PART 1 -------------------");

        // Creating 5 objects for class PackedSugar
        PackedSugar diamant = new PackedSugar("Diamant",28,2);
        PackedSugar ferma = new PackedSugar("Ferma",20,3);
        PackedSugar village = new PackedSugar("Village",25,1);
        PackedSugar leader = new PackedSugar("Leader",19,3);
        PackedSugar family = new PackedSugar("Family",22,2);

        // Creating 5 objects for class WeightSugar
        WeightSugar health = new WeightSugar("Health", 23.56, 1.6);
        WeightSugar sweet = new WeightSugar("Sweet", 14.34, 2.4);
        WeightSugar roshen = new WeightSugar("Roshen", 19.99, 1.0);
        WeightSugar svitoch = new WeightSugar("Svitoch", 24.25, 2.0);
        WeightSugar konti = new WeightSugar("Konti", 23.00, 1.9);

        /*
         * Creation ArrayList "trading" from ITrading (10 elements)
         */
        List<ITrading> trading = new ArrayList<>();
        trading.add(diamant);
        trading.add(ferma);
        trading.add(village);
        trading.add(leader);
        trading.add(family);
        trading.add(health);
        trading.add(sweet);
        trading.add(roshen);
        trading.add(svitoch);
        trading.add(konti);

        System.out.println(trading);

        System.out.println
                ("\n ------------------- PART 2 -------------------");

        /*
         * @param totalPrice return total price for all sugar in the receipt
         */
        int totalPrice = trading.stream().mapToInt(ITrading::getPrice).sum();
        System.out.println
                ("The total price for all sugar in the receipt = "
                        + totalPrice + " UAH");

        System.out.println
                ("\n ------------------- PART 3 -------------------");

        /*
         * @param highestPrice return the most expensive sugar in the receipt
         */
        ITrading highestPrice = trading.stream()
                .max(Comparator.comparingInt(ITrading::getPrice))
                .orElse(null);
        System.out.println
                ("The most expensive sugar in the receipt:"
                        + highestPrice);

        System.out.println
                ("\n ------------------- PART 4 -------------------");

        /*
         * @param lowerPrice return the cheapest sugar in the receipt
         */
        ITrading lowerPrice = trading.stream()
                .min(Comparator.comparingInt(ITrading::getPrice))
                .orElse(null);
        System.out.println("The cheapest sugar in the receipt:"
                + lowerPrice);

        System.out.println
                ("\n ------------------- PART 5 -------------------");

        /*
         * @param averagePrice return average price for sugar in the receipt
         */
        double averagePrice = trading.stream().mapToInt(ITrading::getPrice)
                .average().orElse(0);
        System.out.println
                ("The average price in the receipt - "
                        + averagePrice + " UAH");

        System.out.println
                ("\n ------------------- PART 6 -------------------");

        /*
         * @param packedSugar return total price
         * for packed sugar in the receipt
         */
        int packedSugar = trading.stream()
                .filter(el -> el instanceof PackedSugar)
                .mapToInt(ITrading::getPrice).sum();
        System.out.println
                ("Total price for Packed Sugar in the check - "
                        + packedSugar + " UAH");

        /*
         * @param weightSugar return total price
         * for weight sugar in the receipt
         */
        int weigthSugar = trading.stream()
                .filter(el -> el instanceof WeightSugar)
                .mapToInt(ITrading::getPrice).sum();
        System.out.println
                ("Total price for Weight Sugar in the check - "
                        + weigthSugar + " UAH");

        // Comparison of prices for two types of sugar
        if (packedSugar > weigthSugar){
            System.out.println
                    ("Packed Sugar is more expensive than Weight Sugar");
        }else{
            System.out.println
                    ("Weight Sugar is more expensive than Packed Sugar");
        }
    }
}
