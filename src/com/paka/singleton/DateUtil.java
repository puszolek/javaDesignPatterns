package com.paka.singleton;

public class DateUtil {

	//eager initialization - when you are sure it will be used at least once
	//private static DateUtil instance = new DateUtil();
	
	// lazy initialization - preferred
	private static DateUtil instance = null;

	// static blocks
	// initialized when class is loaded into memory
	/*private static DateUtil instance;
	
	static {
		instance = new DateUtil();
	}*/
	
	private DateUtil() {}

	// synchronized - thread safe
	public static DateUtil getInstance() {

		// lazy initialization
		if (instance == null) {
			instance = new DateUtil();
		}

		return instance;
	}
}
