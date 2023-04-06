package homework_0322.advance;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        System.out.println("문자열 입력");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("정수 입력");
        int in = sc.nextInt();
        char[] ch = input.toCharArray();//new char[input.length()];

//        for(int i=0; i<input.length(); i++){
//            ch[i] = input.charAt(i);
//        }
        for(int i=0; i<ch.length;i++){
            if(ch[i]>='a'&& ch[i]<='z'){
                ch[i] -= (char)(in%26);
                    if (ch[i] < 'a') ch[i] +=(char)26;
            }
            else{
                ch[i] += (char)(in%26);
                if (ch[i] > 'Z') ch[i] -=(char)26;
            }
        }
        for(char i : ch){
            System.out.print(i + " ");
        }
    }
}
