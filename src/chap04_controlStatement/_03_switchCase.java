package chap04_controlStatement;

public class _03_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "A";
		//break문을 넣어야 정상적으로 동작하기 떄문에 case별로 항상 break문을 넣어줘야 된다.
		//break문이 없는 경우에는 맞는 조건부터 break문을 만날 때 까지의 case가 모두 실행된다. 
		switch(grade) {
		case "A":
			System.out.println("점수는 90점 이상입니다.");
			break;
		case "B":
			System.out.println("점수는 90점 미만 80점 이상입니다.");
			break;
		case "C":
			System.out.println("점수는 80점 미만 70점 이상입니다.");
			break;
		default:
			System.out.println("점수는 70점 미만입니다.");
			break;
		}
		/*
		switch(10 % 3) {
		case 1:
			break;
		case 2:
			break;
		default
			break;
		}
		//boolean은 switch~case문의 조건으로 사용불가
		switch(10 > 20) {
		case ture:
			break;
		case false:
			break;
		default:
			break;
		}
		*/
	}

}
