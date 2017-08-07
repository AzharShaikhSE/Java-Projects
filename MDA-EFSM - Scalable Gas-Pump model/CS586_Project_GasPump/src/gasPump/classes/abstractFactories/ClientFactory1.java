package gasPump.classes.abstractFactories;

import gasPump.classes.dataStore.DataStore;
import gasPump.classes.dataStore.DataStore1_GP1;
import gasPump.classes.strategyClasses.*;

//########## Part of Abstract Factory Pattern ###############
//Concrete ClientFactory1 Class for GasPump1

public class ClientFactory1 extends AbstractFactory {

	public ClientFactory1(){
		ds = new DataStore1_GP1();  // create DataStore1 object for ClientFactory1
	}
	
	public DataStore getDataStore() {
		return ds ;
	}

	public Abstract_StoreData getStoreData() {
		return new StoreData1();
	}

	public Abstract_PayMsg getPayMsg() {
		return new PayMsg1();
	}

	public Abstract_DisplayMenu getDisplayMenu() {
		return new DisplayMenuGP1();
	}

	public Abstract_RejectMsg getRejectMsg() {
		return new RejectMsg1();
	}

	public Abstract_CancelMsg getCancelMsg() {
		return new CancelMsg1();
	}

	public Abstract_SetPrice getSetPrice() {
		return new SetPrice1();
	}

	public Abstract_SetInitialValues getSetInitialValues() {
		return new SetInitialValues1();
	}

	public Abstract_ReadyMsg getReadyMsg() {
		return new ReadyMsg1();
	}

	public Abstract_PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit1();
	}

	public Abstract_TotalPrice getTotalPrice() {
		return new TotalPrice1();
	}

	public Abstract_GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg1();
	}

	public Abstract_StopMsg getStopMsg() {
		return new StopMsg1();
	}

	public Abstract_PrintReceipt getPrintReceipt() {
		return new PrintReceipt1();
	}

}
