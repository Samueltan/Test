package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
	public static void main(String[] args){
		try {
			FileInputStream fr = new FileInputStream("D:/Users/Samuel/Documents/GitHub/Test/java/io/src/io/TestFileInputStream.java");
			
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
