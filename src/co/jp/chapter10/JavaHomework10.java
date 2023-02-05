package co.jp.chapter10;

public class JavaHomework10 {

//	質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。
//1. Petクラスを事前作成してください。
//2. ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝
//ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリム注意
//name, age, type
//みみ, 10, 1
//レオ, 1, 0
//マル,2,0
	public static Pet create_new_pet_Q1(String input) {
		Type pet_type[]=Type.values();
		String[] list_input=input.split(",");
		Pet pet=new Pet(
						list_input[0].trim(),
						Integer.parseInt(list_input[1].trim()),
						pet_type[Integer.parseInt(list_input[2].trim())]
						);
		return pet;
	}
	
	public static void main_Q1(String...args) {
		String input1="みみ, 10, 1";
		String input2="レオ, 1, 0";
		String input3="マル,2,0";
		Pet pet1=create_new_pet_Q1(input1);
		Pet pet2=create_new_pet_Q1(input2);
		Pet pet3=create_new_pet_Q1(input3);
//		System.out.println(pet1.type);
	}
	
//質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。

	public static String getFileType(String path) {
		String[] vs = path.split("\\.");
		String filetype="None";
		if (vs.length!=1) {
			filetype=vs[vs.length-1];
		}
		
		return filetype;
	}

	public static void main_Q2(String...args) {
		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa")); // Empty
	}


//質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。

	public static void main_Q3(String...args) {
		String value = "abced12345あいうえお１２３４５";
		// バイト数は？
		System.out.println(value.getBytes().length);

		// 桁数は？
		System.out.println(value.length());
	}
//
//質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似ているメソッドを実装してください。
//
	public static boolean nullOrEmpty(String value) {
		// value は null or Empty 判断してください。
		return value.isEmpty();
	}
//
//質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
//1. 浮動⼩数点数	%f
//2. ⻑さは5桁数		%5d
//3. 精度は⼩数点後2位	%.2f
//
//
//質問６︓整数16の16進数をSystem.out.println()してください。
	public static void main_Q6(String...args) {
		System.out.println(String.format("%x", 16));
	}
	public static void main(String[] args) {
		main_Q1();
		main_Q2();
		main_Q3();
		main_Q6();
		
	}
}
