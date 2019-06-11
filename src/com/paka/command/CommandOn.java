package com.paka.command;

public class CommandOn implements Command {

	Television tv;
	
	public CommandOn(Television tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.on();
	}

}
