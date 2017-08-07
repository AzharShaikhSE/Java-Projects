package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class SetPrice1 extends Abstract_SetPrice{

	public void SetPrice(int g, DataStore ds) {

		if(g==1)
			ds.setPrice(ds.getRegularGas1());
		else if(g==2)
			ds.setPrice(ds.getSuperGas1());
		
	}
}
