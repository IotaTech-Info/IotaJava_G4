package co.jp.part3;

public class SystemInCheck extends Exception {
	public String message;

	public SystemInCheck(String msg) {
		this.message = msg;
	}

	public static void SystemIn(int CK, Hotel[] hotel) throws SystemInCheck {
		if (CK > hotel.length) {
			throw new SystemInCheck("入力ミスのせいで、メニューに戻る");
		}
	}
}
