package 멀티스레드예제;

//가상의 로봇 세 개를 만들어 100m 레이스 경기

class RobotRace extends Thread {
	//생성자
	public RobotRace(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + "가" + i * 10 + "m전진");
			try {
				sleep(500); // 500/1000 => 0.5초마다
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
}

public class RobotRaceStart {
	public static void main(String[] args) {
		RobotRace robotA, robotB, robotC;  //참조변수 생성
		
		robotA = new RobotRace("로봇-A");
		robotB = new RobotRace("로봇-B");
		robotC = new RobotRace("로봇-C");
		
		robotA.start();
		robotB.start();
		robotC.start();
	}
}
