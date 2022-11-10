package co.jp.chapter07;

import java.util.Scanner;

public class JavaHomeWork07 {
	
	//以下コードのコンパイルエラー理由を教えてください
//	public class Pet {
//		public String name;
//		public void setName (String value) {
//		this.name = value;
//		}
//	}		
//	public class Kicker{
//		public static void main (String...args) {
//		Pet cat = new Pet ();
//		cat.setAge (1234);	
//		}
//	}
	//Pet Class does not have a method called "setAge"
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問2:Mathクラスを作成してください。以下メソッドを定義します		
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		System.out.println(Math.max(array));
		System.out.println(Math.min(array));
		System.out.println(Math.mean(array));

	}
	
	
}
