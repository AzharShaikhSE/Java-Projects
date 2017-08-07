package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
// State Class S0

public class S0 extends GasState {

	OutputProcessor op;
	public S0(OutputProcessor op) {
		super(op);
		this.op=op;
		System.out.println();
		System.out.println("---->System is currently in State S0<----");
		System.out.println();
	}

	public void Start(MDA_EFSM m){
		op.PayMsg();
		m.ChangeState(new S1(op)); // change state to S1
	}
}
