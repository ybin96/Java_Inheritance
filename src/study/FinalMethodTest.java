package study;

class Aaa{
	public void hello(){
		System.out.println("A의 hello");
	}

	public final void pro(){
		System.out.println("pro입니다.");
	}
}

class Bbb extends Aaa{

	//자식클래스을 필요하다면 얼마든지 부모의 메소드를 오버라이딩 할 수 있어요!
	public void hello(){				
		System.out.println("B의 hello");
	}
	
	//부모클래스의 final메소드는 오버라이딩 할 수 없어요!
	//public void pro(){
	//	System.out.println("B의 pro입니다.");
	//}
}

class FinalMethodTest
{
	public static void main(String[] args) 
	{
		Bbb ob = new Bbb();
		ob.hello();
		//ob.pro();
	}
}

/*
C:\javaStudy\day0822>javac FinalMethodTest.java
FinalMethodTest.java:19: error: pro() in B cannot override pro() in A
        public void pro(){
                    ^
  overridden method is final
1 error
*/