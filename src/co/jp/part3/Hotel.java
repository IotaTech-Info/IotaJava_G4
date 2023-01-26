//11月18日　gitへアップ用更新
package co.jp.part3;

public class Hotel extends Pet {
	String data;
	String status;

	public Hotel(String name, int age, String type, String status, String data) {
		super(name, age, type);
		this.status = status;
		this.data = data;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String toString() {
		return name + "\t" + age;
	}
}
