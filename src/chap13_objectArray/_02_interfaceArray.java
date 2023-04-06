package chap13_objectArray;

import chap13_objectArray.clazz.English;
import chap13_objectArray.clazz.ILecture;
import chap13_objectArray.clazz.Mathmetics;
import chap13_objectArray.clazz.Programming;

public class _02_interfaceArray {
    public static void main(String[] args) {
        ILecture[] lec1 = new ILecture[3];
        lec1[0] = new English(30, 30);
        lec1[1] = new Mathmetics(30, 30);
        lec1[2] = new Programming(30, 30);

        for(int i=0;i<lec1.length;i++) {
            lec1[i].proceedLecture(30,30);
        }
//        lec1[1] = new English();
//        lec1[1].proceedLecture(30, 30);
    }
}
