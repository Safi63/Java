 // Fig. 5.6: Interest.java
import java.lang.Double;
public class Zakat{
	public static void main(String[]args){
		
		double zakat;
		double amount = 100000;
		double rate = 0.025;
		
		for(int year = 1; year <=10; ++year)
		{
			zakat = amount*rate;
			System.out.printf("year:%d%s Amount: %.2f%s Zakat: %.2f%n",year,"   ",amount,"    ", zakat);
			amount = amount-zakat;
			
		}
	}
}