package co.jp.chapter09;

public class JavaHomework9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//質問1:以下ソースにラムダ式の使う場所を解釈してください。
		//(ActionEvent e) is parameters, "System.out.println("ボタンクリックしました。");" is the RETURN statement. it used for monitor the click event.

		//質問2:以下ソースに匿名クラスの利用する行は?
		//row 4
		
		//練習問題
		//質問13:クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成しま す。変数catのsayHello()メソッドを呼び出してください。
		Animal cat = new Animal("neko");
		cat.sayHello();
		
		//質問14:以下1行を解釈してください。
		//System.out.println(new Animal("cat").getName());  Creating a new object "cat", then call the "getName" method.
		
		//質問15:クラス継承する用キーワードは「 extends 」?
		//yes
		
		//質問20:以下コードをIS-A関係で説明してください。
		//Animal v1 = new Cat("a cat") // Cat is a Animal
		//Animal v2 = new Cat("a dog") // Cat is a Animal

		
	}

}
