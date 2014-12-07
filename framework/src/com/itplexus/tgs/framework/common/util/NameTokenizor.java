package com.itplexus.tgs.framework.common.util;

import java.util.Scanner;

public class NameTokenizor {

	public String[] getNamesInTokens(String name) throws Exception {
		if ( name == null)
		   throw new Exception("Invalid or Null Parameter supplied");
		String[] result = name.split(" ");
	//	for (String data : result)
			;//System.out.println(data);
		
		return result;
	}


}
