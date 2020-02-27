package com.example.launchpad.api;

import org.junit.Test;

import com.example.launchpad.api.SomeInterface;

import aQute.launchpad.Launchpad;
import aQute.launchpad.LaunchpadBuilder;
import aQute.launchpad.Service;

public class SomeLaunchpadTest {
	LaunchpadBuilder runfw = new LaunchpadBuilder().bndrun("com.example.launchpad.bndrun");
	
	@Service
	SomeInterface someService;
	
	@Test
	public void testName() throws Exception {
		try (Launchpad fw = runfw.create()) {
			fw.inject(this);
			System.out.println(someService.someMethod());
		}
		runfw.close();
	}
}
