package chap15_userfulClass;

public class _11_Integer {
    public static void main(String[] args) {
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(200);
        //주소값비교
        System.out.println(num1==num2);
        //equals메소드가 오버라이딩 되어있어 값만 비교
        System.out.println(num1.equals(num2));
        //크면1 같으면0 작으면-1
        System.out.println(num1.compareTo(num2));
        //문자열을 정수형으로 변환
        String numStr = "1000";
        int convertNum = Integer.parseInt(numStr);
        System.out.println(Integer.valueOf(convertNum));

        //int의 최대값, 최소값을 상수인 멤버로 지정해놔서 멤버변수를 호출하면 확인 가능하다.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //문자열로 변환
        String converSrt = num1.toString();
        System.out.println(converSrt.getClass().getName());

        //사이즈 바이트 타입확인
        System.out.println("사이즈는"+num1.SIZE);
        System.out.println("바이트는"+num1.BYTES);
        System.out.println("타입은"+num1.TYPE);
        
        //문자열을 정수형으로 변환을 하는
        //System.out.println(Integer.parseInt("FF"));
        System.out.println(Integer.parseInt("FF",16));
    }
}
