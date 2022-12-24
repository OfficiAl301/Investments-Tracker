package financetracker;
import java.util.Scanner;
import java.text.*; 

public class driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase price per share:");
		double purchasePrice = scan.nextDouble(); 
		int dayNum = 1;
		double closingPrice = .001;
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		while (true) {
			System.out.println("Enter the closing price from day " + dayNum + " (any negative value leave: ");
				closingPrice = scan.nextDouble(); 
				if (closingPrice < 0.0) break;
				double earnings = closingPrice - purchasePrice; 
				if (earnings > 0.0) {
					System.out.println("After day " + dayNum + " , you earned " + df.format(earnings) + " per share. " );
					
				}
				else if (earnings < 0.0) {
					System.out.println("After day " + dayNum + " , you lost " + df.format(-earnings) + " per share. " );
				}
				else {
					System.out.println("After day " + dayNum + " , you have " + " No earnings per share. " );
				}
				dayNum += 1;
		}
		scan.close();
	}

}
