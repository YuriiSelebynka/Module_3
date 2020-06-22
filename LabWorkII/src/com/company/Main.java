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

package com.company;

import com.company.Flights.BusinessClass;
import com.company.Flights.LowCostClass;
import com.company.Interfaces.ICosting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Air fly : low-cost and business-class.
        /* Creating an examples of both classes. */

        BusinessClass BusinessLvivKiyv = new BusinessClass(
                "Business Class Lviv - Kiyv", 1.5
                , 520, 3.5);
        BusinessClass BusinessLvivOdessa = new BusinessClass(
                "Business Class Lviv - Odessa", 1.5
                , 800, 3.5);
        BusinessClass BusinessLvivStuttgart = new BusinessClass(
                "Business Class Lviv - Stuttgart", 2.5
                , 1300, 4.0);
        BusinessClass BusinessLvivLondon = new BusinessClass(
                "Business Class Lviv - London", 2.5
                , 1900, 3.5);
        BusinessClass BusinessLvivNewYork = new BusinessClass(
                "Business Class Lviv - New-York", 3
                , 7200, 4.5);

        LowCostClass LowCostLvivKiyv = new LowCostClass(
                "Low-Cost Class Lviv - Kiyv"
                , 1.5, 520);
        LowCostClass LowCostLvivOdessa = new LowCostClass(
                "Low-Cost Class Lviv - Odessa"
                , 1.5, 800);
        LowCostClass LowCostLvivBratislava = new LowCostClass(
                "Low-Cost Class Lviv - Bratislava"
                , 1.0, 700);
        LowCostClass LowCostLvivNaples = new LowCostClass(
                "Low-Cost Class Lviv - Naples"
                , 1.1, 2000);
        LowCostClass LowCostLvivMadrid = new LowCostClass(
                "Low-Cost Class Lviv - Madrid"
                , 1.2, 3000);

        // Air fly : low-cost and business-class.
        /* Including an examples into List. */

        List<ICosting> flights = new ArrayList<>();
        flights.add(BusinessLvivKiyv);
        flights.add(BusinessLvivOdessa);
        flights.add(BusinessLvivStuttgart);
        flights.add(BusinessLvivLondon);
        flights.add(BusinessLvivNewYork);
        flights.add(LowCostLvivKiyv);
        flights.add(LowCostLvivOdessa);
        flights.add(LowCostLvivBratislava);
        flights.add(LowCostLvivNaples);
        flights.add(LowCostLvivMadrid);

        // Air fly : low-cost and business-class.
        /* Counting of total price of all flights. */

        double price = flights.stream().mapToDouble(ICosting::getPrice).sum();
        System.out.println("The total flight price is " + price + " UAH.");

        // Air fly : low-cost and business-class.
        /* Counting of most expensive flight from all of them. */

        ICosting mostExpensiveFlight = flights.stream()
                .max(Comparator.comparingDouble(ICosting::getPrice))
                .orElse(null);
        System.out.println("Most expensive flight is " + mostExpensiveFlight);

        // Air fly : low-cost and business-class.
        /* Counting of the cheapest flight from all of them. */

        ICosting cheapestFlight = flights.stream()
                .min(Comparator.comparingDouble(ICosting::getPrice))
                .orElse(null);
        System.out.println("Cheapest flight is " + cheapestFlight);

        // Air fly : low-cost and business-class.
        /* Counting of the average flight from all of them. */

        double avg = flights.stream().mapToDouble(ICosting::getPrice)
                .average().orElse(0);
        System.out.println("The average price is " + avg + " UAH.");

        // Air fly : low-cost and business-class.
        /* Comparing of the sums of both flight classes. */

        double sumBusinessClass = flights.stream().filter(el->el instanceof
                BusinessClass).mapToDouble(ICosting::getPrice).sum();

        double sumLowCostClass = flights.stream().filter(el->el instanceof
                LowCostClass).mapToDouble(ICosting::getPrice).sum();

        if (sumBusinessClass > sumLowCostClass) {
            System.out.println("Business Class flights cost more expensive.");
        } else if (sumBusinessClass < sumLowCostClass) {
            System.out.println("Low-Cost Class flights cost more expensive.");
        } else {
            System.out.println("Prices of both types of flights are equal.");
        }


    }
}