package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class PrintReceipt1 extends Abstract_PrintReceipt {

	public void PrintReceipt(DataStore ds) {

		System.out.println(" *********## RECEIPT ##**********");
		System.out.println("  No. of Gallons Pumped = "+ds.getG());
		System.out.println("  Total Price = $ "+ds.getTotal());
		System.out.println(" ********* Thank you !!! ********");
	}
}
