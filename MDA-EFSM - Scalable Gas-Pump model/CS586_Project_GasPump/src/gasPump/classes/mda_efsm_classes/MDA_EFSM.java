package gasPump.classes.mda_efsm_classes;

import gasPump.classes.abstractFactories.AbstractFactory;
import gasPump.classes.stateClasses.GasState;
import gasPump.classes.stateClasses.Start;

//########## Part of State Pattern ###############
//Acts as context class

public class MDA_EFSM {

	GasState gs ; // pointer to current gas state.
	int t;
	

	public MDA_EFSM(){
		    // default constructor
	}
	
	public MDA_EFSM(AbstractFactory af,OutputProcessor op1) {
	
	
		gs = new Start(op1); // initialized to Start state
	}

	public void ChangeState(GasState gs1) {
		gs = gs1;
	}
	
	public void Activate() {
		gs.Activate(this);
	}

	public void Start() {
		gs.Start(this);
	}

	public void Pay(int t) {
		this.t=t;
		gs.Pay(this,t);
	}

	public void Approved() {
		gs.Approved(this);
	}

	public void Reject() {
		gs.Reject(this);
	}

	public void Cancel() {
		gs.Cancel(this);
	}

	public void SelectGas(int g) {
		gs.SelectGas(this,g);
	}

	public void StartPump() {
		gs.StartPump(this);
	}

	public void Pump() {
		gs.Pump(this);
	}

	public void StopPump() {
		gs.StopPump(this);
	}

	public void Receipt() {
		gs.Receipt(this,t);
	}

	public void NoReceipt() {
		gs.NoReceipt(this);
	}
	
}
