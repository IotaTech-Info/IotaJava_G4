package co.jp.part2;

public enum Type {
	CAT("cat"), DOG("dog"), BIRD("bird");
	final String type;

	private Type(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
}