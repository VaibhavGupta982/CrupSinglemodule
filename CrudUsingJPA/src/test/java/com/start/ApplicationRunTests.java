package com.start;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest
public class ApplicationRunTests {
	
	    @LocalServerPort
	    private int port;

	  


		protected String getPath(String rest) {
	        String path = "http://localhost:";
	        return path + port + rest;
	    }
		
		@Test
		public void testAdd() {
			String str = "Junit is working fine";
			Assertions.assertEquals("Junit is working fine", str);
		}
		
}
