package chap05_array;

public class _03_arrayExample {

	public static void main(String[] args) {
		char[] chArr = {'B', 'c', 'T', 'p', 'P', 'i'};
		char[] convertArr = new char[6];
		//소문자는 대문자로 대문자는 소문자로 변경해서 convertArr에 저장
		for(int i=0; i<chArr.length; i++) {
			//else if(chArr[i]>=97&&chArr[i]<=122)
				convertArr[i] 
						= chArr[i]>=65&&chArr[i]<=90
						?convertArr[i] = (char)(chArr[i]+32)
						:(char)(chArr[i]-32);
			System.out.print("chArr["+ i +"] = " + chArr[i] + "  " + "convertArr["+ i +"] = " + convertArr[i] + "\n");
		}
	}
}
