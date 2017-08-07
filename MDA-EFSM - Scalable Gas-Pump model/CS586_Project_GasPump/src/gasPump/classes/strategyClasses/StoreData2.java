package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class StoreData2 extends Abstract_StoreData{

	public void StoreData(DataStore ds) {

		ds.setRegularGas2(ds.getTemp_regularGas2());
		ds.setPremiumGas2(ds.getTemp_premiumGas2());
		ds.setSuperGas2(ds.getTemp_superGas2());
	}
}
