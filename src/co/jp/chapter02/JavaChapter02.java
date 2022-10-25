package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));//"不用==比较，而是用equals
	
		//NULL
		
		int a = 0;
		String b = null;
		
		System.out.println("\"");
		
		
		
		
		
		
		
		int age = 6;
		
		switch(age) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("幼児：無料");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("小学生：100円");
		}
		
	}

}
