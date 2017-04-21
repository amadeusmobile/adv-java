package com.demo.jsf;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("After Phase : " + arg0.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("Before Phase : " + arg0.getPhaseId());

	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}

}
