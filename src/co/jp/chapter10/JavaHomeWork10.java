package co.jp.chapter10;

public class JavaHomeWork10 {

	public static void main(String[] args) {
		
		// 質問1：
		String str_Data = "みみ,10,1\n"
				+ "レオ,1,0\n"
				+ "マル,2,0";
		
		String[] arr = str_Data.split("\n");
		String pet01 = arr[0];
		String pet02 = arr[1];
		String pet03 = arr[2];
		
		String[] arr_1 = pet01.split(",");
		String[] arr_2 = pet02.split(",");
		String[] arr_3 = pet03.split(",");
		
		
		Pet pet_1 = new Pet();
		Pet pet_2 = new Pet();
		Pet pet_3 = new Pet();
		
		pet_1.name = arr_1[0];
		pet_1.age = Integer.valueOf(arr_1[1]);
		
		pet_2.name = arr_2[0];
		pet_2.age = Integer.valueOf(arr_2[1]);
		
		pet_3.name = arr_3[0];
		pet_3.age = Integer.valueOf(arr_3[1]);
		
		String type_cat = Type.CAT.getPet_num();
		String type_dog = Type.DOG.getPet_num();
		
		// 質問2：Windowsは各ファイルの拡張子を持っています。例 「新規ドキュメント.docx」
		// の拡張子は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張zi
		// を取得してください。
		
		// 方法1
		System.out.println(getFileType01("c://windows//aa.xlsx"));
		System.out.println(getFileType01("c://windows//a a.test"));
		System.out.println(getFileType01("c://windows//aa.bb.docx"));
		System.out.println(getFileType01("c://windows//aaaaa"));
		// 方法2
		System.out.println(getFileType02("c://windows//aa.xlsx"));
		System.out.println(getFileType02("c://windows//a a.test"));
		System.out.println(getFileType02("c://windows//aa.bb.docx"));
		System.out.println(getFileType02("c://windows//aaaaa"));
		
		// 質問3：Javaには、すべての文字コードはUTF-8であり。日本語（全角文字）の場合1文字 = 3バイト。以下文字列のバイト数と桁数を求めてください。
		//	public static void main(String...args){
		//		String value = " abced12345あいうえお１２３４５"
		//		//　バイト数は？
		//		//　桁数は？
		//	}
		// 回答：バイト数は41,桁数は41，文字数は21です。
		
		// 質問4：各現場は文字列に null 又は empty 判断要共通メソッドを実装しています。似ているメソッドを実装してください。
		//	public static boolean nullOrEmpty(String value){
		//		if(value.equals("")){
		//			System.out.println("The string is empty.");
		//			return true;
		//		}elseif(value == null){
		//			System.out.println(The string is null.);
		//			return false;
		//		}
		//	}
		
		// 質問5：以下仕様のフォーマティング指示コードを作成してくだい。
		// 1. 浮動小数点数
		// 2. 長さは5桁数
		// 3. 精度は小数点後2位
		float num = 1.5786f;
		System.out.println(String.format("%05.2f", num));
		
		// 質問6：整数16の16進数をSystem.out.println()してください
		// 方法1：自己定义一个转换成16进制函数
		System.out.println(InttoHex(16));
		// 方法2：利用java自己封装好的函数
		System.out.println(Integer.toHexString(16));


	}
	
	public static String getFileType01(String path) {
		
		if(path.lastIndexOf(".") != -1 && path.lastIndexOf(".") != 0) {
			return path.substring(path.lastIndexOf(".")+1);
		}else {
			return "Empty";
		}
	
	}
	
	public static String getFileType02(String path) {
		
		String[] arr_path = path.split("\\.");
		if(arr_path.length == 1) {
			return "Empty";
		}else {
			return arr_path[arr_path.length-1];		
		}
	}
	
	public static String InttoHex(int num) {
		StringBuilder sb = new StringBuilder();
		String str;
		char[] cha = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(num != 0) {
			sb = sb.append(cha[num%16]);
			num = num/16;
		}
		sb = sb.append("0x");
		str = sb.reverse().toString();
		return str;		
		}
}



class Pet{
	
	public String name;
	public int age;
		
}

enum Type{
	
	CAT("0"),
	DOG("1");
	
	final String pet_num;

	private Type(String pet_num) {
		this.pet_num = pet_num;
	}

	public String getPet_num() {
		return pet_num;
	}

}
