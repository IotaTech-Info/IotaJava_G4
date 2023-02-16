package co.jp.part3_PetHotel;

public enum PetType {
	CAT(1,"cat"),
    DOG(2,"dog"),
	BIRD(3,"bird");
	public final int code;
	public final String type;
	PetType(int code, String type){
		this.code = code;
		this.type = type;
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
