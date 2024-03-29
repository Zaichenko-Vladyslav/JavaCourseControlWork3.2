/*
 *
 * Classname: PackedSugar
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
 * 5. The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 * ----------------  Subjects according to your number ------------------
 *
 * 1. Employees.
 * 2. Candies in boxes and by weight.
 * 3. Beer draft  and  bottled.
 * 4. Sugar packed and by weight.
 * 5. Cafe : standard lunch and ordering.
 * 6. Air fly : low-cost and business-class.
 * 7. Trip by train: social sitting places and business-class.
 * 8. Hotel: only bed  and lux.
 * 9. Taxi: payment for km and for time.
 * 10. Fitness centre:  minimal month subscription and free choice.
 *
 * I was born 14 October 1998, that is why I took variant 4
 *
 */

package com.company.model;

import com.company.ITrading;

public class PackedSugar implements ITrading {

    private String name;
    private double pricePerPack;
    private int amountPack;

    public PackedSugar() {

    }

    /*
     * Class constructor with parameters
     * @param name String, set name of sugar in the receipt
     * @param pricePerPack double, set sugar price per 1 pack in the receipt
     * @param amountPack int, set sugar weight in the receipt
     */

    public PackedSugar(String name, double pricePerPack, int amountPack) {
        this.name = name;
        this.pricePerPack = pricePerPack;
        this.amountPack = amountPack;
    }

    // Getters and setters for class WeightSugar

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerPack() {
        return pricePerPack;
    }

    public void setPricePerPack(double pricePerPack) {
        this.pricePerPack = pricePerPack;
    }

    public int getAmountPack() {
        return amountPack;
    }

    public void setAmountPack(int amountPack) {
        this.amountPack = amountPack;
    }

    // Method toString() for class PackedSugar
    @Override
    public String toString() {
        return "PackedSugar - '" + name + '\'' +
                ", Price - " + pricePerPack + " UAH per pack" +
                ", Amount - " + amountPack + " thing";
    }

    // Method getPrice() for class PackedSugar implemented by ITrading
    @Override
    public int getPrice() {
        return (int) (this.getPricePerPack() * this.getAmountPack());
    }
}
