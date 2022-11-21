package co.jp.chapter08;

public class JavaHomeWork08 {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		/*
		 * 質問1:以下コードの出力するを回答してください。
*/
	String x="a";
	String y="a";
	System.out.println(x == y); // true ですけど　falseが正しい出力と思っている(x と y のアドレスが違う)
	System.out.println(x.equals(y)); // true
	String empty="";
	String nullString = null;
	System.out.println(nullString.equals(empty));//Errorが出す
	
	/*質問2:以下コードの出力を回答してください。
	 21行の出力:false (x と y のアドレスが違う)
	 22行の出力:true (equalsのメソッドをOverrideしたので)
	*/
	

	}

}
