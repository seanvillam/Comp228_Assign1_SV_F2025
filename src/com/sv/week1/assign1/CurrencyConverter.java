package com.sv.week1.assign1;

import java.util.Scanner;

public class CurrencyConverter {
    private double rate;

    public CurrencyConverter(double rate) {
        this.rate = rate;
    }

    public void convertToUSD(double cad) {
        double usd = cad * rate;
        System.out.println(cad + " CAD = " + usd + " USD");
    }

    public void CadToUsd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CAD: ");
        double cad = scanner.nextDouble();
        CurrencyConverter obj = new CurrencyConverter(0.73); // fixed rate
        obj.convertToUSD(cad);
    }
}

