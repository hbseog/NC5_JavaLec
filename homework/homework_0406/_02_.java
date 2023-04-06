package homework_0406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _02_ {
    public static void main(String[] args) {
        List<HistoricPerson> hList = new ArrayList<HistoricPerson>();
        hList.add(new HistoricPerson("이도", "한글", "조선"));
        hList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
        hList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
        hList.add(new HistoricPerson("장영실", "측우기", "조선"));
        hList.add(new HistoricPerson("이성계", "조선건국", "조선"));
        hList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
        hList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
        hList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
        hList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
        hList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
        Scanner sc = new Scanner(System.in);
        
        System.out.print("검색할 업적을 입력하세요: ");
        String ac = sc.nextLine();
        Stream<HistoricPerson> hStream = hList.stream().map(a->a.getPersonInfo(ac)).filter(z->z.name!=null);
        hStream.forEach(b-> System.out.println(b.toString()));


        System.out.println("-------------------\n");


        Stream<HistoricPerson> hStream2 = hList.stream().filter(c->c.getName().charAt(0)=='이');
        hStream2.forEach(d-> System.out.println("이씨: "+d.toString()));


        System.out.println("-------------------\n");


        System.out.print("검색할 나라를 입력하세요: ");
        String ac2 = sc.nextLine();
        Stream<HistoricPerson> hStream3 = hList.stream().map(a->a.getSameCountryPerson(ac2)).filter(z->z.name!=null);
        hStream3.forEach(b-> System.out.println(b.toString()));

//찐막
        System.out.println("-------------------\n");

        Stream<HistoricPerson> hStream4 = hList.stream().filter(a-> a.getName().length()>=4);
        hStream4.forEach(b-> System.out.println("성이 두 글자인 인물: "+b.toString()));
    }
}
