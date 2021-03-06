package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

// Use transform io:
// Can operate char other than byte
// Can handle Chinese characters
public class TestTransformIO {
	public static void main(String[] args){
		try {
			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream("char.txt"));
			osw.write("Test transform io function 测试代码");
			System.out.println(osw.getEncoding());
			osw.close();
			
			osw = new OutputStreamWriter(
					new FileOutputStream("char.txt", true),
					"UTF-8");
			osw.write("The 2nd part 第二部分");
			System.out.println(osw.getEncoding());
			osw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
