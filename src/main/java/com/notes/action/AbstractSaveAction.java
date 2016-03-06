package com.notes.action;

public abstract class AbstractSaveAction extends AbstractAction {
	@Override
	void go() {

		setSpecificProperties();
		
	}

	abstract void setSpecificProperties();

}
