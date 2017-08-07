package gasPump.classes.mda_efsm_classes;

import gasPump.classes.abstractFactories.AbstractFactory;
import gasPump.classes.dataStore.DataStore;

public class GasPump2 {

	MDA_EFSM m; // pointer to the MDA-EFSM object
	DataStore ds; // pointer to the Data Store object
	AbstractFactory af; // pointer to the Abstract factory object

	public GasPump2(AbstractFactory af1, MDA_EFSM m1) {
		af = af1;
		ds = af.getDataStore();
		m = m1;

	}

	public void Activate(int a, int b, int c) {
		if ((a > 0) && (b > 0) && (c > 0)) {
			ds.setTemp_regularGas2(a);
			ds.setTemp_premiumGas2(b);
			ds.setTemp_superGas2(c);
			m.Activate();
		}
	}

	public void Start() {
		m.Start();
	}

	public void PayCash(int c) {
		if (c > 0) {
			ds.setTemp_cash(c);
			m.Pay(1); // 1-PayCash
		} else {
			System.out.println("Sorry ! Cash cannot be less than 0");
		}
	}

	public void Cancel() {
		m.Cancel();
	}

	public void Premium() {
		System.out.println(" ***** You have selected Premium Gas *****");
		m.SelectGas(3); // 1-Regular, 2-Super, 3-Premium
	}

	public void Regular() {
		System.out.println(" ***** You have selected Regular Gas *****");
		m.SelectGas(1);
	}

	public void Super() {
		System.out.println(" ***** You have selected Super Gas *****");
		m.SelectGas(2);
	}

	public void StartPump() {
		m.StartPump();
	}

	public void PumpLiter() {
		if (ds.getCash() < ds.getPrice() * (ds.getL() + 1)) {
			System.out.println(" ***** Cash is unsufficient  ***** ");
			m.StopPump();
		} else
			m.Pump();
	}

	public void StopPump() {
		m.StopPump();
	}

	public void Receipt() {
		m.Receipt();
	}

	public void NoReceipt() {
		m.NoReceipt();
	}

}
