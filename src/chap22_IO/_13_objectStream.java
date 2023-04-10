package chap22_IO;

import chap22_IO.clazz.Car;

import java.io.*;

public class _13_objectStream {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/lecture/oos.txt"));
            Car c1 = new  Car("현대", "아반떼", 155.6, 2000);
            Car c2 = new  Car("현대", "소나타", 180.1, 3000);
            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.flush();
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/lecture/oos.txt"));
            Car car1 = (Car)ois.readObject();
            Car car2 = (Car)ois.readObject();
            System.out.println(car1.toString());
            System.out.println(car2.toString());

            ois.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
