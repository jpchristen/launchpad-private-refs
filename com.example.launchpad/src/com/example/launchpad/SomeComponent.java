package com.example.launchpad;

import org.osgi.service.component.annotations.Component;

import com.example.launchpad.api.SomeInterface;

@Component(immediate = true)
public class SomeComponent implements SomeInterface 
{
	@Override
	public String someMethod() {
		return "interface for some component injected";
	}

}
