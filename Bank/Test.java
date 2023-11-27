
interface Bank {
	
	default float getRateOfInterest() {
		return 0;
		
	}
	
}
	
	class Sbi implements Bank {
		public float getRateOfInterest() {
			return 8.0f;
		}
	}
	
	class Icic implements Bank {
		public float getRateOfInterest() {
			return 7.5f;
		}
	}
	
	class Axis implements Bank {
		public float getRateOfInterest() {
			return 9.2f;
		}
	}
	




class Test {
	public static void main(String args[]) {
		
		Bank obj;
		obj = new Sbi();
		System.out.println("SBI Rate of Interest: " + obj.getRateOfInterest());
		
		obj = new Icic();
		System.out.println("ICIC Rate of Interest: " + obj.getRateOfInterest());
		
		obj = new Axis();
		System.out.println("AXIS Rate of Interest: " + obj.getRateOfInterest());
	}
}


