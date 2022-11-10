package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１︓
		// true ==はアドレスの比較、ｘとｙの値aのアドレスは同じ
		// true equalsは文字の内容を比較するｘとｙ両方文字の内容は同じ
		// 実行エラー nullはメソッドを呼ばない

		// 質問２︓
		// false ==はアドレスの比較、ｘとｙは別のアドレスで保存しているので、アドレスが違います
		// true equalsは文字の内容を比較する初期化の時ｘとｙ両方文字の内容は同じ

		// 質問３︓
		// Parent.java
//		public class Parent {
//		 public void hello() {
//		 System.out.println("parent method");
//		 }
//		}
//		// Child.java
//		public class Child extends Parent {
//		 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
//		 public void hello() {
//		 System.out.println("child method");
//		 }
//		}
//		// Kicker.java
//		public class Kicker {
//		 public static void print(Child v) {　　　　👈＝＝＝＝＝＝＝＝＝ここは public static void print(Parent v) に変更する
//		 v.hello();
//		 }
//		 public static void main(String...args) {
//		 print(new Parent());
//
//		 print(new Child());
//		 }
//		}

	}
}
