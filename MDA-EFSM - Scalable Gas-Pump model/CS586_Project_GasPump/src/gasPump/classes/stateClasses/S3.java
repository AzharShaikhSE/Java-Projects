package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
//State Class S3

public class S3 extends GasState {

	OutputProcessor op;
	public S3(OutputProcessor op) {
		super(op);
		this.op=op;
		System.out.println();
		System.out.println("---->System is currently in State S3<----");
		System.out.println();
	}

	public void SelectGas(MDA_EFSM m, int g){
		op.SetPrice(g);
		m.ChangeState(new S4(op)); // change state to S4
	}
	
	public void Cancel(MDA_EFSM m){
		op.CancelMsg();
		m.ChangeState(new S0(op)); // change state to S0
	}
}
