package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class StoreCash1 extends Abstract_StoreCash{

	public void StoreCash(DataStore ds) {
		
		ds.setCash(ds.getTemp_cash());
	}
}
