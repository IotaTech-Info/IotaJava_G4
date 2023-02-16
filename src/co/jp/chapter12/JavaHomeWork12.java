package co.jp.chapter12;

public class JavaHomeWork12 {


	public static void main(String[] args) {
		
		int[] a = {3,12};
		
		try {
			System.out.println(a[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		String name = "0";
		try {
			Val(name);
		}catch(ValidationException e) {
			System.out.println(e);
		}

	}
	public static void Val(String name) throws ValidationException{
		if(name.matches("^[0-9]+$")) {
			 throw new ValidationException(name, " 半角数字を入力してください。");
		}
	}

}
