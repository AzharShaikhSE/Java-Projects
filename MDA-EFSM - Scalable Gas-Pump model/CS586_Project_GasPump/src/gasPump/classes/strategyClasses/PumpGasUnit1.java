package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class PumpGasUnit1 extends Abstract_PumpGasUnit {

	public void PumpGasUnit(DataStore ds) {

		ds.setG(ds.getG()+1);
	}
}
