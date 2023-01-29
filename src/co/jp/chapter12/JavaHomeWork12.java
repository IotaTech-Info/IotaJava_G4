package co.jp.chapter12;

public class JavaHomeWork12 {
	public void validate(String name) throws ValidationException {
		
		if(name.matches("^[0-9]+$")) {
			throw new ValidationException("名称", "半角数字を入力してください。");
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣ します。
		 * 該当例外を処理するサンプルコードを書いてください。
		 *  質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際 商⽤アプリで利⽤しています。
		 *   STEP1 : ValidationException クラスを定義する 
		 *   public class ValidationException extends Exception {
 				private String name; // カラム名称
 				private String message; // エラーメッセージ
			}
		 *   STEP2 : チェック処理（サンプル）
		 *  if(name.matches("^[0-9]+$")) {
 			throw new ValidationException("名称", "半角数字を入力してください。"); 
 			}
		 *  */
		String[][] s = new String[2][2];
		//quesion1
		try {
			s[5] [6]= new String("Good");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
			System.out.println("数组下标越界！");
		}

	}

}
