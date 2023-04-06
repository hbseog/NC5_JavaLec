package chap06_class.car;

public class Car {
	//제조사(company, 모델(model), 색상(color), 가격(price)
	//public
	//carInfo() -> 입력한 자동차 정보를 출력
	//제조사: 현대
	//모델: 제네시스
	//색상: 검정
	//가격: 5000
	public String company, model, color;
	public int price;
	
	//기본 생성자 => 매개변수가 없다.
	public Car() {
		System.out.println("기본 생성자 호출");
		//null이 잡혀있으면 예외가 발생할 확률이 높아지므로 빈칸("")으로 초기화해준다.
		company = "";
		model = "";
		color = "";
		}
	
	//매개변수가 있는 생성자
	public Car(String c) {
		company = c;
	}
	//매개변수가 2개인 생성자
	public Car(String c, String m) {
		company = c;
		model = m;
	}
	//매개변수가 3개인 생성자
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	//매개변수명은 어떤 멤버변수를 초기화할지 명확하게 하기위해 멤버변수명과 일치키신다.
	public Car(String company, String model, String color, int price) {
		//생성되는 객체 자체를 갈키는 this 키워드를 사용해서 멤버변수를 지징하도록 한다.
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void carInfo() {
		System.out.println("제조사: " + company + "\n모델: " + model + "\n색상: " + color + "\n가격: " +price);
	}

	@Override
	public String toString() {
		return "Car{" +
				"company='" + company + '\'' +
				", model='" + model + '\'' +
				", color='" + color + '\'' +
				", price=" + price +
				'}';
	}
}
