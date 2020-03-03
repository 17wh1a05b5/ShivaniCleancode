package epamcom.CleanCode;

public class CostCalculation {
double SimpleInterest(double principal, double rate, double time){
	double res1 = (principal * rate * time) / 100;
		
		return res1;
		
	}
	
	double computesCompoundInterest(double principal, double rate, double time){
		double res2 = principal * (Math.pow((1 + rate / 100), time)); 
		
		return res2;
	}
		

}


