package co.jp.chapter10;

import java.util.Arrays;

public class Javachapter10 {
	public static void main(String[] args) {
		
		String user_no_1 = "VIP_USER_0001";
		
		
//		charAt是将数组数字化
		System.out.println(String.valueOf(user_no_1.charAt(user_no_1.length()-4))
				+String.valueOf(user_no_1.charAt(user_no_1.length()-3))
				+String.valueOf(user_no_1.charAt(user_no_1.length()-2))
				+String.valueOf(user_no_1.charAt(user_no_1.length()-1)));
//		substring可以直接截取数组
		System.out.println(String.valueOf(user_no_1.substring(user_no_1.length()-4,user_no_1.length())));
		
		
		
//		空文字列 ブランク　
//		String empty ="";
		
//		半角スペース
//		String space = " ";
////		
////		全角スペース
//		String space_1 = "　";
////		NULL
//		String str_n = null;

		
		
		
//		trim 去除前后的半角空格
		String str = "1 2 3 4 5 6";
		
		System.out.println("before trim :" + str);
		System.out.println("before trim :" + str.trim());
		
//		replace置换，用新的字符串替换旧的字符串
		System.out.println("before replace half space :" + str);
		System.out.println("before replace half space :" + str.replace(" ", ""));
		
		
//		length返回的是文字数，不是桁数、桁数使用getBytes().length
		System.out.println("the length of half space :" + str.getBytes().length);
		
		
//		split截取，切割
		
		String str_1 ="1 2 3 4 5 6";
	
		String[] arr = str_1.split(","); //以半角空格切割字符串
		System.out.println(Arrays.toString(arr));
		
		
//		フォーマット
		String str_2 = "100000";
		System.out.println(String.format("%,d",Integer.valueOf(str_2)));//表示钱数
		
		String str_3 ="123";
		System.out.println(String.format("%05d", Integer.valueOf(str_3)));//往前补零
		
		
//		StringBuilder &StringBuffer用以连接较多的字符串。builder相较于Buffer更占内存。
		
		String a = "V";
		String b = "I";
		String c = "P";
		
		System.out.println(a.concat(b).concat(c));
		
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		System.out.println(sb.toString());

		
	}
}
