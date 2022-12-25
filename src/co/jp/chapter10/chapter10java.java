package co.jp.chapter10;

import java.util.Arrays;

public class chapter10java {
	
	public static void main(String[] args) {
		
		//trim前後のスペースを削除
		String str_1 = " 1,2,3,4,5 ";
		System.out.println("before trim"+ str_1);	
		System.out.println("after trim"+ str_1.trim());	
		
		//replace全部のスペースを削除
		System.out.println("before trim置換え"+ str_1);	
		System.out.println("after trim置換え"+ str_1.replace(" ",""));
		
		//length文字列の文字数を返す
		System.out.println("before length　"+ str_1.length());
		
		//split
		String[] arr = str_1.trim().split(",");
		System.out.println("split"+Arrays.toString(arr));	
		
		//フォマード
		String str2 = "100000000";
		
		String str3 = "10";
		
		System.out.println(String.format("%,d",Integer.valueOf(str2)));
		//前面补上，10-字符串长度，即8位数。超出即报错
		System.out.println(String.format("%010d",Integer.valueOf(str3)));
		
		//Stringbuilder,连接超长字符但占内存空间
		String a = "V";
		String b = "I";
		String c = "P";
		
		System.out.println(a.concat(b).concat(c));
		
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		System.out.println(sb.toString());
		
		//StringBuffer
		
		StringBuffer sbf = new StringBuffer();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		System.out.println(sbf.toString());
	}

}
