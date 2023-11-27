package rbi;

import rbi.Bank.Axis;
import rbi.Bank.Icic;
import rbi.Bank.Sbi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj;
		
		obj = new Sbi();
		obj.setRateofInterest(8.5f);
		System.out.println("SBI Rate of Interest: " + obj.getRateofInterest());
		
		obj = new Icic();
		System.out.println("ICIC Rate of Interest: " + obj.getRateofInterest());
		
		obj = new Axis();
		System.out.println("AXIS Rate of Interest: " + obj.getRateofInterest());
	}

}
