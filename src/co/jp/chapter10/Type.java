package co.jp.chapter10;

public enum Type {
	
	Dog("1"),
	Cat("0");
	
	final String Type;

	private Type(String type) {
		this.Type = type;
		
	}

	public String getType() {
		return Type;
	}
	
	

}
