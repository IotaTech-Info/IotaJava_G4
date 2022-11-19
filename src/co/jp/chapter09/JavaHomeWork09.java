package co.jp.chapter09;

public class JavaHomeWork09 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//chapter09
		//問題1: 15-17  省去接口名直接重写里面的方法
//		btn.addActionListener((ActionEvent e) -> {
//			System.out.println("ボタンクリックしました。");
//		});
		//問題2: 第四行new Thread()
//		09 OOP - 練習問題
//		問題13: クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成しま す。変数catのsayHello()メソッドを呼び出してください。
//		      1. 属性:年齢
//		      2. 属性:名前
//		      3. 属性:分類
//		      4. コンストラクタ:名前を渡して、初期化する 5. 操作:sayHello():void
//		      6. 操作:getName(): String 自分の名称を返す
		Cat cat = new Cat("miao");
		System.out.println("cat name is:" + cat.getName());
		cat.sayHello();
		//問題14: 以下1行を解釈してください。
//		System.out.println(new Animal("cat").getName());  初始化一个名叫cat的实例，调用getName得到name属性并打印。
		//問題15: クラス継承する用キーワードは「 extends 」?  はい！
		//問題19:以下Animalクラスを継承して以下2クラスを作成してください。
//		        1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“); 2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
//		        ※親クラスに明示的なコンストラクタが存在しない場合、サブクラスは必ず親クラスのコ ンストラクタをオーバーライドします。
//		cat同13
		Dog dog = new Dog("bobi");
		dog.sayHello();
		//問題20:以下コードをIS-A関係で説明してください。
//		Animal v0 = new Animal(); // v0 は Animal 型          animal is animal
//		Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型      cat is animal
//		Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型      dog is animal
//
//		Cat v3 = new Cat(""); // OK       cat is cat
//		Dog v4 = new Dog(""); // OK       dog is dog
//
//		Cat v5 = new Animal(""); // NG    Animal is the super class

	}
}