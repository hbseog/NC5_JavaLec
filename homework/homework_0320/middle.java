package homework_0320;

import static homework_0320.ArrayUtility2.remove;

public class middle {
    ArrayUtility2 a = new ArrayUtility2();
    public static void main(String[] args) {
        int[] a={1,2,3,4,6,65};
        int[] b={3,4,5,6,7,8,9,90,80,70};
        int[] c = remove(a,b);
        for(int i : c) {
            System.out.println(i);
        }
    }
}
