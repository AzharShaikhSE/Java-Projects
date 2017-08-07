package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class TotalPrice1 extends Abstract_TotalPrice{

	public void TotalPrice(DataStore ds) {

		ds.setTotal(ds.getPrice() * ds.getG());
	}
}
