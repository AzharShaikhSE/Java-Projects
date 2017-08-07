package gasPump.classes.stateClasses;

import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

//########## Part of State Pattern ###############
//State Class S5

public class S5 extends GasState{
	
	OutputProcessor op;
	public S5(OutputProcessor op) {
		super(op);
		this.op=op;
		System.out.println();
		System.out.println("---->System is currently in State S5<----");
		System.out.println();
	}

	public void Pump(MDA_EFSM m){
		op.PumpGasUnit();
		op.GasPumpedMsg();
		op.TotalPrice();
	}

	public void StopPump(MDA_EFSM m){
		op.StopMsg();
		m.ChangeState(new S6(op)); // change state to S6
	}
}
