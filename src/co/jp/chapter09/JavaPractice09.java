package co.jp.chapter09;

public class JavaPractice09 {

	public static void main(String[] args) {
		//question1:クラス定義⽤のキーワードは「 class 」である
		//question2:
		//1. 属性・フィールド (Field)
		//2. 関数(Function)・メソッド(Method)・操作(Operator)
		//question3:クラスメンバの関数は特殊の関数「コンストラクタ」が持っています
		//question4:1.戻り値不要 2. 関数名＝クラス名称
		//question5:コンストラクタの作⽤:クラス属性の初期化する
		//question6:１つクラスに複数のコンストラクタ持つ可能
		//question7:自身を指すポイント
		//question8:クラスを利⽤する為、インスタンス化する必要です。インスタンスの演算⼦はnew です
		//question9:演算⼦ new の直後呼び出しているメソッドは「コンストラクタ」
		//question10:アクセス制御の３種類あります 1. +public 2.#protected 3.-private
		//question11:静的のメンバの定義するキーワード（修飾⼦）は static 。
		//question12:︓静的のメンバアクセス時、インスタンス化不要。アクセス⽅法は「クラス名.静的のメンバ」
		//question13:
		Animal cat = new Animal("Tom");
		cat.sayHello();
		//question14: まず名前がcatというAnimalのインスタンスを生成して，そのインスタンスのgetNameメソッドを利用して，nameをprintする
		//question15:クラス継承する⽤キーワードは「 extends 」
		//question16:継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位クラスは「サブクラス」と呼びます
		//question17:サブクラス＆アクセス制御（ public, protected ）
		//question18:サブクラスと親クラス同じメソッド名かつメソッドの引数は⼀致する場合、Overrideとなります
		//question19:
		//Cat.java
//		public class Cat extends Animal {
//			
//			Cat(String name) {
//				super(name);
//			}
//
//			@Override
//			public void sayHello() {
//				System.out.println("ニャー");
//			}
//		}
		//Dog.java
//		public class Dog extends Animal {
//
//			public Dog(String name) {
//				super(name);
//				// TODO 自動生成されたコンストラクター・スタブ
//			}
//
//			@Override
//			public void sayHello() {
//				System.out.println("ワン");
//			}
//		}
		//question20: クラスCatとクラスDogはクラスAnimalを継承するので，CatとDogのインスタンスでもis-a Animal．そのために，new Cat()の時，CatのインスタンスがAnimalの変数になれる．
		//ただし，親クラスのインスタンスがnot is-a サブクラス.そのために，Cat v5 = new Animal("")はNG 
		
	}

}
