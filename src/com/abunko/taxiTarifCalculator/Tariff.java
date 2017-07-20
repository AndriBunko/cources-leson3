package com.abunko.taxiTarifCalculator;

/**
 * Created by Andrew on 17.07.2017.
 */
public interface Tariff {

    long calculatePrice(TaxiRide taxiRide);
}
