package co.jp.chapter12;

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
