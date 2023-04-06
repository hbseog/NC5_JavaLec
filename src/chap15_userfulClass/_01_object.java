package chap15_userfulClass;

public class _01_object {
    public static class Example implements Cloneable{
        //clone 메소드는 Cloneable 인터페이스를 상소받아 clone()을 직접 구현해야 사용할 수 있다.
        public Object clone(){
            Object obj = null;
            try{
                //super.clone() => Object에 있는 clone메소드를 호출하는데 clone메소드에서 전달하는 예외가 CloneNotSupportedException이기 때문에
                //catch구문에서 동일한 예외로 받아준다.
                obj = super.clone();
            }catch (CloneNotSupportedException ce){
                System.out.println(ce.getMessage());
            }
            return obj;
        }
    }
    public static void main(String[] args) {
        Example ex1 = new Example();
        
        //객체의 깊은 복사
        Example ex2 = (Example)ex1.clone();
        if(ex1.equals(ex2)){
            System.out.println("같다");
        }
        else{
            System.out.println("다르다");
        }
        //객체의 얕은 복사
        ex2 = ex1;
        if(ex1.equals(ex2)){
            System.out.println("같다");
        }
        else{
            System.out.println("다르다");
        }
    }
}
