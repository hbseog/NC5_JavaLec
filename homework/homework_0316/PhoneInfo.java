package homework_0316;

import java.util.Scanner;

public class PhoneInfo {
	// 이름 100개와 전화번호 100개를 담을 수 있는 배열 2개(String)
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	Scanner sc = new Scanner(System.in);
	// 배열의 인덱스를 담고 있을 변수
	int i = 0;

	public void start() {
		boolean isReStart = true;
		while(isReStart) {
			System.out.println("-----메뉴를 선택하세요-----");
			System.out.println("1. 정보입력");
			System.out.println("2. 모든 정보 출력");
			System.out.println("3. 인덱스로 정보 검색");
			System.out.println("4. 종료");
			int chose = sc.nextInt();
			switch (chose) {
			case 1:
				insertPhoneNum();
				break;
			case 2:
				printAllPhoneNum();
				break;
			case 3:
				printPhoneNum();
				break;
			case 4:
				isReStart = false;
				System.out.println("종료합니다.");
				sc.close();
				break;
			default:
				System.out.println("1~4 사이의 번호를 입력해주세요.");
				break;
				
			}
		}
	}

	// 전달받은 이름과 전화번호를 저장하는 메소드
	// insertPhoneNum
	public void insertPhoneNum() {
		System.out.print("이름을 입력하세요: ");
		this.name[i] = sc.next();
		System.out.print("핸드폰번호를 입력하세요: ");
		this.phoneNum[i] = sc.next();
		i++;
	}

	// 저장된 모든 이름과 전화번호를 출력하는 메소드
	// printAllPhoneNum
	public void printAllPhoneNum() {
		for (int j = 0; j < i; j++) {
			System.out.println("이름: " + name[j] + ", 전화번호: " + phoneNum[j]);
		}
	}
	// ex) 이름: 홍길동, 전화번호: 11111111111
	// 이름: 홍길동, 전화번호: 22222222222
	// 이름: 홍길동, 전화번호: 33333333333
	// 이름: 홍길동, 전화번호: 44444444444

	// 전달받은 번호에 해당하는 이름과 전화번호를 출력하는 메소드
	// printPhoneNum
	public void printPhoneNum() {
		System.out.println("조회하고 싶은 번호를 입력하세요. (1~100)");
		while (true) {
			int num = sc.nextInt() - 1;
			if (num >= 0 && num < 100) {
				if (name[num] != null) {
					System.out.println("이름: " + name[num] + ", 전화번호: " + phoneNum[num]);
					break;
				} else {
					System.out.println("해당 번호는 비어있습니다.");
					break;
				}
			} else
				System.out.println("1~100 사이의 번호를 입력해주세요");
		}
	}
	// ex) 이름: 홍길동, 전화번호: 11111111111
}
