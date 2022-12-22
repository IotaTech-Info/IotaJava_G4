package co.jp.chapter10;

public class JavaHomeWork10 {
	public static void main(String[] args) {

		// 問題１
//		質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを 作成してください。 
//		1. Petクラスを事前作成してください。
//		 2. ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝ 
//
//		ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリ ム注意
//
//		1 name, age, type 
//		2 みみ, 10, 1 
//		3 レオ, 1, 0 
//		4 マル,2,0
		Pet pet01 = new Pet();
		Pet pet02 = new Pet();
		Pet pet03 = new Pet();

		String data = "みみ, 10, 1\n" + "レオ, 1, 0\n" + "マル,2,0";
		String[] pet_data = data.split("\n");

		String data01 = pet_data[0];
		String data02 = pet_data[1];
		String data03 = pet_data[2];

		String[] pet01_data = data01.split(",");
		String[] pet02_data = data02.split(",");
		String[] pet03_data = data03.split(",");

		pet01.name = pet01_data[0];
		// 利用trim（）方法去除数据中的空白符，否则无法将数据传入pet01.age
		pet01.age = Integer.valueOf(pet01_data[1].trim());

		pet02.name = pet02_data[0];
		pet02.age = Integer.valueOf(pet02_data[1].trim());

		pet03.name = pet03_data[0];
		pet03.age = Integer.valueOf(pet03_data[1].trim());

		String type_cat = Type.CAT.getType_number();
		String type_dog = Type.DOG.getType_number();

//		// 問題２
//		質問２︓Windowsは各ファイルの拡張⼦を持っています。
//		例 「新規ドキュメント.docx」 の拡張⼦は「docx」である。
//		メソッドを作成して、ファイルパス（String型）から拡張⼦ を取得してください。

		System.out.println(getFileType("c://windows//aa.xlsx"));
		System.out.println(getFileType("c://windows//a a.test"));
		System.out.println(getFileType("c://windows//aa.bb.docx"));
		System.out.println(getFileType("c://windows//aaaaa"));

//		//問題３
//		質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂ 字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
//
//				public static void main(String...args) {
//				 String value = ”abced12345あいうえお１２３４５”; 
//				// バイト数は？ 
//				// 桁数は？ 
//	}
		String value = "abced12345あいうえお１２３４５";

		System.out.println("バイト数は:" + value.getBytes().length);

		System.out.println("桁数は:" + value.length());
		
		
		//問題４
		String a ="";
		nullOrEmpty(a);

		
//		質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
//		 1. 浮動⼩数点数 
//		2. ⻑さは5桁数 
//		3. 精度は⼩数点後2位
		 float b =123.141598f;
		 System.out.println(String.format("%5.2f",b));
		 
		 
//		 質問６︓整数16の16進数をSystem.out.println()してください。
		int c = 16;
		String num = Integer.toHexString(c);
		System.out.println(num);
		
		
		


	}

	// 問題２
	public static String getFileType(String path) {
		int num = 0;
		// 检查里面有几个实心点
		char[] arr = path.toCharArray();
		for (char a : arr) {
			if (a == '.') {
				num++;
			}
		}

		System.out.println(path);

		System.out.println(".の数は:" + num);

		String[] data = path.split("\\.");

		String FileType = data[num];
		if (num == 0) {
			return "Empty";
		}

		return FileType;

	}
	
//	問題４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。
//	似て いるメソッドを実装してください。
	
	public static boolean nullOrEmpty(String value) { 
	// value は null or Empty 判断してください。
		if(value.length() == 0) {
		System.out.println("文字列はempty");
	 }
		if(value == null) {
		System.out.println("文字列はnuull");
		}
		return true;
		
	}
	

	 
	 
	
	
	



}
