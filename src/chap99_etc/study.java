package chap99_etc;

import java.rmi.server.RemoteStub;

class Color{
	String name;
	int aa, bb, cc;
	public void setName(String name) {
		this.name = name;
	}
	public static int Sum(int a, int b) {
		return a+b;
	}
}

public class study {
	public static void main(String[] args) {
		int a=3, b=5;
		
		Color red = new Color();
		Color blue = new Color();
		
		red.setName("red");
		blue.setName("blue");
		
		red.aa = 5;
		blue.bb = 7;
		
		System.out.println(red.name);
		System.out.println(blue.name);
		
		System.out.println(Sum(a, b));
		
		System.out.println(Color.Sum(a, b));
		
		System.out.println(aa(red, blue).cc);
	}
	
	public static int Sum(int a, int b) {
		return a+b; 
	}
	
	public static Color aa(Color a, Color b) {
		Color c = new Color();
		c.cc= a.aa + b.bb;
		return c; 
	}
	
}