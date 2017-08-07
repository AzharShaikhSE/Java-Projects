package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
// Abstract State Class

public abstract class GasState {

	public GasState(OutputProcessor op) {
		
	}

	// All methods are abstract
	public void Activate(MDA_EFSM m) {

	}

	public void Start(MDA_EFSM m) {

	}

	public void Pay(MDA_EFSM m, int t) {

	}

	public void Approved(MDA_EFSM m) {

	}

	public void Reject(MDA_EFSM m) {

	}

	public void Cancel(MDA_EFSM m) {

	}

	public void SelectGas(MDA_EFSM m, int g) {

	}

	public void StartPump(MDA_EFSM m) {

	}

	public void Pump(MDA_EFSM m) {

	}

	public void StopPump(MDA_EFSM m) {

	}

	public void Receipt(MDA_EFSM m, int t) {

	}

	public void NoReceipt(MDA_EFSM m) {

	}
}
