package homework_0322.advance;

import java.util.Scanner;

public class advance {
    public static void main(String[] args) {
        //int compareTo(String str): String s; s.compareTo(Strint str) => str과 비교해서 같으면 0, 사전순으로 s가 앞쪽이면 1, 뒤쪽이면 -1 리턴
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] ch = new String[input.length()];
        String[] ch2 = new String[input.length()];
        for (int i=0; i<input.length();i++) {
            ch[i] = input.substring(i,i+1);
            System.out.println("c["+i+"]= "+ch[i]);
        }
        ch[input.length()-1]=input.substring(input.length()-1,input.length());
        String b="";
        for(int i=0; i<input.length();i++){
            if(i!=input.length()-1){
                for (int j = 0; j<input.length()-1;j++){
                    //String a = "a"; String bb="k";
                   // System.out.println(a.compareTo(bb));
                    //System.out.println(ch[i].compareTo(ch[i+1])==-1);
                    if(ch[j].compareTo(ch[j+1])>=1){
                        System.out.println("ch["+j+"] =>"+ch[j] + "   ch["+j+"+1] =>"+ch[j+1]);
                        b = new String(ch[j]);
                        ch[j] = new String(ch[j+1]);
                        ch[j+1] = new String(b);
                        System.out.println("ch["+j+"] =>"+ch[j] + "ch["+j+"+1] =>"+ch[j+1]);
                        System.out.println();

                    }
                }
            }
//            ch2[i] = b;
        }
        for(String i : ch){
            System.out.println(i);
        }
    }
}
