package com.itplexus.tgs.framework.test;

import java.util.Arrays;
import java.util.Scanner;

import com.itplexus.tgs.framework.common.util.NameTokenizor;

public class TestClass {

	public static void main(String[] args) throws Exception {

		NameTokenizor nameTkens = new NameTokenizor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:");
		StringBuffer buffer = new StringBuffer();
		sc = new Scanner(sc.nextLine());

		while (sc.hasNext()) {
			buffer.append(sc.next()+" ");
		}

		String[] result = nameTkens.getNamesInTokens(buffer.toString());
   
		 //System.out.println(buffer.toString());
		System.out.println( Arrays.asList(result) );
	}
}
