package co.jp.chapter10;

public enum PetType {
	CAT("0"),
	DOG("1");
	
	final String num;
	private PetType(String num) {
		this.num = num;
	}
	public String getType() {
		return num;
	}

}
