package co.jp.chapter12;

public class JavaHomeWork12 {
	public static void main(String[] args) {
		try {
			int[] a = new int[] { 1, 2, 3 };
			System.out.println(a[6]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外");
		}
	}

	public void validate(String name) throws ValidationException {
		if (name.matches("^[0-9]+$")) {
			throw new ValidationException(name, "半角数字を入力してください。");
		}
	}

}
