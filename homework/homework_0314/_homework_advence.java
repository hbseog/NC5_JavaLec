package homework_0314;

public class _homework_advence {

	public static void main(String[] args) {
		// 1. 삼항 조건 연산자를 이용하여 String str = "dBEfIZ"; 를 이용하여 ajEfcC 출력하세요.
		String str = "dBEfIZ";
		String capStr="";
		for(int i=0;i<str.length();i++) {
			char set = str.charAt(i)=='Z'?
			'a':
			str.charAt(i)=='a'?
			'Z':
			str.charAt(i)>='A'&&str.charAt(i)<='Z'?
	        (char)((int)str.charAt(i)+33):
			(char)((int)str.charAt(i)-33);
			capStr=set+capStr;
		}
		System.out.println(capStr);
	}

}
