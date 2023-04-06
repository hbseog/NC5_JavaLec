package chap13_objectArray;

import chap13_objectArray.clazz.aaa;
import chap13_objectArray.clazz.test;

public class _01_objectArray {
    public static void main(String[] args) {
        //객체배열 선언
//        Lecture[] lectures = new Lecture[3];
//
//
//        //객체배열의 초기화
//        lectures[0] = new Lecture("자바", 30, 50);
//        lectures[1] = new Lecture("c언어", 29, 45);
//        lectures[2] = new Lecture("python", 45, 60);
//
//
//
//        lec1[1].proceedLecture(20,30);
//
//        //객체배열의 사용
//        for(int i = 0; i< lectures.length; i++){
//            lectures[i].proceedLecture();
//        }
//        for (Lecture i : lectures){
//            i.proceedLecture();
//        }
        aaa[] tes = new test[1];
        tes[0] = new test();
        tes[0].aa(1);
    }
}
