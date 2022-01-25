package 스레드예제;

import java.awt.Toolkit;

/*
 * 이번 예제는 싱글 스레드(하나의 스레드, main 스레드)가 처리한 것이다.
 */

public class BeepPrintEx01 {

	public static void main(String[] args) {
		//Toolkit 객체 생성
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();  //beep()는 비프음을 발생시키는 메소드
			try {
				Thread.sleep(1000);  //1초간 cpu작동을 멈추는것. 즉, 1초 간격으로 비프음을 울려라
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
