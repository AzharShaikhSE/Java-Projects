package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
//State Class S1

public class S1 extends GasState {

	OutputProcessor op;
	public S1(OutputProcessor op) {
		super(op);
		this.op=op;
		System.out.println();
		System.out.println("---->System is currently in State S1<----");
		System.out.println();
	}

	public void Pay(MDA_EFSM m, int t){
		if(t==1){
			op.StoreCash();
			op.DisplayMenu();
			m.ChangeState(new S3(op)); // change state to S3
		}
		else if(t==2){
			System.out.println(" ***** Waiting for Credit Approval *****");
			m.ChangeState(new S2(op)); // change state to S2
			System.out.println();
		}
		
	}
}
