package co.jp.chapter10;


public enum PetType {
	Cat(0,"猫"),
	Dog(1,"犬");
	
	private int id;
	private String name;
	PetType(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public static int getEumn(String type) {
		for(PetType pt:PetType.values() ) {
			if(type.equals(pt.name)) {
				return pt.id;
			}
		}
		return -1;
	}
}
