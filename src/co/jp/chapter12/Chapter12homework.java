package co.jp.chapter12;

public class Chapter12homework {


//	STEP2 : チェック処理（サンプル）
		public void validate(String name) throws ValidationException{
			if(name.matches("^[0-9]+$")) {
			throw new ValidationException("名称", "半角数字を入力してください。");
		}
		}
		
		
		public static void main(String[] args) {				
		
		
//		質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣
//		します。該当例外を処理するサンプルコードを書いてください。
		
			try {
				int[] a = new int[] {1,2,3,4,5};
				System.out.println(a[6]);
			}
						
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("配列の範囲外エラー");
			}
		


//		質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際
//		商⽤アプリで利⽤しています。
	
			//ValidationException.java
					


		
			}
}

