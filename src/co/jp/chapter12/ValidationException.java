package co.jp.chapter12;

public class ValidationException extends Exception {
	private String name;
	private String message;
	ValidationException(String name, String message){
		this.name = name;
		this.message = message;
	}

}
