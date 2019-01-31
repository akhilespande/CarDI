package com.akhilesh.java.dependencyinjection.consumer;

import com.akhilesh.java.dependencyinjection.service.CarService;

public class MyCarConsumerApplication implements CarConsumer {

	CarService carService;

	public MyCarConsumerApplication() {
	}

	public MyCarConsumerApplication(CarService carService) {
		this.carService = carService;
	}

	@Override
	public void getCar() {
		this.carService.model();

	}

}
