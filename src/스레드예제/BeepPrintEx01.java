package �����忹��;

import java.awt.Toolkit;

/*
 * �̹� ������ �̱� ������(�ϳ��� ������, main ������)�� ó���� ���̴�.
 */

public class BeepPrintEx01 {

	public static void main(String[] args) {
		//Toolkit ��ü ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();  //beep()�� �������� �߻���Ű�� �޼ҵ�
			try {
				Thread.sleep(1000);  //1�ʰ� cpu�۵��� ���ߴ°�. ��, 1�� �������� �������� �����
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
