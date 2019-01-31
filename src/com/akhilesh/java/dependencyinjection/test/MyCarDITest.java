package com.akhilesh.java.dependencyinjection.test;

import com.akhilesh.java.dependencyinjection.consumer.CarConsumer;
import com.akhilesh.java.dependencyinjection.injector.BrezzaCarServiceInjector;
import com.akhilesh.java.dependencyinjection.injector.EartigaCarServiceInjector;

public class MyCarDITest {
	public static void main(String[] args) {
		CarConsumer carConsumer = null;
		EartigaCarServiceInjector eartigaCarServiceInjector = new EartigaCarServiceInjector();
		carConsumer = eartigaCarServiceInjector.getCarConsumer();
		carConsumer.getCar();
		
		BrezzaCarServiceInjector brezzaCarServiceInjector = new BrezzaCarServiceInjector();
		carConsumer = brezzaCarServiceInjector.getCarConsumer();
		carConsumer.getCar();
	}
}
