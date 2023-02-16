package co.jp.chapter10;

public class JavaHomeWork10 {


	public static void main(String[] args) {
		
// 質問1:以下3行文字列を「改行コード」と「,」を分割して2つペットオブジェクトを作成してください。
		Pet pet_1 = new Pet();
		Pet pet_2 = new Pet();
		Pet pet_3 = new Pet();
		
		String input = "みみ,10,1\n" + "レオ,1,0\n" + "マル,2,0\n";
		String[] input_pet = input.split("\n");
		
		String[] input_1 = input_pet[0].trim().split(",");
		String[] input_2 = input_pet[1].trim().split(",");
		String[] input_3 = input_pet[2].trim().split(",");
		
		pet_1.name = input_1[0];
		pet_1.age = Integer.valueOf(input_1[1]);
		
		pet_2.name = input_2[0];
		pet_2.age = Integer.valueOf(input_2[1]);
		
		pet_3.name = input_3[0];
		pet_3.age = Integer.valueOf(input_3[1]);
		String type_cat = PetType.CAT.getType();
		String type_dog = PetType.DOG.getType();
//質問2:Windowsは各ファイルの拡張子を持っています。
//	例 「新規ドキュメント.docx」の拡張子は「docx」である。メソッドを作成して、ファイルパス(String型)から拡張子を取得してください。
		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa")); // Empty
//質問3:Javaには、すべての文字コードはUTF-8であり。
//	日本語(全角文字)の場合1文字 = 3バイト。以下文字列のバイト数と桁数を求めてください。
		String value = "abced12345あいうえお１２３４５";
		System.out.println("バイト数 = " + value.getBytes().length);
		System.out.println("桁数 = " + value.length());
//質問4:各現場は文字列に null 又は empty 判断要共通メソッドを実装しています。似て いるメソッドを実装してください
		String str_4 = "";
		nullOrEmpty(str_4);
//質問5:以下仕様のフォーマティング指示コードを作成してくだい。	
//	1. 浮動小数点数    2. 長さは5桁数     3. 精度は小数点後2位
		float a = 123.345567f;
		System.out.println(String.format("%05.2f", a));
//質問6:整数16の16進数をSystem.out.println()してください。
		System.out.println(Integer.toHexString(16));

	}
	
	//質問2
	public static String getFileType(String path) {
		 if(path.lastIndexOf(".") != -1) {
			 return path.substring(path.lastIndexOf(".") + 1);
		 }else
			 return "empty";
	 }
	//質問4
	public static boolean nullOrEmpty(String value) {
		if(value.equals("")) {
			System.out.println("empty");
		}else if(value == null) {
			System.out.println("null");
		}
		return true;
	}

}
