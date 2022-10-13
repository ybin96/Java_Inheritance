package study;

class Ar{
	int i;
	protected int j;
}
class Br extends Ar{
	int k;
	public Br(){
		i = 10;
		j = 20;		//오류발생
		k = 30;
	}
	public void info(){
		System.out.println("i:"+i+",j:"+j+",k:"+k);
	}
}
class InherianceTest04 {
	public static void main(String[] args) {
		Br ob = new Br();
		ob.info();
	}
}

/*
	C:\javaStudy\day0818>java InherianceTest02
i:10,j:20,k:30

C:\javaStudy\day0818>javac InherianceTest03.java
InherianceTest03.java:9: error: j has private access in A
                j = 20;         //오류발생
                ^
InherianceTest03.java:13: error: j has private access in A
                System.out.println("i:"+i+",j:"+j+",k:"+k);
                                                ^
2 errors


===> 상속관계에 있는 자식클래스라 하더라도 
		부모클래스의 private맴버에는 접근할 수 없어요!!!

*/