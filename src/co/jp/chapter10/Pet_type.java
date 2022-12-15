package co.jp.chapter10;

public enum Pet_type {
	CAT("0","猫"),
	DOG("1","犬");
	
	final String code;
	final String type;
	

	Pet_type(String code, String type) {
		this.code = code;
		this.type = type;
		// TODO 自動生成されたコンストラクター・スタブ
	}


	public static Pet_type getEnum(String code) {
		for (Pet_type type : Pet_type.values()) {
			if (type.code.equals(code)) {
				return type;
			}
		}
		return null;
	}
	
	

}
