package homework_0323;

public class middle3 {
    public static void main(String[] args) {
        //처음에 은행에 맡긴 돈은 10000원입니다
        //   금리는 연 10%입니다
        //   복리이자로 계산했을 때 10년후 얼마가 될까요?
        double money = 10000;
        System.out.println(bank(10));
    }
    static double bank(int b){
        if(b==0) return 10000;
        else return 1.1*(bank(b-1));
    }
}
