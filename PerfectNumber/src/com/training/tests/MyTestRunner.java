package com.training.tests;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result = JUnitCore.runClasses(MyTestSuite.class);
		for (Failure failure: result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
