package chap14_exception;

public class _01_tryCatchFinally {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        String[] strArr = new String[3];
        int index = 0;
        while (true){
            try{
                System.out.println(a[index++]);
//                if(index == 2){
//                    System.out.println(10/0);
//                }
                strArr[0].length();
                System.out.println(a[index++]);
            } catch (NullPointerException ne){
                System.out.println(ne.getMessage());
                System.out.println("널값이라 속성이나 메소드를 사용할 수 없습니다.");
            } catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
                System.out.println("분모가 0이 될 수 없습니다.");
            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(index + "는 배열에 존재하지 않는 인덱스입니다.");
            } finally {
                if(index < 3){
                    if(index == 2){
                        System.out.println("예외발생 프로그램을 종료합니다.");
                    }
                    System.out.println("정상 출력 완료.");
                }
                else {
                    System.out.println("예외발생 while문을 종료합니다.");
                    index=0;
                }
            }
        }
    }
}
