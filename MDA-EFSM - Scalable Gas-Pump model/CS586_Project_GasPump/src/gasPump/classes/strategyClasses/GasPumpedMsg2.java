package gasPump.classes.strategyClasses;

import gasPump.classes.dataStore.DataStore;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class GasPumpedMsg2 extends Abstract_GasPumpedMsg {

	public void GasPumpedMsg(DataStore ds) {

		System.out.println("****************** You have pumped " + ds.getL() + " Liter(s) of gas ******************");
		System.out.println();
	}
}
