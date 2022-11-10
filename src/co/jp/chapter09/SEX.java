package co.jp.chapter09;

public enum SEX {
	MAN("男性","1","boy"),
	WOMAN("女性","2","girl");
	
	final String kanji;
	final String code;
	final String etc;

	SEX(String kanji, String code, String etc) {
		this.kanji = kanji;
		this.code = code;
		this.etc = etc;
	}

	public String getKanji() {
		return kanji;
	}

	public String getCode() {
		return code;
	}

	public String getEtc() {
		return etc;
	}
	
}
