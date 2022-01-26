package ��Ƽ�����忹��;

//������ �κ� �� ���� ����� 100m ���̽� ���

class RobotRace extends Thread {
	//������
	public RobotRace(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + "��" + i * 10 + "m����");
			try {
				sleep(500); // 500/1000 => 0.5�ʸ���
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
}

public class RobotRaceStart {
	public static void main(String[] args) {
		RobotRace robotA, robotB, robotC;  //�������� ����
		
		robotA = new RobotRace("�κ�-A");
		robotB = new RobotRace("�κ�-B");
		robotC = new RobotRace("�κ�-C");
		
		robotA.start();
		robotB.start();
		robotC.start();
	}
}
