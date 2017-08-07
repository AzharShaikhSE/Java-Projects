package gasPump.classes.mda_efsm_classes;

import gasPump.classes.abstractFactories.AbstractFactory;
import gasPump.classes.dataStore.DataStore;
import gasPump.classes.strategyClasses.Abstract_CancelMsg;
import gasPump.classes.strategyClasses.Abstract_DisplayMenu;
import gasPump.classes.strategyClasses.Abstract_GasPumpedMsg;
import gasPump.classes.strategyClasses.Abstract_PayMsg;
import gasPump.classes.strategyClasses.Abstract_PrintReceipt;
import gasPump.classes.strategyClasses.Abstract_PumpGasUnit;
import gasPump.classes.strategyClasses.Abstract_ReadyMsg;
import gasPump.classes.strategyClasses.Abstract_RejectMsg;
import gasPump.classes.strategyClasses.Abstract_ReturnCash;
import gasPump.classes.strategyClasses.Abstract_SetInitialValues;
import gasPump.classes.strategyClasses.Abstract_SetPrice;
import gasPump.classes.strategyClasses.Abstract_StopMsg;
import gasPump.classes.strategyClasses.Abstract_StoreCash;
import gasPump.classes.strategyClasses.Abstract_StoreData;
import gasPump.classes.strategyClasses.Abstract_TotalPrice;

//########## Part of MDA architecture ###############
//########## Part of Strategy Pattern ###############

public class OutputProcessor {

	// Declare DataStore and Abstract factory object
	DataStore ds; 
	AbstractFactory af;
	Abstract_StoreData a1;
	Abstract_PayMsg a2;
	Abstract_StoreCash a3;
	Abstract_DisplayMenu a4;
	Abstract_RejectMsg a5;
	Abstract_CancelMsg a6;
	Abstract_SetPrice a7;
	Abstract_SetInitialValues a8;
	Abstract_ReadyMsg a9;
	Abstract_PumpGasUnit a10;
	Abstract_TotalPrice a11;
	Abstract_GasPumpedMsg a12;
	Abstract_StopMsg a13;
	Abstract_PrintReceipt a14;
	Abstract_ReturnCash a15;
	
	public OutputProcessor(AbstractFactory af){
		this.af=af;
		initialize(af);
	}

	void initialize(AbstractFactory af) { // Call the factory to get actions and set the classes pointer 
		ds = af.getDataStore();
		a1 = af.getStoreData();
		a2 = af.getPayMsg();
		a3 = af.getStoreCash();
		a4 = af.getDisplayMenu();
		a5 = af.getRejectMsg();
		a6 = af.getCancelMsg();
		a7 = af.getSetPrice();
		a8 = af.getSetInitialValues();
		a9 = af.getReadyMsg();
		a10 = af.getPumpGasUnit();
		a11 = af.getTotalPrice();
		a12 = af.getGasPumpedMsg();
		a13 = af.getStopMsg();
		a14 = af.getPrintReceipt();
		a15 = af.getReturnCash();
	}

	public void StoreData() {
		a1.StoreData(ds);
	}

	public void PayMsg() {
		a2.PayMsg();
	}

	public void StoreCash() {
		a3.StoreCash(ds);
	}

	public void DisplayMenu() {
		a4.DisplayMenu();
	}

	public void RejectMsg() {
		a5.RejectMsg();
	}

	public void CancelMsg() {
		a6.CancelMsg();
	}

	public void SetPrice(int g) {
		a7.SetPrice(g,ds);
	}

	public void SetInitialValues() {
		a8.SetInitialValues(ds);
	}

	public void ReadyMsg() {
		a9.ReadyMsg();
	}

	public void PumpGasUnit() {
		a10.PumpGasUnit(ds);
	}

	public void TotalPrice() {
		a11.TotalPrice(ds);
	}

	public void GasPumpedMsg() {
		a12.GasPumpedMsg(ds);
	}

	public void StopMsg() {
		a13.StopMsg();
	}

	public void PrintReceipt() {
		a14.PrintReceipt(ds);
	}

	public void ReturnCash() {
		a15.ReturnCash(ds);
	}

}
