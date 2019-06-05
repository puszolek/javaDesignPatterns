package com.paka.abstractfactory;

public class DaoProducer {

	public static DaoAbstractFactory produce(String factoryType) {

		DaoAbstractFactory daoFactory = null;

		if (factoryType.equals("xml")) {
			daoFactory = new XmlDaoFactory();
		} else if (factoryType.equals("db")) {
			daoFactory = new DbDaoFactory();
		}

		return daoFactory;
	}

}
