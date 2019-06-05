package com.paka.adapter;

public class WeatherUI {

	public void showTemperature(int zipCode) {

		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findTemperature(zipCode));
	}
}
