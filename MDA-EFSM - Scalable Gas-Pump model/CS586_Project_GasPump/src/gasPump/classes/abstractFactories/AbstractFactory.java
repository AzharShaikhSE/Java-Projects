package gasPump.classes.abstractFactories;
import gasPump.classes.dataStore.DataStore;
import gasPump.classes.strategyClasses.*;

// ########## Part of Abstract Factory Pattern ###############
// Abstract Factory Class

public abstract class AbstractFactory {

	DataStore ds; // initialize Datastore object.
	
	public DataStore getDataStore() {
		return null;
	}
	
	public Abstract_StoreData getStoreData() {
		return null;
	}

	public Abstract_PayMsg getPayMsg() {
		return null;
	}

	public Abstract_StoreCash getStoreCash() {
		return null;
	}

	public Abstract_DisplayMenu getDisplayMenu() {
		return null;
	}
	
	public Abstract_RejectMsg getRejectMsg() {
		return null;
	}

	public Abstract_CancelMsg getCancelMsg() {
		return null;
	}

	public Abstract_SetPrice getSetPrice() {
		return null;
	}

	public Abstract_SetInitialValues getSetInitialValues() {
		return null;
	}

	public Abstract_ReadyMsg getReadyMsg() {
		return null;
	}

	public Abstract_PumpGasUnit getPumpGasUnit() {
		return null;
	}

	public Abstract_TotalPrice getTotalPrice() {
		return null;
	}

	public Abstract_GasPumpedMsg getGasPumpedMsg() {
		return null;
	}

	public Abstract_StopMsg getStopMsg() {
		return null;
	}

	public Abstract_PrintReceipt getPrintReceipt() {
		return null;
	}

	public Abstract_ReturnCash getReturnCash() {
		return null;
	}
}
