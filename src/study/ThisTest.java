package study;

class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(){
		//System.out.println("생성자 동작함");
		this("홍길동", 20);
		System.out.println("생성자 동작함");
	}
	public String toString(){
		return "이름:"+name+",나이:"+age;
	}
}
class ThisTest {
	public static void main(String[] args) {
		Person p1 = new Person("이순신", 30);
		Person p2 = new Person();
		System.out.println(p1);
		System.out.println(p2);
	}
}

/*
C:\javaStudy\day0818>javac ThisTest.java
ThisTest.java:10: error: call to this must be first statement in constructor
                this("홍길동", 20);
                    ^
1 error

==> this()는 생성자의 첫번째 문장에 와야 합니다.
*/