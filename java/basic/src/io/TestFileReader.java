package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	public static void main(String[] args){
		try {
			FileReader fr = new FileReader("D:/Users/Samuel/Documents/GitHub/Test/java/io/src/io/TestFileReader.java");
			
			int c;
			while((c = fr.read()) != -1){
				System.out.print((char)c);	// �����ַ�read character
			}
			
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
