package study;

class Az{
	protected int i;
	protected int j;		
}

class Bz extends Az
{
	int k;
	public Bz(){
		super();//부모의 생성자를 요구하는 명령
		System.out.println("B의 생성자 동작함");
	}
}

class  InheritanceAndConstructorTest04{
	public static void main(String[] args) {
		Bz ob = new Bz();	
	}
}
/*
	C:\javaStudy\day0818>java InheritanceAndConstructorTest03
	A의 생성자 동작함
	B의 생성자 동작함

	부모의 생성자가 먼저 동작하고 자식의 생성자가 동작합니다.

*/