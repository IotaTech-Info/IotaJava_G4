package co.jp.chapter10;

import java.util.Arrays;

public class JavaChapter10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str_int = "10";
		
		//String to other class; Integer.valueOf(str_int) > 9  , Float.valueOf() , Boolean.valueOf() 
		if(Integer.valueOf(str_int) > 9) {
			System.out.println("str_int > 9");
		}else {
			System.out.println("str_int < 9");
		}
		//String to char array
		String str_char_arr = "abfds";
		System.out.println(Arrays.toString(str_char_arr.toCharArray()));
		
		//charAt :  index = 3
		System.out.println("文字列" + str_char_arr + "charAt :  index = 3: " + str_char_arr.charAt(3));
		//"v".equals(String.valueOf(user1.charAt(0)))
		String user_no_1 = "VIP_USER_0001";
		
		if("V".equals(String.valueOf(user_no_1.charAt(0)))) {
			System.out.println("charAt VIP user");
		}else {
			System.out.println("charAt general user");
		}
		//sbuString（start，end）截取end之前的文字包括符号  end不包含在index里，要加一位。
		if("VIP_USER".equals(user_no_1.substring(0, 8))) {
			System.out.println("substring VIP user");
		}else {
			System.out.println("substring general user");
		}
		//后四位，从后向前：user_no_1.length()-4
		if("0001".equals(user_no_1.substring(user_no_1.length()-4))) {
			System.out.println("substring VIP user");
		}else {
			System.out.println("substring general user");
		}
		//trim：去前后半角空格； replace：替换，
		//split 前面的空格或，被认为需要分割；最后的默认不需要
		String str_1 = " 1 2 3 4 5 6   ";
		String[] arr = str_1.trim().split(" "); //用trim先去除前面的空格或逗号，再进行分割
		System.out.println(Arrays.toString(arr));
		
		//Format
		String str_format = "10000000"; //int str_format = 10000000;
		System.out.println(String.format("%,d", Integer.valueOf(str_format)));
		String str_format1 = "12345";
		System.out.println(String.format("%010d", Integer.valueOf(str_format1)));
		int one = 123456;
		float two = 123456.99999F;
		System.out.println(String.format("one=%,d two=%,.2f", one, two));
		//StringBuilder 占内存大 连接大字符串
		String a = "V";
		String b = "I";
		String c = "P";
		System.out.println(a.concat(b).concat(c));
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		System.out.println(sb.toString());
		//StringBuffer 占内存小
		StringBuffer sbf = new StringBuffer();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		System.out.println(sbf.toString());

	}
}
