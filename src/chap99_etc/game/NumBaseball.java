package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	//게임 룰: 컴퓨터가 3개의 랜덤 값을 가지고 사용자가 3개의 숫자를 입력(중복 불가)
	//컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를 비교
	//숫자만 같으면 ball 카운팅, 숫자와 위치까지 같으면 strike 카운팅
	//n스트라이크, n볼 출력 / 3스트라이크 = 게임 종료 + 몇 번만에 맞췄는지 출력
	//재시작 하는지 물어보기(1: 리스타트 / 0: 종료)
	
	//스트라이크와 볼의 개수, 몇 번만에 맞췄는지를 세어줄 변수
	private int strike = 0, ball = 0, gameCnt = 0;
	Random rand = new Random();
	
	//컴퓨터 랜덤값 담아줄 배열
	int[] com = new int[3];
	
	//사용자 입력값
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	//게임 시작 메소드
	public void start() {
		while(true) {
			generateRandom();
			
			//컴퓨터 배열 확인
			System.out.println("컴퓨터 숫자 확인 => " + com[0] + ", " + com[1] + ", " + com[2]+"\n");
			while(true) {
				strike = 0;
				ball = 0;
				
				getUserInput();
				
				//유저 입력값 확인
				System.out.println("유저 숫자 확인 => " +user[0] +", " + user[1] +", " + user[2]+"\n");
				if(judgetStrike()) break;
				else continue;
			}
			if(reGame()) continue;
			else break;
		}
	}
	
	//컴퓨터 랜덤 값 3개 생성해주는 메소드
	public void generateRandom() {
		while(true) {
			for(int i=0; i<com.length; i++) {
				com[i] = rand.nextInt(10);
			}
			if(chekDuplicate(com, com.length)) continue;
			else break;
		}
		//중복체크
	}
	
	//중복값 체크 메소드
	public boolean chekDuplicate(int[] arr, int num) {
		boolean isDuplicated = false;
			for(int i=0; i<num;i++) {
				for(int j=0; j<num;j++) {
					if(i!=j && arr[i] == arr[j]) isDuplicated = true;
				}				
			}
		return isDuplicated;
	}
	
	//유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		while(true) {
			for(int i=0; i<user.length; i++) {
				user[i]=sc.nextInt();
			}
			if(chekDuplicate(user, user.length)) {System.out.println("중복값이 있습니다 다시 입력하세요");continue;}
			else break;
		}
		
		//중복체크
	}
	
	//스트라이크 볼 판정하는 메소드
	public boolean judgetStrike() {
		for(int i=0; i<user.length; i++) {
			for(int j=0; j<com.length; j++) {
				if(user[i]==com[j]) {
					if(i==j) {
						strike++;
						if(strike == 3) return true;
					}
					else ball++;
				}
			}
		}
		System.out.println("strike: " + strike + "\nball: " + ball);
		return false;
	}
	
	//재게임 여부
	public boolean reGame() {
		System.out.println("정답입니다!!\n계속하기: '1'\n 끝: '0'");
		while(true) {
		int retry = sc.nextInt();
		if(retry == 0) {
			System.out.println("종료합니다.");
		return false;}
		else if (retry == 1) {
			return true;
		}
		else System.out.println("다시 입력하세요");
		}
	}
}
