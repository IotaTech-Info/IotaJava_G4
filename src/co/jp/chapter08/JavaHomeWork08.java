package co.jp.chapter08;

public class JavaHomeWork08 {
	// 質問︓以下コードのコンパイルエラー理由を教えてください。
	// 親クラスfinalに指定しているので、継承できない。

	// 質問１
	// true ==はアドレスの比較のため、ｘとｙの値aはメモリのString poolにしているので、アドレスが同じ。
	// true equalsは文字の内容を比較するもので、xとｙの内容が同じ
	// 実行エラー、ぬるぽがメソッドを呼び出せない。

	// 質問２
	// false ｘとｙがそれぞれnewで実例化しているため、アドレスが違う。
	// true 初期化の時に同じ値を入れた。

	//質問３
	/**
	 *overload メソッド作成 
	 *public static void print(Parent v) {
	 *	v.hello();
	 *}
	 */
}
