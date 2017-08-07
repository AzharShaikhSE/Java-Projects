package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class PumpGasUnit2 extends Abstract_PumpGasUnit {

	public void PumpGasUnit(DataStore ds) {

		ds.setL(ds.getL()+1);
	}
}
