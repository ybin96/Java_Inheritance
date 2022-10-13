package study;

class MyUtil{
	public static int getMax(int a, int b){
		if(b>a){
			a = b;
		}
		return a;
	}	
	public static double getMax(double a, double b){
		if(b>a){
			a = b;
		}
		return a;
	}	
	public static int getMax(int []a){
		int max = a[0];
		for(int i=1; i<a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
	}

}
class MethodOverloadingTest02 {
	public static void main(String[] args) {		
		System.out.println("큰수는 " + MyUtil.getMax(7,9));
		System.out.println("큰수는 " + MyUtil.getMax(20.7, 25.3));
		int []data = {9,7,5};
		System.out.println("큰수는 " + MyUtil.getMax(data));
	}
}
