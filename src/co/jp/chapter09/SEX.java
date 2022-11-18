package co.jp.chapter09;

public enum SEX {
	//类名直接调用，大写，斜体，静态
	MAN("男","1","b"),
	WOMAN("女","2","g"),;

	final String kanji;
	final String code;
	final String name;

	SEX(String kanji, String code, String etc) {  //当前类的构造方法 静态没有返回值
		// TODO 自動生成されたコンストラクター・スタブ
		this.kanji = kanji;
	    this.code = code;
	    this.name = etc;
	}

	public String getCode() {
		return code;
	}

	public String getEtc() {
		return name;
	}

	public String getKanji() {
		return kanji;
	}

	

}
