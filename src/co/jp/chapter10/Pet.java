package co.jp.chapter10;

public class Pet {
	
	
	public enum TYPE{
		CAT(0),
		DOG(1);

		TYPE(int i) {
			// TODO 自動生成されたコンストラクター・スタブ
		}
	}

	
	public String name;
	public int age;
	public int type;
	
	
	public Pet(String name, int age, int type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public void MasterDate(){
	
	String Pet_1 = "みみ,10,1";
	
	int flag = 0;
	String temp ="";

	for(int i = 0; i < Pet_1.length();i++) {
		char cur = Pet_1.charAt(i);
		if (cur!=','){
			temp = temp + cur;
		}else {
			if(flag == 0) {
				name = temp;
			}else if (flag ==1) {
				age = Integer.parseInt(temp);
			}else if(flag ==2) {
				type = Integer.parseInt(temp);
			}
			temp = "";
			flag++;
			}
		}
	String Pet_2 = "レオ,1,0";
	
		int flag_2 = 0;
		String temp_2 ="";

		for(int i = 0; i < Pet_2.length();i++) {
			char cur = Pet_2.charAt(i);
			if (cur!=','){
				temp_2 = temp_2 + cur;
			}else {
			if(flag_2 == 0) {
				name = temp_2;
			}else if (flag_2 ==1) {
				age = Integer.parseInt(temp_2);
			}else if(flag_2 ==2) {
				type = Integer.parseInt(temp_2);
			}
			temp_2 = "";
			flag_2++;
			}
		}
		
		String Pet_3 = "マル,2,0";
		
		int flag_3 = 0;
		String temp_3 ="";

		for(int i = 0; i < Pet_3.length();i++) {
			char cur = Pet_3.charAt(i);
			if (cur!=','){
				temp_3 = temp_3 + cur;
			}else {
			if(flag_3 == 0) {
				name = temp_3;
			}else if (flag_3 ==1) {
				age = Integer.parseInt(temp_3);
			}else if(flag_3 ==2) {
				type = Integer.parseInt(temp_3);
			}
			temp_3 = "";
			flag_3++;
			}
		}
	

	}
	
//	質問２
	public static void getFileType(String path) {
	}
	public static void main(String args) {
		String str_1 = "c://windows//aa.xlsx";
		String str_2 = "c://windows//a a.test";
		String str_3 = "c://windows//aa.bb.docx";
		String str_4 = "c://windows//aaaaa";
		
		for(int i = 0; i < str_1.length();i++) {
			char cur = str_1.charAt(i);
			if (cur == ','){
				System.out.println(String.valueOf(str_1.substring(str_1.length()-4,str_1.length())));
			}
		}
		for(int i = 0; i < str_2.length();i++) {
			char cur = str_2.charAt(i);
			if (cur == ','){
				System.out.println(String.valueOf(str_2.substring(str_2.length()-4,str_2.length())));
			}
		}
		for(int i = 0; i < str_3.length();i++) {
			char cur = str_3.charAt(i);
			if (cur == ','){
				System.out.println(String.valueOf(str_3.substring(str_3.length()-4,str_3.length())));
			}
		}
		for(int i = 0; i < str_4.length();i++) {
			char cur = str_4.charAt(i);
			if (cur == ','){
				System.out.println(String.valueOf(str_3.substring(str_3.length()-4,str_3.length())));
			}
		}
		
	}
	
//	質問３
	public static void main_1(String args) {
		String value = "abced12345あいうえお１２３４５";
		
		System.out.println(value.getBytes().length);
		System.out.println(value.length());
	}
	
//	質問４
	public static void nullOrEmptyt(String value_2) {
		System.out.println(value_2.isEmpty());
	}
//	質問５
	public static void main_2(String args) {
	String a = "123";
	System.out.println(String.format("%f", Integer.valueOf(a)));
	System.out.println(String.format("%05d", Integer.valueOf(a)));
	System.out.println(String.format("%,.2f", Integer.valueOf(a)));
	}
	
//	質問６
	public static void main_3(String args) {
		String a = "16";
	
		System.out.println(String.format("%x", Integer.valueOf(a)));
	}
}


	
	
