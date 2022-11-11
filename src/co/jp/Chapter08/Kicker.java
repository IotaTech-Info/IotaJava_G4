package co.jp.Chapter08;

public class Kicker {
	 public static void print(Parent v) {
		 v.hello();
	 }
	 public static void main(String...args) {
		 print(new Parent());
		 print(new Child());
	 }
	}

