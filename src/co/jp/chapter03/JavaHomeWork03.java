package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a>=90) {
		 System.out.println("A");
		} else if(a>=80&&a<90) {
		 System.out.println("B");
		} else if(a>=70&&a<80) {
		 System.out.println("C");
		} else if(a>=60&&a<70) {
		 System.out.println("D");
		} else {
		 System.out.println("E");
		}

		//質問２
		int b = 3347;
		int num500=0;
		num500=b/500;
		int nokori;
		nokori=b%500;
		int num100=0;
		num100=nokori/100;
		nokori=nokori%100;
		int num10=0;
		num10=nokori/10;
		nokori=nokori%10;
		int num5=0;
		num5=nokori/5;
		nokori=nokori%5;
		int num1=0;
		num1=nokori/1;
		System.out.println("枚数500円"+num500);
		System.out.println("枚数100円"+num100);
		System.out.println("枚数10円"+num10);
		System.out.println("枚数5円"+num5);
		System.out.println("枚数1円"+num1);
		
		
		
			
		

	}
}