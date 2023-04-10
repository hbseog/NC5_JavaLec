package chap22_IO;

import chap22_IO.clazz.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _11_dataInputOutputStream {
    public static void main(String[] args){
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\lecture\\car.txt"));
            dos.writeUTF("현대");
            dos.writeUTF("아반떼");
            dos.writeDouble(189.3);
            dos.writeInt(3000);
            dos.writeUTF("기아");
            dos.writeUTF("k7");
            dos.writeDouble(195.2);
            dos.writeInt(3500);
            dos.writeUTF("스파크");
            dos.writeUTF("모닝");
            dos.writeDouble(180.1);
            dos.writeInt(1500);
            dos.flush();
            dos.close();
            DataInputStream dis = new DataInputStream(new FileInputStream("C:\\lecture\\car.txt"));
            List<Car> carList = new ArrayList<Car>();
            for (int i = 0; i < 3; i++) {
                String company = dis.readUTF();
                String model = dis.readUTF();
                double maxSpeed = dis.readDouble();
                int price = dis.readInt();

                Car c = new Car(company,model,maxSpeed,price);
                carList.add(c);
            }
            System.out.println(carList.toString());
            dis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
