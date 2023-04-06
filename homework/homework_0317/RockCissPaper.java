package homework_0317;

import java.util.Random;
import java.util.Scanner;

public class RockCissPaper {
	// 몇승 몇무 몇패인지 셀 변수
	private int win = 0;
	private int draw = 0;
	private int lose = 0;
	Scanner sc = new Scanner(System.in);

	// 승점 담아줄 변수(승:1, 무:0, 패:-1)
	private int score = 0;

	// 승무패 기록을 담아줄 배열
	private int[] wdl;

	// 게임 실행 메소드
	public void start() {
		while (true) {

			// 사용자가 입력한 round 만큼 게임진행
			int round=0;
			while(true) {Scanner scan = new Scanner(System.in);
				try {
					System.out.print("진행할 게임의 판 수를 입력하세요.");
					round = scan.nextInt(); break;
				}catch (Exception e) {
					//sc.nextLine();
					System.out.println("숫자만 입력해주세요.");
				}
			}
			wdl = new int[round];
			
			// 총 10판 진행
			for (int i = 0; i < wdl.length; i++) {
				// 클래스 안에 랜덤 변수를 발생시키는 메소드
				// 1 ~ 3까지 랜덤 변수 발생(1:가위, 2:바위, 3:보)
				int randomVal = generateRandom();
				// int randomVal2 = generateRandom();

				// 사용자 입력 값 받아서 정수형 변환해주는 메소드
				System.out.print("가위, 바위, 보 중에 고르세요: ");
				int userNum = convertUserInput(sc);

				if (userNum == 0) {
					sc.nextLine();
					System.out.println("잘못 입력하셨습니다.");
					// 해당 게임을 다시 진행하기 위해 1 감소
					// for문에서 continue문을 만나면 증감식으로 이동하기 때문
					i--;
					continue;
				}

				// 승, 무, 패 판단해주는 메소드
				// 가위, 바위, 보 비교
				// 무승부
				judgeWdl(userNum, randomVal, i);

			}
			// 승점 계산해주는 메소드
			// 승점 계산
			sumScore();

			if (reGame()) {
				break;
			} else {
				continue;
			}
		}
	}

	// 1~3 중 랜덤 값 발생시키는 메소드
	public int generateRandom() {
		 Random rand = new Random();
		 int a = rand.nextInt(3)+1;
		return a;//Math.random() * 10 % 3 + 1;
	}

	// 사용자 입력 값을 정수형을 변환해주는 메소드
	public int convertUserInput(Scanner sc) {
		String a = sc.next();
		if (a.equals("가위"))
			return 1;
		if (a.equals("바위"))
			return 2;
		if (a.equals("보"))
			return 3;
		return 0;
	}

	// 승, 무, 패 판단 메소드
	public void judgeWdl(int userNum, int randomVal, int i) {
		
		System.out.println("\ncom: " + rcp(randomVal) + " VS " + rcp(userNum) + " :user");
		if (userNum == randomVal) {
			// 비김
			draw++;
			wdl[i] = 0;
			System.out.println("비겼습니다!!");
		} else if (userNum == (randomVal + 1) % 4) {
			// 이김
			win++;
			wdl[i] = 1;
			System.out.println("이겼습니다!!");
		} else {
			lose++;
			wdl[i] = -1;
			System.out.println("졌습니다!!");
		}
	}

	// 승점 계산 및 출력 메소드
	public void sumScore() {
		for (int i : wdl) {
			score += i;
		}
		System.out.println("승: " + win + " 무: " + draw + " 패 " + lose + " / 총점: " + score);
	}

	public boolean reGame() {
		while (true) {
			//System.out.println("\n게임 계속하기: 1   /   게임 그만하기: 2");
			int a;
			while(true) {Scanner scan2 = new Scanner(System.in);
				try {
					System.out.print("\n게임 계속하기: 1   /   게임 그만하기: 2");
					a = scan2.nextInt(); break;
				}catch (Exception e) {
					//sc.nextLine();
					System.out.println("숫자만 입력해주세요.");
				}
			}
			if (a == 2) {
				System.out.println("종료합니다.");
				return true;
			} else if (a == 1) {
				win = 0; lose=0; draw=0;score=0;
				return false;
			} else
				System.out.println("다시 입력하세요.");
		}
	}
	public String rcp(int a) {
		if (a == 1)
			return  "가위";
		else if (a == 2)
			return  "바위";
		else
			return  "보";
	}
}
