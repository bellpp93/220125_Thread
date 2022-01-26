package �����忹��;

import java.awt.Toolkit;

/*
 * ������(Thread)��?
 * 	=>	�����ϰ� �ִ�(���� ����) ���α׷��� ���μ���(process)��� �Ѵ�.
 * 		���� �� ���� ���μ����� �� ������ ���� ������, �����带 �̿��ϸ� �� ���μ��� ������ 
 * 		�ΰ��� �Ǵ� �� �̻��� ���� ���ÿ� �� �� �ִ�.
 * ��� �ڹ� ���ø����̼��� main�����尡 main()�޼ҵ带 �����ϸ鼭 ���۵ȴ�.
 * �̹� ������ �̱� ������(�ϳ��� ������, main ������)�� ó���� ���̴�.
 */

public class BeepPrintEx01 {

	public static void main(String[] args) {
		//Toolkit ��ü ����
		/*
		 * Toolkit Ŭ������ "�ý��� ����"�� ��� ������ �ý��� �ڿ��� ������ �� �ִ� Ŭ�����̴�.
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit();  //getDefaultToolkit�� �����޼ҵ�
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();  //beep()�� �������� �߻���Ű�� �޼ҵ�
			try {
				Thread.sleep(1000);  //1000/1000 => 1�ʰ� cpu�۵��� ���ߴ°�. ��, 1�� �������� �������� �����
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
