package chap19_multithread;

import chap19_multithread.clazz.PrintNum;

public class _07_joinMethodEx01 {
    public static void main(String[] args) throws InterruptedException {
        PrintNum pn = new PrintNum();
        pn.printNum(500);
    }


}
