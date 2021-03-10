package threads;

import java.awt.Toolkit;
class WorkerThread extends Thread {
	//1) Thread 상속받아서 새로운 WorkerThread 클래스 생성
//       Thread thread = new WorkerThread();
//	     thread.start();
	
	//2) Runnable I/F 구현하는 클래스를 Thread(new Runnable())의 생성자 매개값. p.582~
	
	//3) Runnable I/F 구현하는 익명클래스를 생성. 추천!!
	
	
	@Override
	public void run() {
		Toolkit toolkit  = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			System.out.println("띵"); // 띵 출력해주는거
			try {
				Thread.sleep(500);// 대기시간 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}

public class BeepPrintExample {

	public static void main(String[] args) {
		
		Thread thread = new WorkerThread();
		thread.start(); //스레드 두개가 병렬 구조로 됨. 그래서 띵 출력 띵 소리 ~~~
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); //소리 내주는 메소드
			try {
				Thread.sleep(500);// 대기시간 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("띵"); // 띵 출력해주는거
			try {
				Thread.sleep(500);// 대기시간 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}

	}

}
