package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTransformIO2 {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		
		try {
			while((s = br.readLine()) != null){
				if(s.equalsIgnoreCase("exit")){
					break;
				}
				System.out.println(s.toUpperCase());
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
