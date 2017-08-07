package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class ReturnCash1 extends Abstract_ReturnCash {

	public void ReturnCash(DataStore ds) {

		float r_cash= ds.getCash()-ds.getTotal();
		System.out.println(" Cash Returned = $ "+Math.abs(r_cash));
		System.out.println(" ********* Thank you !!! ********");
	}
}
