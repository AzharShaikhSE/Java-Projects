package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
//State Class Start

public class Start extends GasState {

	OutputProcessor op;
	public Start(OutputProcessor op) {
		super(op);
		this.op=op;
		System.out.println();
		System.out.println("---->System is currently in Start State<----");
		System.out.println();
	}

	public void Activate(MDA_EFSM m){
		op.StoreData();
		m.ChangeState(new S0(op));  // change state to S0
	}
}
