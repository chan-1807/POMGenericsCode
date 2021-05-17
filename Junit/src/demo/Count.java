package demo;

import java.util.List;

import org.junit.Ignore;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=JUnitCore.runClasses(Assertion.class,Annotation.class);
		System.out.println(r.getFailureCount());
		List<Failure> fail= r.getFailures();
		for(Failure ff:fail) {
			System.out.println(ff);
		}
		
		
		
	}

}

