package co.jp.chapter12;

import java.util.Scanner;

public class JavaHomeWork12 {
	public static void main(String[] args) {
		//質問１
		int[] a= {1,2,3,4,5};
		
		try {
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Err:配列メンバーオーバー！");
		}
		
		//質問２
		
		String name;
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		try {
			namecheck(name);
		} catch (ValidationException e) {
			e.showerrorMessage();		
		}
		
		System.out.println("終了");
	}
	public static void namecheck(String name) throws ValidationException{
		
		if(!name.matches("^[0-9]*$")) {
			 throw new ValidationException(name, "半角数字を入力してください。");
			}
	}
}
