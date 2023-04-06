package homework_0317;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		Scanner scsc = new Scanner(System.in);
		Print laser = new LaserPrinter();
		Print ink = new InkjetPrinter();
		laser.model = "laser";
		laser.maker = "samsung";
		laser.interfacee = "USB";
		ink.model = "ink";
		ink.maker = "LG";
		ink.interfacee = "paraller port";
		int num=0;
		System.out.println("1번: 레이져 / 2번: 잉크젯");
		num = scsc.nextInt();
		switch(num) {
		case 1:
			laser.print();
			break;
		case 2:
			ink.print();
			break;
		}
	}

}
