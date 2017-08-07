package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class PrintReceipt2 extends Abstract_PrintReceipt {

	public void PrintReceipt(DataStore ds) {

		System.out.println(" *********## RECEIPT ##**********");
		System.out.println("  No. of Liters Pumped = "+ds.getL());
		System.out.println("  Total Price = $ "+ds.getTotal());
		
		
	}
}
