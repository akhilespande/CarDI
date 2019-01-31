package com.akhilesh.java.dependencyinjection.injector;

import com.akhilesh.java.dependencyinjection.consumer.CarConsumer;

public interface CarServiceInjector {
	
	public CarConsumer getCarConsumer();

}
