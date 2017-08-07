package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
//State Class S4

public class S4 extends GasState {

	OutputProcessor op;
	public S4(OutputProcessor op) {
		super(op);
		this.op=op;
		System.out.println();
		System.out.println("---->System is currently in State S4<----");
		System.out.println();
	}

	public void StartPump(MDA_EFSM m){
		op.SetInitialValues();
		op.ReadyMsg();
		m.ChangeState(new S5(op)); // change state to S5
	}
}
