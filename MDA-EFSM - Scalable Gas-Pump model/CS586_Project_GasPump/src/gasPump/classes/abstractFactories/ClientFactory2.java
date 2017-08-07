package gasPump.classes.abstractFactories;


import gasPump.classes.dataStore.DataStore;
import gasPump.classes.dataStore.DataStore2_GP2;
import gasPump.classes.strategyClasses.Abstract_CancelMsg;
import gasPump.classes.strategyClasses.Abstract_DisplayMenu;
import gasPump.classes.strategyClasses.Abstract_GasPumpedMsg;
import gasPump.classes.strategyClasses.Abstract_PayMsg;
import gasPump.classes.strategyClasses.Abstract_PrintReceipt;
import gasPump.classes.strategyClasses.Abstract_PumpGasUnit;
import gasPump.classes.strategyClasses.Abstract_ReadyMsg;
import gasPump.classes.strategyClasses.Abstract_ReturnCash;
import gasPump.classes.strategyClasses.Abstract_SetInitialValues;
import gasPump.classes.strategyClasses.Abstract_SetPrice;
import gasPump.classes.strategyClasses.Abstract_StopMsg;
import gasPump.classes.strategyClasses.Abstract_StoreCash;
import gasPump.classes.strategyClasses.Abstract_StoreData;
import gasPump.classes.strategyClasses.Abstract_TotalPrice;
import gasPump.classes.strategyClasses.CancelMsg1;
import gasPump.classes.strategyClasses.DisplayMenuGP2;
import gasPump.classes.strategyClasses.GasPumpedMsg2;
import gasPump.classes.strategyClasses.PayMsg2;
import gasPump.classes.strategyClasses.PrintReceipt2;
import gasPump.classes.strategyClasses.PumpGasUnit2;
import gasPump.classes.strategyClasses.ReadyMsg1;
import gasPump.classes.strategyClasses.ReturnCash1;
import gasPump.classes.strategyClasses.SetInitialValues2;
import gasPump.classes.strategyClasses.SetPrice2;
import gasPump.classes.strategyClasses.StopMsg1;
import gasPump.classes.strategyClasses.StoreCash1;
import gasPump.classes.strategyClasses.StoreData2;
import gasPump.classes.strategyClasses.TotalPrice2;

//########## Part of Abstract Factory Pattern ###############
//Concrete Client Factory 2 Class for GasPump2

public class ClientFactory2 extends AbstractFactory {

	public ClientFactory2(){
		ds = new DataStore2_GP2(); // create DataStore1 object for ClientFactory1
	}
	public DataStore getDataStore() {
		return ds;
	}
	
	public Abstract_StoreData getStoreData() {
		return new StoreData2();
	}

	public Abstract_PayMsg getPayMsg() {
		return new PayMsg2();
	}

	public Abstract_StoreCash getStoreCash() {
		return new StoreCash1();
	}

	public Abstract_DisplayMenu getDisplayMenu() {
		return new DisplayMenuGP2();
	}

	public Abstract_CancelMsg getCancelMsg() {
		return new CancelMsg1();
	}

	public Abstract_SetPrice getSetPrice() {
		return new SetPrice2();
	}

	public Abstract_SetInitialValues getSetInitialValues() {
		return new SetInitialValues2();
	}

	public Abstract_ReadyMsg getReadyMsg() {
		return new ReadyMsg1();
	}

	public Abstract_PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit2();
	}

	public Abstract_TotalPrice getTotalPrice() {
		return new TotalPrice2();
	}

	public Abstract_GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg2();
	}

	public Abstract_StopMsg getStopMsg() {
		return new StopMsg1();
	}

	public Abstract_PrintReceipt getPrintReceipt() {
		return new PrintReceipt2();
	}

	public Abstract_ReturnCash getReturnCash() {
		return new ReturnCash1();
	}
}
