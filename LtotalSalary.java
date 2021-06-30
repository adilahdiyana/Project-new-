package Project;

public class LtotalSalary implements LPayment {  
	
	public double discount() {  
		return 0.05;
	}
	
	public double Rentprice(String selection, String choose, int day) { //method to calculate salary per day
		double price = 0;
		
				if(selection.equals("Clerk")) { //start selection 1
						if(choose.equals("Part Time")) { //start choose 0
								return price = 15;	
						}  //end choose 0
						
						else  
							 return price = 1500;
	

					} //end selection 1
						
				 if(selection.equals("Supervisor")) {  //start selection 2
							if(choose.equals("Part Time")) { //start choose 0
									return price = 50;	
							}  //end choose 1
							
							else 
								return price = 1500;	
	

						}  //end selection 2
						
				 if(selection.equals("Manager")) { //start selection 3
						if(choose.equals("Part Time")) { //start choose 0
								return price = 150;
						    }
						else 
								return price = 350;	
	
					}  //end selection 3
				
				return price;
		}  //end of method Rent Price
	
	public double getPayment(String selection,String choose, int day) {  //method with 3 arguments implement form class interface to calculate total salary
		return day*Rentprice(selection, choose, day);
	}
	
	public double getPayment(String selection,String choose, int day, double discount) {  //method with 4 arguments implement form class interface to calculate total salary
		day = 3;
		return day*Rentprice(selection, choose, day)*(1-discount);
	}
	
}  
