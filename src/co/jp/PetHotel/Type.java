package co.jp.PetHotel;

public enum Type {
	
	CAT("Cat","猫","ねこ"),
	DOG("Dog", "犬","いぬ"),
	BIRD("Bird","鳥","とり");
	
	final String etc;
	final String kanji;
	final String kana;
	

	Type(String etc, String kanji, String kana) {
		this.etc = etc;
		this.kanji = kanji;
		this.kana = kana;
	}

	public String getKana() {
		return kana;
	}

	public String getEtc() {
		return etc;
	}

	public String getKanji() {
		return kanji;
	}
	
	
	
	
}
