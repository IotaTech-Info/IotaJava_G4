package co.jp.chapter10;

import java.util.Arrays;

public class chapter10homework {
	
	public static void main(String[] args) {
		//Q1
		Pet pet_1 = new Pet("みみ",10);
		Type type_1 = Type.Dog;
		String petData1 = pet_1.name + "," + pet_1.age + "," + type_1.Type;
		String[] arr1 = petData1.split(",");
		
		Pet pet_2 = new Pet("レオ",1);
		Type type_2 = Type.Cat;
		String petData2 = pet_2.name + "," + pet_2.age + "," + type_2.Type;
		String[] arr2 = petData2.split(",");
		
		Pet pet_3 = new Pet("マル",2);
		Type type_3 = Type.Cat;
		String petData3 = pet_3.name + "," + pet_3.age + "," + type_3.Type;
		String[] arr3 = petData3.split(",");
		
		System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2) + "\n" + Arrays.toString(arr3));
		
		
		//Q2
		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa")); // Empty
		
		//Q3
		String value = "abced12345あいうえお１２３４５";
		
		System.out.println("バイト数：" + value.getBytes().length);
		System.out.println("桁数："+ value.length());
		
		//Q4
		String str4 = "";
		nullOrEmpty(str4);
		
		//Q5 1. 浮動⼩数点数　2. 長さは5桁数　3. 精度は小数点後2位
		String str5 = "100";
		System.out.println(String.format("%5.2f",Float.valueOf(str5)));
		
		//06整数16の16進数をSystem.out.println()してください。
		int num6 = 16;
		System.out.println("16の16進数：" + Integer.toHexString(num6));
	}
		//Q4
	public static boolean nullOrEmpty(String value) {
			 // value は null or Empty 判断してください。
		if(value.length() == 0) {
			System.out.println("文字列はEmpty");
		}else if (value == null) {
			System.out.println("文字列はnully");
		}
		return true;
	}
	
	public static String getFileType(String path) {
		String type = "";
		
		for(int i = path.length() - 1;i > 0;i--) {
			if(path.charAt(i) == '.') {
				type = path.substring(i+1);
				return type;
			}
		}
		return type;
	}


}
