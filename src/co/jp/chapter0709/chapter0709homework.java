package co.jp.chapter0709;

public class chapter0709homework {
	
	//質問１︓クラス（Class）とは︖
	//クラス定義⽤のキーワードは「 class 」です。
	
	//質問２︓クラスメンバ（Class member）の何種類ありますか。
	//1. 属性・フィールド (Field)。2. 関数(Function)・メソッド(Method)・操作(Operator)
	
	//質問３︓クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。
	
	//質問４︓コンストラクタの特徴
	//1. 戻り値不要。2. 関数名＝クラス名称
	
	//質問５︓コンストラクタの作用
	//クラス属性の初期化する。
	
	//質問６︓１つクラスに複数のコンストラクタ持つ可能。
	//可能
	
	//質問７︓キーワード this の使用方法︓ this.name ︖ name ?
	/*
	 public class People {
 		private String name;
 		public void setName(String name) {
 		this.name = name;
 		}
	}
	 */
	//this.name = private String name;name = setName(String name)
	
	//質問８︓クラスを利用する為、インスタンス化する必要です。
	//インスタンスの演算⼦はnew です。
	
	//質問９︓演算子 new の直後呼び出しているメソッドは「コンストラクタ」︔
	//People obj = new People();
	
	//質問１０︓アクセス制御の３種類あります。
	//1. + public;2. # protected;3. - private
	
	//質問１１︓静的のメンバの定義するキーワード（修飾子）は static 。
	
	//質問１２︓静的のメンバアクセス時、インスタンス化不要。アクセス⽅法は「クラス名.静的のメンバ」。
	//System.out.println("1234"); // 静的のField
	//String value = String.format("%05d", 0); // 静的のメソッド
	
	//質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成します。変数catのsayHello()メソッドを呼び出してください。
	/*Answer:
	 public class Animal {
	 
		public String name;
		public int age;
		public String type;
		
		public Animal(String name, int age, String type) {
			super();
			this.name = name;
			this.age = age;
			this.type = type;
		}
		
		public void sayHello(){
			System.out.println("miao");
		}

		public String getName() {
			return name;
		}

	}
	*/
	/*
	public class chapter0709 {
	
		public static void main(String[] args) {
		
		Animal cat = new Animal("HelloKitty",2,"cat");
		cat.sayHello();
		}

	}	
	*/
	
	//質問１４︓以下１行を解釈してください。System.out.println(new Animal("cat").getName());
	//catのgetName()メソッドを呼び出し、結果をプリントする。
	
	//質問１５︓クラス継承するキーワードは「 extends 」︖
	//はい、extendsです。
	
	//質問１６︓継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位クラスは「サブクラス」と呼びます。
    //正解。
	
	//質問１７︓サブクラス＆アクセス制御（ public, protected ）。
	//正解。
	
	//質問１８︓サブクラスと親クラス同じメソッド名かつメソッドの引数は一致する場合、「オーバーライド」となります。
	//正解。
	
	//質問１９︓以下Animalクラスを継承して以下２クラスを作成してください。完成
	
	//質問２０︓以下コードをIS-A関係で説明してください。
	/*
	Animal v0 = new Animal(); // v0 は Animal 型
	Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
	Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
	Cat v3 = new Cat(""); // OK
	Dog v4 = new Dog(""); // OK
	Cat v5 = new Animal(""); // NG
	*/

}
