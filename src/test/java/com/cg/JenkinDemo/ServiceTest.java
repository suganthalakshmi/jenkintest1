package com.cg.JenkinDemo;

import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {
	@Test
	public void testMethod(){
		int actual=new Service().getSomething();
		Assert.assertEquals(1, actual);
	}
	

}
