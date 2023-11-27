package rbi;

public class Bank {
	float interest;
	
	float getRateofInterest() {
		return 0;
		
	}
	
	static class Sbi extends Bank {
		float getRateofInterest() {
			return interest;
		}
		
		public void setRateofInterest(float interest) {
			this.interest = interest;
		}
	}
	
	static class Icic extends Bank {
		float getRateofInterest() {
			return 10.0f;
		}
		
		public void setRateofInterest(float interest) {
			this.interest = interest;
		}
	}
	
	static class Axis extends Bank {
		float getRateofInterest() {
			return 9.0f;
		}
		
		public void setRateofInterest(float interest) {
			this.interest = interest;
		}
	}
	

}


