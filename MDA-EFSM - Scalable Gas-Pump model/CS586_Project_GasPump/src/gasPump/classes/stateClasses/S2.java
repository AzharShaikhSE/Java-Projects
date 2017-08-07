package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
//State Class S2

public class S2 extends GasState {

	OutputProcessor op;
	public S2(OutputProcessor op) {
		super(op);
		this.op=op;
		System.out.println();
		System.out.println("---->System is currently in State S2<----");
		System.out.println();
	}

	public void Approved(MDA_EFSM m){
		op.DisplayMenu();
		m.ChangeState(new S3(op)); // change state to S3
	}
	
	public void Reject(MDA_EFSM m){
		op.RejectMsg();
		m.ChangeState(new S0(op)); // change state to S0
	}
}
