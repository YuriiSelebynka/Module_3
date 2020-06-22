/*
 *
 * Classame : Java Development (K)
 *
 *  22 June 2020
 *
 * Created by Selebynka Yurii (UzhNU)
 *
 *   Laboratory Work No.2.
 *
 *  Choose a subject according to your number. (My number is 6 -
 *  according to my birthday - MAY.6)
 *  Develop a service using all your best in OOP and Java collections.
 *  Six methods must be written like in the following example. A point
 * for each one.
 *
 * */

package com.company.Flights;

import com.company.Interfaces.ICosting;

import java.util.Objects;

public class BusinessClass implements ICosting {

    // Air fly : low-cost and business-class.
    /* Creating a variables of this class. */

    public String name; // name of plane
    public double cost; // price per kilometer in UAH
    public double distance; // distance of flight in kilometers
    public double luxuryPrice; // price for exclusive service

    // Air fly : low-cost and business-class.
    /* Creating a constructor of this class. */

    public BusinessClass(String name, double cost
            , int distance, double luxuryPrice) {
        this.name = name;
        this.cost = cost;
        this.distance = distance;
        this.luxuryPrice = luxuryPrice;
    }

    // Air fly : low-cost and business-class.
    /* Creating getters and setters of this class. */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getLuxuryPrice() {
        return luxuryPrice;
    }

    public void setLuxuryPrice(double luxuryPrice) {
        this.luxuryPrice = luxuryPrice;
    }

    // Air fly : low-cost and business-class.
    /* Creating equals of this class. */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessClass that = (BusinessClass) o;
        return Double.compare(that.getCost(), getCost()) == 0 &&
                getDistance() == that.getDistance() &&
                Double.compare(that.getLuxuryPrice(), getLuxuryPrice()) == 0 &&
                Objects.equals(getName(), that.getName());
    }

    // Air fly : low-cost and business-class.
    /* Creating hashCode of this class. */

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCost(), getDistance(), getLuxuryPrice());
    }

    // Air fly : low-cost and business-class.
    /* Creating toString of this class. */

    @Override
    public String toString() {
        return "BusinessClass: " +
                "name - " + name +
                "," + '\n' + "cost=" + cost + " UAH," + '\n' +
                "distance - " + distance + " km," + '\n' +
                "luxuryPrice - " + luxuryPrice + " UAH" +'\n' +
                "price is " + getPrice() + " UAH.";
    }

    // Air fly : low-cost and business-class.
    /* Creating getPrice of this class. */

    @Override
    public double getPrice() {
        return (double) (this.getCost() * this.getDistance()
                * this.getLuxuryPrice());
    }
}