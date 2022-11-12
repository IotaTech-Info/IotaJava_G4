package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//int
		int i =100;
		int j =99;
		System.out.println(i==j);
		
		
		
	
		
		
		//文字列
		String str1="abc";
		System.out.println(str1);
		
		String str2="abc";
		System.out.println(str2);
		System.out.println(str1==str2);
		
		String str3=new String ("abc");
		String str4=new String ("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		
		//NULL
		int a =0;
		String b=null;
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
