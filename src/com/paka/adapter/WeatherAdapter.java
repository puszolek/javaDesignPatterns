package com.paka.adapter;

public class WeatherAdapter {

	public int findTemperature(int zipCode) {

		String city = null;

		if (zipCode == 01142) {
			city = "Warszawa, Wola";
		} else if (zipCode == 21044) {
			city = "Trawniki";
		}

		WeatherFinder wf = new WeatherFinderImpl();
		int temp = wf.find(city);

		return temp;
	}

}
