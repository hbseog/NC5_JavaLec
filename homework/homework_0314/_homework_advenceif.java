package homework_0314;

public class _homework_advenceif {

	public static void main(String[] args) {
		// 1. 삼항 조건 연산자를 이용하여 String str = "dBEfIZ"; 를 이용하여 ajEfcC 출력하세요.
		String str = "dBEfIZ";
		String capStr="";
		char set;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				if(str.charAt(i)+33 > 'z')
					set = (char)(('a'- 1)+(str.charAt(i)+33)-'z');
				else set = (char)((int)str.charAt(i)+33);
			else if(str.charAt(i)-33 < 'A')
					set = (char)(('Z' + 1)-('A'-(str.charAt(i)-33)));
				else set = (char)((int)str.charAt(i)-33);
			capStr=set+capStr;
		}
		System.out.println(capStr);
		
	}

}
