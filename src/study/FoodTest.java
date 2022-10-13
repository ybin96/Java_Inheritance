package study;

class Food{
	protected double calories;
	protected int price;
	protected double weight;
	
	public Food(double calories, int price, double weight){
		this.calories = calories;
		this.price = price;
		this.weight = weight;
	}
	public Food(){
	}

	public double getWeight(){
		return weight;
	}
	public int getPrice(){
		return price;
	}
	public double getCalories(){
		return calories;
	}
	public void setCalories(double calories){
		this.calories = calories;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
}

class Melon extends Food{
	private String plantation;

	public Melon(double calories, int price, double weight, String plantation){
		super();
		this.calories = calories;
		this.price = price;
		this.weight = weight;
		this.plantation = plantation;
	}	

	public void setPlantation(String plantation){
		this.plantation = plantation;
	}
	public String getPlantation(){
		return plantation;
	}
}

class FoodTest {
	public static void main(String[] args) {
		Melon m = new Melon(100, 10000, 1.5, "쌍용농원");
		System.out.println("칼로리:" + m.getCalories());
		System.out.println("가격:" + m.getPrice() + "원");
		System.out.println("중량:" + m.getWeight() + "kg");
		System.out.println("경작농원:" + m.getPlantation());

	}
}
