package com.paka.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtilThreadsSerializable dateUtil1 = DateUtilThreadsSerializable.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				new File("C:\\Users\\PAKA\\eclipse-workspace\\designPatterns\\test\\singleton\\dateUtil.ser")));
		oos.writeObject(dateUtil1);

		DateUtilThreadsSerializable dateUtil2 = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File("C:\\Users\\PAKA\\eclipse-workspace\\designPatterns\\test\\singleton\\dateUtil.ser")));
		dateUtil2 = (DateUtilThreadsSerializable) ois.readObject();

		oos.close();
		ois.close();

		System.out.println(dateUtil1 == dateUtil2);
	}

}
