package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src/interfaces/Audio.java");
			int readByte = -1;
			while((readByte = fis.read()) != -1) {//다 읽은건지 확인
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
			}
			
		System.out.println();
		System.out.println("end of prog");
		}
	}

	
