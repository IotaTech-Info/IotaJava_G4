package co.jp.chapter12;

public class ValidationException extends Exception {

	private static String name; // カラム名称
	private static String message; // エラーメッセージ

	public ValidationException(String name, String message) {

		this.name = name;
		this.message = message;

	}

	public void showerrorMessage() {
		System.out.println(name+message);
	}
}
