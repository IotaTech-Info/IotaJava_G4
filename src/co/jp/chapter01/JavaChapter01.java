package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello,World");
		
		int i = 100;
		
		i++;//i = i+1
		i--;//i = i-1
		
		System.out.println(i);
		
		float a = 5F, b = 18F;
		
		System.out.println("a+b:"+(a+b));
		System.out.println("a+b:"+(a-b));
		System.out.println("a+b:"+(a*b));
		System.out.println("a+b:"+(a/b));
		
		int x = 17, y = 2;
		
		System.out.println(x%y);
		
		int d = 100, e = 99;
		
		if(d > e) {
			System.out.println("d > e");
		}else {
			System.out.println("d < e");
		}
		
		int f = 100, g = 50;
		int max = f > g ? f : g;
		//if (f > g ){
		//	int max = f;  
		//}else {
		//	int max = g;
		//}
		System.out.println(max);


	}

}
