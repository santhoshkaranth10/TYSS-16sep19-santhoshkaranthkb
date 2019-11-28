package com.testyantra.objectclass;

public class USBport {

	public static void connect(Object obj) {
	
		if(obj instanceof Mouse) {
			Mouse m= (Mouse) obj;
			m.scroll();
			m.click();
		}
		else if(obj instanceof Pendrive) {
			Pendrive p = (Pendrive) obj;
			p.read();
			p.write();
		}
		else {
			System.out.println("invalid object");
		}
		
	}
}
