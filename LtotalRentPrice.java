package Project;

import javax.swing.JTable;

public class LtotalRentPrice implements LPayment {  
	
	public double discount() {
		JTable t = LAdvertisement.getTable();
		String discount="";
		double disc;
		
			if (t == null) {
				return 0.2;
			}
		
			else {
				for(int i = 0; i<t.getRowCount(); i++) { 
				discount= String.valueOf(t.getValueAt(i, 0));}
				disc = Double.parseDouble(discount)/100;
				return disc;}
	
	}
	
	public double Rentprice(String selection, String choose, int day) {  //method to calculate rental price per day
		JTable t = LAdminInfo.getTable();
		String p = "";
		double price = 0;
			
		for(int i = 0; i<t.getRowCount(); i++) { 
			if (selection.equals(t.getValueAt(i, 0))&&choose.equals(t.getValueAt(i, 1))) {
			p= String.valueOf(t.getValueAt(i, 3));
			price = Double.parseDouble(p);}
			}
		
			if(day <= 10) 
				return price;
		
				else
					return price = price - price* discount();} //end of method Rent price
	
	public double getPayment(String selection, String choose, int day) {  //method with 3 arguments implement form class interface to calculate total payment
		return day*Rentprice(selection, choose, day);
	}
	
	public double getPayment(String selection, String choose, int day, double discount) {  //method with 4 arguments implement form class interface to calculate total payment
		return day*Rentprice(selection, choose, day);
	}
	
}  //end LtotalRentPrice class
