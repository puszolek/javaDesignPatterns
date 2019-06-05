package com.paka.singleton;

import java.io.Serializable;

// can be written to the stream and to a file
// not actually Cloneable
public class DateUtilThreadsSerializableCloneable implements Serializable, Cloneable {

	private static final long serialVersionUID = -3316292977299202128L;
	private static volatile DateUtilThreadsSerializableCloneable instance = null;

	private DateUtilThreadsSerializableCloneable() {}

	public static /** synchronized **/ DateUtilThreadsSerializableCloneable getInstance() {
		
		// no point of setting the lock when instance is null
		if (instance == null) {
			// class-level lock - either that or the whole function
			// very expensive process
			synchronized (DateUtilThreadsSerializableCloneable.class) {
				if (instance == null) { // double-null check is ok
					instance = new DateUtilThreadsSerializableCloneable();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
	
	// prevent from cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
