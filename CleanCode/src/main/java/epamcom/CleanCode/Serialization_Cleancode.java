package epamcom.CleanCode;
import java.util.Scanner;

public class Serialization_Cleancode {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		CostCalculation calculate = new CostCalculation();
			
		Budget_Construction budget = new Budget_Construction();
			
		System.out.println("Select 1 to calculate Simple Interest");
		System.out.println("Select 2 to calculate Compound Interest");
		int option = input.nextInt();
		System.out.println("Enter principal , rate and time values");
		double principal = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		switch(option){
		case 1:
			System.out.println(calculate.SimpleInterest(principal, rate, time));
			break;
		case 2:
			System.out.println(calculate.computesCompoundInterest(principal, rate, time));
			break;
		default:
			System.out.println("Invalid option");
			}
			
			System.out.println("Enter Standard");
			System.out.println("Select 1 for normal ");
			System.out.println("Select 2 for medium");
			System.out.println("Select 3 for high");
			int standard = input.nextInt();
			int fullyAutomated;
			if( standard == 3){
				System.out.println("Enter 1 for fully automated house else enter 0");
				fullyAutomated = input.nextInt();
			}else{
				fullyAutomated = 0;
				
			}
			System.out.println("Enter the area ");
			double area = input.nextDouble();
			System.out.println(budget.calculatesConstructionCost(area, standard, fullyAutomated));
	}
}
