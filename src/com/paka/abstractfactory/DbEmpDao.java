package com.paka.abstractfactory;

public class DbEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Employee to Db");
	}

}
