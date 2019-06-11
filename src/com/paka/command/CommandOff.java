package com.paka.command;

public class CommandOff implements Command {

	Television tv;
	
	public CommandOff(Television tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
	}

}
