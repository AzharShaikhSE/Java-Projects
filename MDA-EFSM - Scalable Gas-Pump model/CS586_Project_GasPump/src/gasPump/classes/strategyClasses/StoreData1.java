package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class StoreData1 extends Abstract_StoreData{

	public void StoreData(DataStore ds) {

		ds.setRegularGas1(ds.getTemp_regularGas1());
		ds.setSuperGas1(ds.getTemp_superGas1());
	}
}
