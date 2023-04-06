package homework_0323._0327;

import homework_0323._0327.employee.ContractEmployee;
import homework_0323._0327.employee.Employee;
import homework_0323._0327.employee.RegularEmployee;
import homework_0323._0327.employee.TempEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee[] ep = new Employee[100];
		ArrayList<Employee> ep = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		int eno = 0;
		String name = "";
		int pay = 0;
		int bonus = 0;
		int hireYear = 0;
		int workDay = 0;
		
		while(true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 임시직 저장");
			System.out.println("3. 계약직 저장");
			System.out.println("4. 전체 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 종료");
			
			int input = sc.nextInt();
			
			switch(input) {
				case 1 : 
					System.out.print("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					System.out.print("이름을 입력하세요.");
					name = sc.next();
					sc.nextLine();
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					System.out.println("보너스를 입력하세요.");
					bonus = sc.nextInt();
					ep.add(new RegularEmployee(eno, name, pay, 1, bonus));
					(ep.get(ep.size() - 1)).showEmployeeInfo();
					//.showEmployeeInfo();
					System.out.println("----------------");
					break;
				case 2 : 
					System.out.print("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					System.out.print("이름을 입력하세요.");
					name = sc.next();
					sc.nextLine();
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					System.out.println("근무년수를 입력하세요.");
					hireYear = sc.nextInt();
					ep.add(new TempEmployee(eno, name, pay, 1, bonus));
					(ep.get(ep.size() - 1)).showEmployeeInfo();
					System.out.println("----------------");
					break;
				case 3 : 
					System.out.print("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					System.out.print("이름을 입력하세요.");
					name = sc.next();
					sc.nextLine();
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					System.out.println("근무일수를 입력하세요.");
					workDay = sc.nextInt();
					ep.add(new ContractEmployee(eno, name, pay, 1, bonus));
					(ep.get(ep.size() - 1)).showEmployeeInfo();
					System.out.println("----------------");
					break;
				case 4 : 
//					for(int i = 0; i < ep.size(); i++) {
//
//							ep.get(i).showEmployeeInfo();
//							System.out.println("----------------");
//
//					}
					for(Employee ep2 : ep){
						ep2.showEmployeeInfo();
					}
					break;
				case 5 : 
					System.out.print("검색할 사원의 사번을 입력하세요.");
//					for (int i = 0; i < ep.size(); i++) {
//						if(ep.get(i).getEno() == eno){
//							ep.get(i).showEmployeeInfo();
//						}
//					}
					for (Employee ep2 : ep){
						if(ep2.getEno() == eno){
							ep2.showEmployeeInfo();
						}
					}
//					eno = sc.nextInt();
//					[eno].showEmployeeInfo();
					System.out.println("----------------");
					break;
				case 6 : 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default : 
					System.out.println("잘못 입력하셨습니다.");
					continue;
			}
		}
		
	}

}
