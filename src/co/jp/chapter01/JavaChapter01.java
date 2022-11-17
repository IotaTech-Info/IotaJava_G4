package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ans = fuc(5);
		System.out.println(ans);
	
	}
	
	public static int fuc(int x) {
		if (x == 1) return 1;
		return x + fuc(x-1);
	}
	
}
