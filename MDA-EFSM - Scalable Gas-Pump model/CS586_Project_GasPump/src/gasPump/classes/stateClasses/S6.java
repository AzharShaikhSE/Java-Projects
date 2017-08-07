package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
//State Class S6

public class S6 extends GasState {
	
	OutputProcessor op;
	public S6(OutputProcessor op) {
		super(op);
		this.op=op;
		System.out.println();
		System.out.println("---->System is currently in State S6<----");
		System.out.println();
	}

	public void NoReceipt(MDA_EFSM m){
		op.ReturnCash();
		m.ChangeState(new S0(op)); // change state to S0
	}

	public void Receipt(MDA_EFSM m, int t){
		op.PrintReceipt();
		if(t==1)
			op.ReturnCash();
		m.ChangeState(new S0(op)); // change state to S0
	}
}
