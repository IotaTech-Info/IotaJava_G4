package co.jp.pethotel;

public enum SEX {

	MAN("男性","１","boy"),
	WOMAN("女性","２","girl");
	
	final String kanji;
	final String code;
	final String etc;

	SEX(String kanji, String code, String etc) {
		//TODO 自動生成されたコンストラクター・スタブ
		this.kanji = kanji;
		this.code = code;
		this.etc = etc;
	}
	
} 
