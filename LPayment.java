package Project;

public interface LPayment { //class of LPayment
	double discount();
	double Rentprice(String selection, String choose, int day);
	double getPayment(String selection, String choose,int day);
	double getPayment(String selection, String choose, int day, double discount);
	
} //end class of LPayment
