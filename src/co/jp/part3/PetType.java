package co.jp.part3;

public enum PetType {
	Cat(1,"cat","猫"),
	Dog(2,"dog","犬"),
	Bird(3,"bird","鳥");

	public final int code;
	public final String type;
	public final String description;
	
	PetType(int code, String type, String description) {
		this.code=code;
		this.type=type;
		this.description=description;
	}
	
	public static PetType getEumn(int code) {
		for(PetType pt:PetType.values() ) {
			if(code==pt.code) {
				return pt;
			}
		}
		
		return null;
	}
	
	public static PetType getEumn(String type) {
		for(PetType pt:PetType.values() ) {
			if(type.equals(pt.type)) {
				return pt;
			}
		}
		
		return null;
	}
}
