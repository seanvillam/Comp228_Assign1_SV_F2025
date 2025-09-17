import java.util.Scanner;

import com.sv.week1.assign1.GradeCalculation;
import com.sv.week1.assign1.MilesToKilometer;
import com.sv.week1.assign1.LitersToGallons;
import com.sv.week1.assign1.CurrencyConverter;

public class DriverMain {
	public static void main(String[] args) {
		

		/*
		 * Create objects for classes of Task a-d.	
		 * 
		 * 
		 */
			
		// for example tasks grade calculation goes as below..
			GradeCalculation gc = new GradeCalculation();
			MilesToKilometer mk = new MilesToKilometer();
			LitersToGallons  lg = new LitersToGallons();
			CurrencyConverter cc = new CurrencyConverter(0.73);
			
	// create objects for all the classes..  and then call the method using switch case.. 

		System.out.println("Enter the choice for operation  1: Grade Calculation, 2: Miles to Kilometers, 3: Liters to Gallons, 4: Currency Converter.");
		try (Scanner sc = new Scanner(System.in)) {
			int choice=sc.nextInt();
			
			
			    switch (choice) {
			      case 1:
			    	  	 System.out.println("Doing Grade Calculation...");
			      	gc.GradeCalc();
			        break;
			      case 2:
			    	  	 System.out.println("Converting Miles To Kilometers...");
			        mk.MilesToKm();
			        break;
			      case 3:
			    	  System.out.println("Converting Liters to Gallons...");
				    lg.LiterToGallon();
				    break;
			      case 4:
			    	  System.out.println("Converting CAD to USD...");
			    	cc.CadToUsd();
			    	break;
			    	  
			}
		}

	}
}
