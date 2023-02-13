package co.jp.chapter12;

public class JavaHomeWork12 {

	public static void main(String[] args) {
		int[] a = {1};
		
		
		try {
			System.out.println(a[3]);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		String name = "2";
		try {
			inputcheck(name);
		} catch (ValidationException e) {
			// TODO: handle exception
//			Logger.getLogger(JavaChapter12.class.getName()).log(Level.SEVERE, null, e);
		}
		
		
	}
	public static void inputcheck(String name) throws ValidationException{
		if(name.matches("^[0-9]+$")) {
			throw new ValidationException("名称", "半角数字を入力してください。");
			}
	}


}
