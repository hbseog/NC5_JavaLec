package chap17_generic;

public class _02_GenericMethod {
    public static void main(String[] args) {
        String[] strArr = {"java", "javascript", "html"};
        Integer[] intArr = {1,2,3,4,5};
        System.out.println("strArr의 마지막 요소는 " + getLastEle(intArr));
    }
    public static <T> T getLastEle(T[] tArr){
        return tArr[tArr.length-1];
    }
}
