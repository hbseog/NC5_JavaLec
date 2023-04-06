package study._0403_1;

public class printInfo extends inputInfo{
    public printInfo(String name, int number, String dep) {
        super(name, number, dep);
    }
    public printInfo(){}

    public void pr(){
        System.out.println("이름: " + getName());
        System.out.println("학번: " + getNumber());
        System.out.println("학과: " + getDep());
    }
}
