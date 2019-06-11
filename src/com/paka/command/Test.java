package com.paka.command;

public class Test {

	public static void main(String[] args) {

		Television tv = new Television();
		RemoteControl rc = new RemoteControl();
		
		CommandOn oc = new CommandOn(tv);
		rc.setCommand(oc);
		rc.pressButton();
		
		CommandOff ofc = new CommandOff(tv);
		rc.setCommand(ofc);
		rc.pressButton();
		
	}

}
