package co.jp.chapter12;

public class JavaHomeWork12 {

	/*
	 package co.jp.chapter12;

public class JavaChapter12
{
	

	public static void main(String... args) {
		//質問１
		 int[] array = new int[10];
		   int index = 11;
		   
		try {
			  
			   int value = array[index];
			} catch (ArrayIndexOutOfBoundsException e) {
			   System.out.println("Index =" + index + "が配列の範囲外を指定している！");
			}

		
	//質問２
	try {
		String name="11";
		// validation check
		if(name.matches("^[0-9]+$")) {
		throw new ValidationException("名前", "半角数字を入力してください。");
		}
		} catch (ValidationException e) {
		System.err.println(e.getName() + "の入力値が不正です。" + e.getMessage());
		}


	}

}


//︓Validation Exceptionクラス
public class ValidationException extends Exception {
	private String name; // カラム名称
	private String message; // エラーメッセージ

	public ValidationException(String n, String msg) {
		this.name = n;
		this.message = msg;
	}

	public String getName() {

		return name;
	}

	public String getMessage() {

		return message;
	}

}

	 */
	//実行結果：
	/*
	 Index =11が配列の範囲外を指定している！
     名前の入力値が不正です。半角数字を入力してください。
	 */

}
