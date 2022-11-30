package co.jp.chapter09;

public class JavaHomework_07_09 {

	public static void main(String[] args) {
//
//	質問︓
//	
//	質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成しま
//	す。変数catのsayHello()メソッドを呼び出してください。
//	1. 属性︓年齢
//	2. 属性︓名前
//	3. 属性︓分類
//	4. コンストラクタ︓名前を渡して、初期化する
//	5. 操作︓sayHello()︓void
//	6. 操作︓getName(): String ⾃分の名称を返す
//	回答：Animal.java
		Animal cat =new Animal("cat");
		cat.sayHello();
		
		
//	質問１４︓以下１⾏を解釈してください。
//	System.out.println(new Animal("cat").getName());
//　回答：クラス「Animal」からString"cat"を渡し、新しくインスタンスを作成して、getName()メソッドを呼び出した
	

//	質問１９︓以下Animalクラスを継承して以下２クラスを作成してください。
//	1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
//	2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
//	※親クラスに明⽰的なコンストラクタが存在しない場合、サブクラスは必ず親クラスのコ
//	ンストラクタをオーバーライドします。
//	回答：Cat.java,Dog.java

//	質問２０︓以下コードをIS-A関係で説明してください。
//
	Animal v0 = new Animal(); // v0 は Animal 型
	Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
	Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
	Cat v3 = new Cat(""); // OK
	Dog v4 = new Dog(""); // OK
//	Cat v5 = new Animal(""); // NG

	}
}
