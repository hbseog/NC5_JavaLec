package homework_0404;

public enum _03_enum {
    JAN(31,31), FEB(28,29), MAR(31,31), APR(30,30), MAY(31,31), JUN(30,30), JUL(31,31), AUG(31,31), SEP(30,30), OCT(31,31), NOV(30,30), DEC(31,31);
    private int normal, leap;

    _03_enum(int normal, int leap) {
        this.normal = normal;
        this.leap = leap;
    }
    public int sumDays(int year){
        if((year%4==0&&year%100!=0)||year%400==0){
            return this.leap;
        }
        else {
            return this.normal;
        }
    }
}
