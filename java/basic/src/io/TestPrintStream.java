package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;

public class TestPrintStream {
	public static void main(String[] args){
		String s = null;
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		try {
			FileWriter fw = new FileWriter("test.log");
			PrintWriter pw = new PrintWriter(fw);
			
			while((s = br.readLine()) != null){
				if(s.equalsIgnoreCase("exit")){
					break;
				}
				pw.println(new Date() + ": " + s);
			}
			pw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
