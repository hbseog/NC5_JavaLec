package homework_0320;

public class ArrayUtility2 {

    static int[] remove(int[] s1, int[] s2) {
        int cnt = 0;
        for (int i : s1) {
            for (int j : s2) {
                if (i == j) {
                    cnt++;
                }
            }
        }
        int index=s1.length;
        int[] arr = new int[s1.length + s2.length - cnt];
        for(int i=0;i<s1.length;i++){
            arr[i] = s1[i];
        }
        for (int i = 0; i < s2.length; i++) {
            int cnt2=0;
            for (int j = 0; j<s1.length ;j++) {
                if (s2[i] != s1[j]) {
                    cnt2++;
                }
                if(cnt2 == s1.length){
                    arr[index] = s2[i];
                    index++;
                }
            }
        }
        return arr;
    }

}

