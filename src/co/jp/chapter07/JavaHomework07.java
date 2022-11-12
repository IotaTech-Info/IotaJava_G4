package co.jp.chapter07;

public class JavaHomework07 {

	public static void main(String[] args) {
		// 質問１︓ペットクラスを定義してください。ペットクラスは名称と年齢を保有して。以下
//		２インスタンスを作成してください。変数１︓cat , 変数２︓dog。catの名称は ”cat”, 年齢
//		=2, dogの名称は ”dog”, 年齢=5。
//		1. クラスを定義する。クラス名は Pet。
//		2. 該当クラスに、「名称」「年齢」属性が保有しています。
//		3. Petクラスをインスタンス化する。以下２つオブジェクトを作成してください。
//		4. オブジェクト１︓変数名 = cat。名称 = “cat“, 年齢 = 2。
//		5. オブジェクト２︓変数名 = dog。名称 = “dog“, 年齢 = 5。
		
		Pet cat =new Pet();
		cat.name="cat";
		cat.age=2;
		Pet dog=new Pet();
		dog.name="dog";
		dog.age=5;
		
		
//		質問︓以下メソッドの静的メンバアクセス所を説明してください。（１箇所）
//		public static void main(String...args) {
//		 	System.out.println("some thing"); // ここに１箇所静的メンバアクセスしている
//		}
//		1. 静的なフィールドは︖原因は︖　回答：アクセスしていません。
//		2. メソッドを呼び出していますか︖　回答：System.out.println()を呼び出しています
//		3. メソッドを呼び出す時、渡すの引数は︖　回答："some thing"
		
//		2. 以下ソースのコンパイルエラーを説明してください。
//		public class Kicker {
//			private String word = "abc";
//			public void print(String name) {
//				System.out.println(name);
//			}
//			public static void main(String...args) {
//				print("dcnet.java.教育");
//				System.out.println(word);
//			}
//		}
//		回答：wordもprint()もstaticではありませんため、アクセスできません

//		
//		3.質問２に以下ソース修正したらコンパイルエラー解消できますが、理由を教えてくださ
//		い。
//	
//		public class Kicker {
//		 	private String word = "abc";
//		 	public void print(String name) {
//		 		System.out.println(name);
//		 	}
//		 	public static void main(String...args) {
//		 		Kicker kicker = new Kicker();
//		 		kicker.print("dcnet.java.教育");
//		 		System.out.println(kicker.word);
//		 	}
//		}
//		回答：wordはprivateなので、アクセスできません
		
//		質問１︓以下コードのコンパイルエラー理由を教えてください。
//		
//		// Pet.java
//		public class Pet {
//			public String name;
//
//			public void setName(String value) {
//		 		this.name = value;
//			}
//		}
//		// Kicker.java
//		public class Kicker {
//			public static void main(String...args) {
//		 		Pet cat = new Pet();
//		 		cat.setAge(1234);
//		 	}
//		}
//		回答：setAge()が定義されていないだからです
//		
//		質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//		4. mainメソッドで上記それぞれメソッドを呼び出してください。
//		回答：Math.java
//
//		2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
//		回答：Matrix.java

	}

}
