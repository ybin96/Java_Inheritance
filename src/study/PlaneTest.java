package study;

class Planet{
	private String producer;
	private String model;
	private int seats;
	public static int planes;

	public static int getPlanes(){
		return planes;
	}

	public Planet(){
		planes++;
	}

	public Planet(String producer, String model, int seats){
		this.producer = producer;
		this.model = model;
		this.seats = seats;
		planes++;
	}

	public int getSeats(){
		return seats;
	}
	public String getModel(){
		return model;
	}
	public String getProducer(){
		return producer;
	}
	public void setSeats(int seats){
		this.seats = seats;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setProducer(String producer){
		this.producer = producer;
	}


}

class PlaneTest 
{
	public static void main(String[] args) 
	{
		System.out.println("비행기의 대수 : " + Planet.getPlanes());
		System.out.println("비행기의 대수 : " + Planet.planes);
		Planet p1 = new Planet();
		Planet p2 = new Planet("보잉","보잉747",200);
		System.out.println("비행기의 대수 : " + Planet.getPlanes());
		p1.setProducer("보잉");
		p1.setModel("보잉757");
		p1.setSeats(300);
		p2.setSeats(250);
		System.out.println(p1.getProducer());
		System.out.println(p1.getModel());
		System.out.println(p1.getSeats());
		System.out.println("--------------------------");
		System.out.println(p2.getProducer());
		System.out.println(p2.getModel());
		System.out.println(p2.getSeats());
	}
}
