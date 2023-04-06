package chap04_controlStatement;

import java.util.ArrayList;
import java.util.List;

public class _11_continue {

	public static void main(String[] args) {
		//1. for문의 continue
		for(int i=0; i<10; i++) {
			//0~4까지는 추렭되지 않고 증감식으로 돌아가서 i를 1 증가, 다시 조건을 판별
			if(i<5) continue;
			System.out.println(i);
		}
		
		//2. while의 continue
		//while문은 증감식이 없어서 조건식으로 돌아간다.
		int num = 0;
		while(num <= 20) {
			num++;
			if(num % 3 == 0) continue;
			System.out.println(num);
		}
		
		//3.
		List<String> memberList = new ArrayList<String>(); 
		//모든 회원 아이디에 a를 붙이는 작업
		for(int i=0; i<memberList.size(); i++) {
			//아이디가 admin인 회원은 제외
			if(memberList.get(i).equals("admin"))continue;
			String newMemberId = memberList.get(i) + "a";
		}
	}

}
