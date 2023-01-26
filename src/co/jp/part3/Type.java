package co.jp.part3;

public enum Type {
	
	CAT("猫","ねこ","CAT"),
	DOG("犬","いぬ","DOG"),
	BIRD("鳥","とり","BIRD");
	
	public final String kanji;
	public final String kana;
	public final String eg;
	
	Type(String kanji,String kana,String eg){
		this.kanji=kanji;
		this.kana=kana;
		this.eg=eg;
	}
	
	public String getValue_kanji() {
		return kanji;
	}
	public String getValue_kana() {
		return kana;
	}
	public String getValue_eg() {
		return eg;
	}
	
	
	
	
	
	
	

}
