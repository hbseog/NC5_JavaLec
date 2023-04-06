package study._0403_1;

public class studuntInfo {
    private String name;
    private int number;
    private String dep;

    studuntInfo() {
    }

    public studuntInfo(String name, int number, String dep) {
        this.name = name;
        this.number = number;
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    public void pr(){
        System.out.println("이름: " + getName());
        System.out.println("학번: " + getNumber());
        System.out.println("학과: " + getDep());
    }
}
