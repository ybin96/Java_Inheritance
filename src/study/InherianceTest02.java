package study;

class Art{
	int i;
	int j;
}
class Bet extends Art{
	int k;
	public Bet(){
		i = 10;
		j = 20;
		k = 30;
	}
	public void info(){
		System.out.println("i:"+i+",j:"+j+",k:"+k);
	}
}
class InherianceTest02 {
	public static void main(String[] args) {
		Bet ob = new Bet();
		ob.info();
	}
}
