package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class GasPumpedMsg1 extends Abstract_GasPumpedMsg {

	public void GasPumpedMsg(DataStore ds) {

		System.out.println();
		System.out.println(" **************** You have pumped " + ds.getG() + " Gallon(s) of gas ******************");
		System.out.println();
	}
}
