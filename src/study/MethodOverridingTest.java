package study;

// 하늘을 날으는 "새" 클래스를 만들어 봅시다.
class Bird{
	String name;
	String color;
	boolean wing;
	public Bird(){
	}
	public Bird(String name, String color, boolean wing){
		this.name = name;
		this.color = color;
		this.wing = wing;
	}
	public void fly(){
		if(wing == true){
			System.out.println(color + "색 " + name + "(이)가 훨~훨~");
		}else{						
			System.out.println(color + "색 " + name + "(이)가 날 수 없어요");
		}
	}
}

//하늘을 날으는 "비행기" 클래스를 만들어 봅시다.
class Plane extends Bird{
	boolean engine;
	public Plane(){
	}
	public Plane(String name, String color, boolean wing, boolean engine){
		super(name, color, wing);
		this.engine = engine;
	}

	public void fly(){
		if(wing == true && engine == true){
			System.out.println(color+"색 " + name + "(이)가 슝~슝~");
		}else{
			System.out.println(color+"색 " + name + "(이)가 날 수 없어요");
		}
	}
}


class MethodOverridingTest {
	public static void main(String[] args) {
		Bird b = new Bird("참새","노랑",true);
		Bird b2 = new Bird("비둘기", "비둘기", false);
		b.fly();
		b2.fly();

		Plane p = new Plane("보잉747", "하늘", true, true);
		p.fly();
	}
}
