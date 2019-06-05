package com.paka.singleton;

import java.io.Serializable;

// can be written to the stream and to a file
public class DateUtilThreadsSerializable implements Serializable {

	private static final long serialVersionUID = -3316292977299202128L;
	private static volatile DateUtilThreadsSerializable instance = null;

	private DateUtilThreadsSerializable() {}

	public static /** synchronized **/ DateUtilThreadsSerializable getInstance() {
		
		// no point of setting the lock when instance is null
		if (instance == null) {
			// class-level lock - either that or the whole function
			// very expensive process
			synchronized (DateUtilThreadsSerializable.class) {
				if (instance == null) { // double-null check is ok
					instance = new DateUtilThreadsSerializable();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
}
