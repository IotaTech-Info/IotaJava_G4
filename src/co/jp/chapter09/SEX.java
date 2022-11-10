package co.jp.chapter09;

public enum SEX {
	MAN("男性", "1", "boy"), WOMAN("女性", "1", "girl");

	final String kanji;
	final String code;
	final String etc;

	SEX(String kanji, String code, String etc) {
		this.kanji = kanji;
		this.code = code;
		this.etc = etc;
	}

}
