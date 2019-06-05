package com.paka.singleton;

public class DateUtilThreads {

	private static volatile DateUtilThreads instance = null;

	private DateUtilThreads() {}

	public static /** synchronized **/ DateUtilThreads getInstance() {
		
		// no point of setting the lock when instance is null
		if (instance == null) {
			// class-level lock - either that or the whole function
			// very expensive process
			synchronized (DateUtilThreads.class) {
				if (instance == null) { // double-null check is ok
					instance = new DateUtilThreads();
				}
			}
		}
		return instance;
	}
}
