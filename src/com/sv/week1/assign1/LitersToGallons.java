package com.sv.week1.assign1;
import java.util.Scanner;

public class LitersToGallons {
	private static final double CONVERSION_RATE = 0.264172;

    public void convert(double liters) {
        double gallons = liters * CONVERSION_RATE;
        System.out.println(liters + " liters = " + gallons + " gallons");
    }

    public void LiterToGallon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter liters: ");
        double liters = scanner.nextDouble();
        LitersToGallons obj = new LitersToGallons();
        obj.convert(liters);
    }
}
