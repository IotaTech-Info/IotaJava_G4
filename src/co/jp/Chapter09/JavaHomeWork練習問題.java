package co.jp.Chapter09;

public class JavaHomeWork練習問題 {
	public static void main(String[] args) {
//		質問１︓クラス（Class）とは︖クラス定義⽤のキーワードは「 class 」である。
//		質問２︓クラスメンバ（Class member）の何種類ありますか。
//		1. 属性・フィールド (Field)
//		2. 関数(Function)・メソッド(Method)・操作(Operator)
//		質問３︓クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。
//		質問４︓コンストラクタの特徴
//		1. 戻り値不要
//		2. 関数名＝クラス名称
//		質問５︓コンストラクタの作⽤︓クラス属性の初期化する。
//		質問６︓１つクラスに複数のコンストラクタ持つ可能。
//		質問７︓キーワード this の使⽤⽅法︓ this.name ︖ name ?
//		public class People {
//			 private String name;
//			 public void setName(String name) {
//			 this.name = name;
//			 }
//		}
//		質問８︓クラスを利⽤する為、インスタンス化する必要です。インスタンスの演算⼦は
//		new です。
//		質問９︓演算⼦ new の直後呼び出しているメソッドは「コンストラクタ」︔
//		People obj = new People();
//		質問１０︓アクセス制御の３種類あります。
//		1. + public
//		2. # protected
//		3. - private
//		質問１１︓静的のメンバの定義するキーワード（修飾⼦）は static 。
//		質問１２︓静的のメンバアクセス時、インスタンス化不要。アクセス⽅法は「クラス名.
//		静的のメンバ」。
//		System.out.println("1234"); // 静的のField
//		String value = String.format("%05d", 0); // 静的のメソッド
//		質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成しま
//		す。変数catのsayHello()メソッドを呼び出してください。
//		1. 属性︓年齢
//		2. 属性︓名前
//		3. 属性︓分類
//		4. コンストラクタ︓名前を渡して、初期化する
//		5. 操作︓sayHello()︓void
//		6. 操作︓getName(): String ⾃分の名称を返す
		
		Animal cat = new Animal("cat");
		
//		質問１４︓以下１⾏を解釈してください。
		System.out.println(new Animal("cat").getName());
		// 在这行代码中，新建了一个Animal的实例，向Animal类的构造函数传入"cat"的初始值
		// 之后调用了该类的公开方法getName，getName的返回值为String类型，将返回值输出
		
//		質問１５︓クラス継承する⽤キーワードは「 extends 」︖
//		質問１６︓継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位
//		クラスは「サブクラス」と呼びます。
//		質問１７︓サブクラス＆アクセス制御（ public, protected ）。
//		質問１８︓サブクラスと親クラス同じメソッド名かつメソッドの引数は⼀致する場合、
//		「オーバーライド」となります。
		
//		質問１９︓以下Animalクラスを継承して以下２クラスを作成してください。
//		1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
//		2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
		new Cat("cat").sayHello();
		new Dog("dog").sayHello();
		
//		質問２０︓以下コードをIS-A関係で説明してください。
//		Animal v0 = new Animal(); // v0 是 Animal 型
//		Animal v1 = new Cat("a cat"); // v1 是放入Cat的实例的Animal型，当作Animal型使用
//		Animal v2 = new Dog("a dog"); // v2 是放入Dog的实例的Animal型，当作Animal型使用
//		Cat v3 = new Cat(""); // v3 是Cat型
//		Dog v4 = new Dog(""); // v4 是Dog型
//		Cat v5 = new Animal(""); // Cat是Animal的子类，而子类的变量里不能放入父类的实例，因此NG
	}
}
