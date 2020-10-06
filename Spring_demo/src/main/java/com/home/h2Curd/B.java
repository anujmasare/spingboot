package com.home.h2Curd;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("b")
//@Primary
public class B implements A {
	public  static String om;
	
static {
	System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
	om ="bb";
}	

public void print() {
	System.out.println("BABABABA");
}
}

@Component("c")
//@Primary
 class C implements A {
	static {
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCc");
	}
	public void print() {
		System.out.println("CACACA");
	}
}
