package com.adobe.cq.impl;

import com.adobe.cq.KeyService;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;


//This is a component so it can provide or consume services
@Component

@Service
public class KeyServiceImpl implements KeyService {
	
	
	//Define a class member named key
	private int key = 0;
	
	@Override
	//A basic setter method that sets key
	public void setKey(int val) {
		//Set the key class member
		this.key = val;
	}

	@Override
	//A basic getter that gets key
	public String getKey() {
		//return the value of the key class member
		
		//Convert the int to a String to display it within an AEM web page
		String strI = Integer.toString(this.key);
		return strI;
	}
}
