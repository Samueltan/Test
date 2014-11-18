package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// In order to read one line a time
public class TestBufferedReader {
	public static void main(String[] args){
		try {
			FileReader fr = new FileReader("D:/Users/Samuel/Documents/GitHub/Test/java/io/src/io/TestBufferedReader.java");
			BufferedReader br = new BufferedReader(fr);
			
			String s;
			while((s = br.readLine()) != null){
				System.out.println(s);	// ����һ���ַ�read a line
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
