package com.testyantra.didemo.util;

import com.testyantra.didemo.dao.I;
import com.testyantra.didemo.dao.impl.A;

public class Manager {

	public I getI() {
		return new A();
	}
}
