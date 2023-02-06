package co.jp.part3;

public class Client {
	String name;

	String telephone;
	
	int code;

	int[] petsCode = new int[3];//最大三只
	
	public Client(String name, String telephone, int code) {
		  this.name = name;
		  this.telephone = telephone;
		  this.code = code;
		  this.petsCode = new int[] {0, 0, 0};
		}

	public Client() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	

}
