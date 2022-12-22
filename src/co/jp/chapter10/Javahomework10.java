package co.jp.chapter10;

public class Javahomework10 {

	
	
	
	
	public static void main(String[] args) {
		
	
//		質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを
//		作成してください。
//		1. Petクラスを事前作成してください。
//		2. ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝
//		ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリ
//		ム注意
//		name, age, type
//		みみ, 10, 1
//		レオ, 1, 0
//		マル,2,0
		
		
//		Pet[] PetHospital = new Pet[10];
//		int i = 0;
//		String masterdata = "みみ, 10, 1\nレオ, 1, 0\nマル,2,0";
//		System.out.println(patient);
//		String[] patient = masterdata.split("\n");

//		for (String patient : question1_Guest) {
//			String[] patientInfo = patient.split(",");
//			String name = guestInfo[0].trim();
//			int age = Integer.valueOf(guestInfo[1].trim());
//			int type = Integer.valueOf(guestInfo[2].trim());
//			PetHospital[num] = new Pet(name, age, type);
//			i++;
//			}
		
//		質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」
//		の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦
//		を取得してください。
		
		
//		public static String getFileType(String path) {
//		String extension = "";
//		String[] file = path.split(".");
//		extension = file[file.length -1];
//		return extension;
		

//	public static void main(String...args) {
//	 System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
//	 System.out.println(getFileType("c://windows//a a.test")); // test
//	 System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
//	 ystem.out.println(getFileType("c://windows//aaaaa")); // Empty
//	}
		
//		質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂
//		字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
		
		
		
//		public static void main(String...args) {
//			 String value = ”abced12345あいうえお１２３４５”;
//			 // バイト数は？
//			 // 桁数は？
//			}
		
//		System.out.println("byte数は" + value.getBytes().length);
//		System.out.println("桁数は" + value.length());
		
		
		
//		質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似て
//		いるメソッドを実装してください。
		

//		public static boolean nullorEmpty(String value) {
//			if(value == null){ 
//			return true;
//		}
//			else if("".equals(moji) {
//			return false;
//		}

		
		
		
//		質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
//		1. 浮動⼩数点数
//		2. ⻑さは5桁数
//		3. 精度は⼩数点後2位
		
		
		float q5 = 5.55555F; 
		//1
		System.out.println(String.format("q5=%f", q5));
		//2
		System.out.println(String.format("%05f", q5)); 

		//3
		System.out.println(String.format("q5=%.2f", q5));
		
		
		
		
		//質問６︓整数16の16進数をSystem.out.println()してください。
		
		int q6 = 16;
		
		System.out.println(String.format("q6=%x",q6));
		
	}


}

