package co.jp.chapter12;

public class Homework12 {
	//question2
	public void validate(String name) throws ValidationException {
		if(name.matches("^[0-9]+$")) {
			throw new ValidationException("名称", "半角数字を入力してください。");
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a[] = {1,2,3,4,5};
		//quesion1
		try {
			a[5] = 6;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
			System.out.println(e);
		}

	}

}
