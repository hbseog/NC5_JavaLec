package study;

public class programmers {

	public static void main(String[] args) {
		compare_data(1);
	}
	
	public static boolean compare_data(int input_data) {
		int aa[] = {1, 3, 5, 7, 9};
		for (int num : aa) {
			if (num == input_data)
				return true;
		}
		return false;
	}
}