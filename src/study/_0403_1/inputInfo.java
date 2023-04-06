package study._0403_1;

import java.util.Scanner;

public class inputInfo extends studuntInfo{


    public inputInfo(String name, int number, String dep) {
        super(name, number, dep);
    }
    public inputInfo(){

    }
    public studuntInfo Input(){

        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        setName(sc.nextLine());
        System.out.println("학번: ");
        setNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("학과: ");
        setDep(sc.nextLine());
        studuntInfo stt = new studuntInfo(getName(),getNumber(),getDep());
        return stt;
    }
}
