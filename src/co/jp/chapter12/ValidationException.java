package co.jp.chapter12;

public class ValidationException extends Exception{


		
			private String name; // カラム名称
			private String message; // エラーメッセージ
			
			public ValidationException(String name, String message) {
				this.name = name;
				this.message = message;
			}
			


	}