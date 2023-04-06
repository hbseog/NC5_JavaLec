package homework_0320;

import chap99_etc.game.Lotto;
import chap99_etc.game.NumBaseball;
import homework_0317.RockCissPaper;

import java.util.Scanner;

public class Game {
    Lotto lotto = new Lotto();
    NumBaseball numBaseball = new NumBaseball();
    RockCissPaper rockCissPaper = new RockCissPaper();
    public void start(){
        int chose=0;
        boolean reGame = true;
        while (reGame){
            System.out.println("----게임을 선택하세요!----");
            System.out.println("1. 숫자 야구 게임");
            System.out.println("2. 가위바위보 게임");
            System.out.println("3. 로또 게임");
            System.out.println("4. 종료");
            while (true) {
                try {
                    Scanner sc = new Scanner(System.in);
                    chose = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.print("숫자를 입력해주세요.");
                    continue;
                }
                if(chose >4 || chose<=0){
                    System.out.println("1~4 중에 입력해주세요.");
                }
                else break;
            }
            switch (chose){
                case 1:
                    numBaseball.start();
                    break;
                case 2:
                    rockCissPaper.start();
                    break;
                case 3:
                    lotto.start();
                    break;
                case 4:
                    reGame = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("종료합니다!");
    }
}
