package chap22_IO.clazz;


import java.io.Serializable;

//직렬화가 가능하도록 Serializable 인터페이스를 상속
//직렬화와 역직렬화가 일어날 때 사용되는 클래스는 동일해야한다.
public class Car implements Serializable {
    //직렬화할 때 SerialVersionUID 값을 설정해서 역직렬화할 때도 같은 클래스를 사용할 수 있도록 구분자를 넣어준다.
    public static final long SerialVersionUID = 1;
    private String company, model;
    private double maxSpeed;
    private int price;
    //private transient int price, productYear;
    //직렬화에서 제외하고 싶은 멤버번수에는 transient을 타입 앞에 붙여주면 된다.

    public Car(String company, String model, double maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
