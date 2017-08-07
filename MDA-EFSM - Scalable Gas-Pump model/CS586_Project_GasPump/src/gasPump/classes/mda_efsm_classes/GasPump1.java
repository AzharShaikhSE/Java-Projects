package gasPump.classes.mda_efsm_classes;

import gasPump.classes.abstractFactories.AbstractFactory;
import gasPump.classes.dataStore.DataStore;

public class GasPump1 {

	MDA_EFSM m; // pointer to the MDA-EFSM object
	DataStore ds; // pointer to the Data Store object
	AbstractFactory af; // pointer to the Abstract factory object

	public GasPump1(AbstractFactory af1, MDA_EFSM m1) {
		af = af1;
		ds = af.getDataStore();
		m = m1;

	}

	public void Activate(float a, float b) {
		if ((a > 0) && (b > 0)) {
			ds.setTemp_regularGas1(a);
			ds.setTemp_superGas1(b);
			m.Activate();
		}
	}

	public void Start() {
		m.Start();
	}

	public void PayCredit() {
		m.Pay(2); // 2-PayCredit
	}

	public void Reject() {
		m.Reject();
	}

	public void Cancel() {
		m.Cancel();
	}

	public void Approved() {
		m.Approved();
	}

	public void Super() {
		System.out.println(" ***** You have selected Super Gas *****");
		m.SelectGas(2); // 1-Regular, 2-Super
	}

	public void Regular() {
		System.out.println(" ***** You have selected Regular Gas *****");
		m.SelectGas(1);
	}

	public void StartPump() {
		m.StartPump();
	}

	public void PumpGallon() {
		m.Pump();
	}

	public void StopPump() {
		m.StopPump();
		m.Receipt();
	}

}
