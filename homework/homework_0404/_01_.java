package homework_0404;

import java.util.Scanner;

public class _01_ {
    public static void main(String[] args) {
        _01_enum[] se = _01_enum.values();
        System.out.print("나라 이름 입력: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (_01_enum s : se) {
            s.notifyFood(name);
        }
    }
}
