package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class SetInitialValues2 extends Abstract_SetInitialValues{

	public void SetInitialValues(DataStore ds) {

		ds.setL(0);
		ds.setTotal(0);
	}

}
