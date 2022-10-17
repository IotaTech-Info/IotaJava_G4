package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		//質問1
		int a = 56;
		System.out.println("成績ランキング判断。入力値＝"+a);
		if(a>=90) {
			System.out.println("A");
		} else if(a>=80) {
			System.out.println("B");
		} else if(a>=70) {
			System.out.println("C");
		} else if(a>=60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

		//質問2
		int b = 3340;
		System.out.println("金額は"+b+"円です。");
		int t;
		int kinsyu[] = {500,100,10,5,1};
		for(int i=0;i<4;i++) {
			t = b/kinsyu[i];
			if (t>0) {
				System.out.println(kinsyu[i]+"円は"+t+"枚です。");
			}
			b = b - t*kinsyu[i];
		}
	}
}