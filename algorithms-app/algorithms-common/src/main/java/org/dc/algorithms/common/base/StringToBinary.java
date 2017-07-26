package org.dc.algorithms.common.base;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringToBinary {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "Java";
		byte[] bytes = s.getBytes();
		
		System.out.println(" Bytes Value " + Arrays.toString(bytes));
		
		StringBuilder binary = new StringBuilder();
		
		for (byte b : bytes) {
			
			int val = b;
			
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}

			binary.append(' ');
		}
		System.out.println("'" + s + "' to binary: " + binary);
	
	
		byte[] infoBin = null;
	    infoBin = "Java".getBytes("UTF-8");
	    for (byte b : infoBin) {
	        System.out.println("c:" + (char) b + "-> "
	                + Integer.toBinaryString(b));
	    }
	}
}
