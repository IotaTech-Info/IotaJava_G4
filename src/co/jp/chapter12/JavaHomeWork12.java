package co.jp.chapter12;

public class JavaHomeWork12 {
	public static void main(String[] args) {
	System.out.println("-----start-----");
	try {
		System.out.println(args[0]);
		
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("例外が発生しました");
		System.out.println(e);
		System.out.println("引数を一つ入力してください。");
	}
	System.out.println("実行終了。");
	}

}
//public class ValidationException extends Exception{
//	private String name;
//	private String message;
//
//}
//if(name.matches("^[0-9]+$")) {
//	throw new ValidationException ("名称","半角数字を入力してください。");
//}