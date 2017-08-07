package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class SetInitialValues1 extends Abstract_SetInitialValues{

	public void SetInitialValues(DataStore ds) {

		ds.setG(0);
		ds.setTotal(0);
	}

}
