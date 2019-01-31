package com.akhilesh.java.dependencyinjection.injector;

import com.akhilesh.java.dependencyinjection.consumer.CarConsumer;
import com.akhilesh.java.dependencyinjection.consumer.MyCarConsumerApplication;
import com.akhilesh.java.dependencyinjection.service.EartigaServiceImpl;

public class EartigaCarServiceInjector implements CarServiceInjector{

	@Override
	public CarConsumer getCarConsumer() {
		MyCarConsumerApplication myCarConsumerApplication = new MyCarConsumerApplication(new EartigaServiceImpl());
		
		return myCarConsumerApplication;
	}

}
