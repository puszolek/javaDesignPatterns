package com.paka.abstractfactory;

public class Test {

	public static void main(String[] args) {

		DaoAbstractFactory daf = DaoProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		dao.save();
	}

}
