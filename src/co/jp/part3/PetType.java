package co.jp.part3;

public enum PetType {
	
	Cat(1,"猫"),Dog(2,"犬"),Bird(3,"鳥"),;
	
	private int val;
	private String type;
	
	PetType(int val, String type){
		this.val = val;
		this.type = type;
	}
	
	public int getVal() {
		return val;
	}
	
	public String getType() {
		return type;
	}

}
