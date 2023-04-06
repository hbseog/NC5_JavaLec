package chap99_etc;

public class countKorean {

	public static void main(String[] args) {
		String str = "가A나B다C라";
		String st = "";
		int count=0;
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			st += ch;
			if(st.matches(".*[가-힣].*")) count++;
			st = "";
		}
		System.out.println(count);
	}
}
