package com.springjetty.integration.services;

import org.springframework.stereotype.Service;

@Service("conversionRestService")
public class ConversionRestServiceImpl implements ConversionRestService {

	public String convertInchToFeet(int i) {
		 int inch = i;  
	        double feet = 0;  
	        feet =(double) inch / 12;  
	        
	        return "<InchToFeetService>"  
	        + "<Inch>" + inch + "</Inch>"  
	          + "<Feet>" + feet + "</Feet>"  
	         + "</InchToFeetService>"; 
	}

	public String convertFeetToInch(int f) {
		int inch = 0;  
        int feet = f;  
        inch = 12 * feet;  
   
        return "<FeetToInchService>"  
          + "<Feet>" + feet + "</Feet>"  
          + "<Inch>" + inch + "</Inch>"  
          + "</FeetToInchService>";
	}

}
