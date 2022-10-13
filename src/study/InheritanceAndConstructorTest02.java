package study;

class Ad{
	protected int i;
	protected int j;
	public Ad(int i, int j){
		this.i = i;
		this.j = j;
	}
	//생성자를 만들었기 때문에 기본생성자(매개변수를 갖지 않는 생성자)를 제공하지 않아요!
}


class  InheritanceAndConstructorTest02{
	public static void main(String[] args) {
		//Ad ob = new Ad();
		System.out.println("OK");
	}
}
/*
	C:\javaStudy\day0818>javac InheritanceAndConstructorTest02.java
InheritanceAndConstructorTest02.java:13: error: constructor A in class A cannot be applied to given types;
                A ob = new A();
                       ^
  required: int,int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error

*/