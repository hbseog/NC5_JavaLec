package bank;
import java.security.PublicKey;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Account{
	int accountNum;
	String name;
	int money;
	int pwd;
	
	public Account() {}

	public Account(int accountNum, String name, int money, int pwd) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.money = money;
		this.pwd = pwd;
	}
	void printAccount() {
		JOptionPane.showMessageDialog(null, "계좌번호: "+accountNum+"\n이름: "+name+"\n잔액: "+money+"\n비밀번호: "+pwd);
	}
}


public class Bank {
	static int index=0;
	static Account[] accounts = new Account[100];
	
public static void createAccount(){
		
		String _accountNum = JOptionPane.showInputDialog("계좌번호 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String _money = JOptionPane.showInputDialog("잔액 입력");
		String _pwd = JOptionPane.showInputDialog("비밀번호 입력");
		int accountNum = Integer.parseInt(_accountNum);
		int money = Integer.parseInt(_money);
		int pwd = Integer.parseInt(_pwd);
		Account account = new Account(accountNum, name, money, pwd);
		accounts[index++] = account;
	}

public static void search() {
	for(int i=0; i<index;i++)
	accounts[i].printAccount();
}

	public static void main(String[] args) {
		do {
			String num = JOptionPane.showInputDialog("메뉴 선택 \n 1. 계좌개설\n 2. 입금\n 3. 출금\n 4. 송금 \n 5. 계좌조회");
			switch(num) {
			case "1":
				createAccount();
				break;
			case "2":
			case "3":
			case "4":
			case "5":
				search();
				break;
			}
		} while (true);
		
	}
	
}
