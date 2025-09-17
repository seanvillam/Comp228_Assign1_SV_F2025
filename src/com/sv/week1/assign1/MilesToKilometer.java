package com.sv.week1.assign1;

import java.util.Scanner;

public class MilesToKilometer {
    private static final double CONVERSION_RATE = 1.60934;

    public void convert(double miles) {
        double km = miles * CONVERSION_RATE;
        System.out.println(miles + " miles = " + km + " kilometers");
    }

    public void MilesToKm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        MilesToKilometer obj = new MilesToKilometer();
        obj.convert(miles);
    }
}
