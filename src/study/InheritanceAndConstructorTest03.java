package study;

class Ac{
	protected int i;
	protected int j;	
	public Ac(){
		System.out.println("A의 생성자 동작함");
	}
}

class Bc extends Ac
{
	int k;
	public Bc(){
		super();//부모의 생성자를 요구하는 명령
		System.out.println("B의 생성자 동작함");
	}
}

class  InheritanceAndConstructorTest03{
	public static void main(String[] args) {
		Bc ob = new Bc();	
	}
}
/*
	C:\javaStudy\day0818>java InheritanceAndConstructorTest03
	A의 생성자 동작함
	B의 생성자 동작함

	부모의 생성자가 먼저 동작하고 자식의 생성자가 동작합니다.

*/