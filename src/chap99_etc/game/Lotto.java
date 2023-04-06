package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    //1~45까지 7개의 난수 만들기, 사용자가 1~45까지 6개의 숫자 선택 (중복제거)
    //7번 째 숫자는 보너스 번호
    //1등: 보너스 번호를 제외한 6개의 숫자가 모두 같을 때
    //2등: 보너스 번호를 포함한 6개의 숫자가 같을 때
    //3등: 보너스 번호를 제외한 5개의 숫자가 같을 때
    //4등: // 4개
    //5등: // 3개
    //나머지는 꽝 출력

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int[] lottoNum = new int[7];
    int[] userNum = new int[6];
    int bonus = 0, grade = 0, checkBonus = 0;
    boolean isDuplication = false;

    public void start() {
        while (true) {
            bonus = 0; grade = 0; checkBonus = 0;
            System.out.println("------로또 게임------");

            randNum();

            System.out.println("번호 6개를 입력하세요");

            userInput();

            checkGrade(userNum, lottoNum);

            printNum();

            printResult();

            if(reGame()) break;
        }
        System.out.println("종료합니다!");
    }

    public void randNum() {
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = rand.nextInt(45) + 1;
            if (checkNum(lottoNum, i)) {
                i--;
            }
        }
        bonus = lottoNum[6];
    }

    boolean checkNum(int[] num, int ii) {
        if (ii != 0) {
            for (int i = 0; i < ii; i++) {
                if (num[ii] == num[i])
                    return true;
            }
        }
        return false;
    }

    public void checkGrade(int[] a, int[] b) {
        for (int i : a) {
            for (int j = 0; j < b.length - 1; j++) {
                if (i == b[j]) {
                    grade++;
                } else if (i == bonus) {
                    checkBonus++;
                }
            }
        }
            if (grade == 5 && checkBonus == 1) grade = 2;
            else if (grade == 6) grade = 1;
            else if (grade == 5) grade = 3;
            else if (grade == 4) grade = 4;
            else if (grade == 3) grade = 5;
            else grade = 10;
    }

    public void userInput() {
        for (int i = 0; i < userNum.length; i++) {
            try {
                Scanner sc2 = new Scanner(System.in);
                userNum[i] = sc2.nextInt();
                sc2.nextLine();
            } catch (Exception e) {
                System.out.println("숫자를 입력해 주세요.");
                i--;
                continue;
            }
            if (userNum[i] < 1 || userNum[i] > 45) {
                System.out.println("1~45사이의 숫자를 입력해주세요");
                i--;
            } else if (checkNum(userNum, i)) {
                i--;
                System.out.println("숫자가 중복되었습니다. 다시 입력해주세요.");
            }
        }
    }

    public void printNum(){
        System.out.println("엽릭하신 번호는 ");
        for (int i : userNum){
            System.out.print(i+" ");
        }
        System.out.println("입니다.");

        System.out.println("당첨 번호는 ");
        for (int i=0; i<lottoNum.length-1;i++){
            System.out.print(lottoNum[i]+" ");
        }
        System.out.println(" + 보너스 번호: "+ bonus +"입니다.");
    }

    public void printResult(){
        if(grade<=5) System.out.printf("%d등 입니다!", grade);
        else System.out.println("꽝 입니다.");
    }

    public boolean reGame(){
        System.out.println("다시 하시겠습니까? (yes = '1' 입력   no = 아무키나 눌러주세요)");
        try {Scanner sc2 = new Scanner(System.in);
            if(sc2.nextInt()==1) return false;
            sc2.nextLine();
        } catch (Exception e){return true;}
        return true;
    }
}

