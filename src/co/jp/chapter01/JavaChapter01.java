package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("Hello world!");
		
		int i = 100;
		System.out.println(i);
		
		int a = 5;
		int b = 18;
		System.out.println(a + b);
		
		
		// mod %
		
		
		i++; //i = i + 1
		i--; //i = i - 1
		
		int x = 100;
		int y = 99;
		
		if (x >y) {
			System.out.println("xはｙより大きい。");
		}else {
			System.out.println("ｘはｙ以下。");
		}
				
		//与或非
		
		int max = x > y ? x : y; // java底层关系判断 易读性不高，别搞。
		System.out.println(max);
	}

}
