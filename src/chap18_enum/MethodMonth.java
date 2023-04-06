package chap18_enum;

public enum MethodMonth {
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
    private int monthVal;

    public int getMonthVal() {
        return monthVal;
    }

    MethodMonth(int monthVal) {
        this.monthVal = monthVal;
    }

    public static void printMonth(int month) {
        MethodMonth[] monthArr = values();
        for (int i = 0; i < monthArr.length; i++) {
            if (monthArr[i].getMonthVal() == month) {
                System.out.println("엽력한 달은" + monthArr[i] + "월입니다.");
            } else System.out.println("입력한 달과 값이 다릅니다.");

        }

    }
    public void printAddMonth(int month){
        int remain = month;
        while (month >12){
            remain -=12;
        }
            System.out.println(month + "개월 뒤는" + (this.getMonthVal() + remain) + "월입니다.");
    }
}
