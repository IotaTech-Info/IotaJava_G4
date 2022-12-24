package co.jp.chapter10;
import java.util.Arrays;

public class JavaHomeWork10 {
	
	//質問2
	public static String getFileType(String path) {
		int idx = path.lastIndexOf(".");
		String extName = "";
		if(idx > 0) {
			extName = path.substring(idx + 1);
		}else{
			extName = "Empty";
		}
		
		return extName;
	}
	
	//質問4
	public static boolean nullOrEmpty(String value) {
		if(value == null) {
			return true;	
		}else if(value.isEmpty()) {
			return false;
		}
			return false;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//質問1
		String data = "みみ,10,1\nレオ,1,0\nマル,2,0";
		String[] split = data.split(",");
		
		System.out.println(Arrays.toString(split));
		
		//質問2
		System.out.println(getFileType("c://windows//aa.xlsx"));
		System.out.println(getFileType("c://windows//a a.test"));
		System.out.println(getFileType("c://windows//aa.bb.docx"));
		System.out.println(getFileType("c://windows//aaaaa"));

		//質問3
		String value = " abced12345あいうえお１２３４５";
		try {
			System.out.println(value.getBytes("UTF-8").length);
			System.out.println(value.length());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		//質問4
		String val_1 = "";
		String val_2 = null;
		System.out.println(nullOrEmpty(val_1));
		System.out.println(nullOrEmpty(val_2));
		
		//質問5
		System.out.println(String.format("x=%05.2f", 1.2265));
		
		//質問6
		System.out.println(String.format("x=%x", 16));
	}
	
}


