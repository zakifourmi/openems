package io.openems.edge.battery.soltaro.single.versionc.statemachine;

public class Stopped extends StateMachine.Handler {

	@Override
	public StateMachine getNextState(StateMachine.Context context) {
		return StateMachine.UNDEFINED;
	}

}
