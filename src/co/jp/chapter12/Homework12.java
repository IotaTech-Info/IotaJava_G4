package co.jp.chapter12;

public class Homework12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		    System.out.println(50/0);
		} catch(ArithmeticException e) {
		    System.out.println("Error happend");
		    e.printStackTrace();
		}

	}

}
