package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Dev\\cap.PNG");//이미지 파일은 바이트 타입으로 읽어와야함. FileInputStream사용
		FileOutputStream fos = new FileOutputStream("C:\\Dev\\copyAry.PNG");
		int data = 0, cnt = 0;//cnt는 몇번 도는지 보는거
		//조금더 빨리 돌게 하는 방법 추가
//		byte[] readBytes = new byte[100]; //이만큼 돌기 전에는 쓰기 작업을 하지 않겠다.
//		while ((data = fis.read(readBytes)) != -1) {
//			fos.write(readBytes);
		while ((data = fis.read()) != -1) {
			fos.write(data);//하나읽어서 하나 담고 반복
			cnt++;
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("end....." + cnt);
	}
}
