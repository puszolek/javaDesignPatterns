package com.paka.abstractfactory;

public class XmlDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {

		Dao dao = null;

		if (type.equals("emp")) {
			dao = new XMLEmpDao();
		} else if (type.equals("dept")) {
			dao = new XMLDeptDao();
		}

		return dao;
	}

}
