package co.jp.PetHotel;

public enum MOOD {
	
	STARVING(" feels starving"),
	BORING(" feels boring"),
	FUN(" was playing in the garden"),
	SATISFIED(" feels satisfied,you are a nice owner!");
	
	final String mood;
	
	private MOOD(String mood) {
		this.mood = mood;
	}

	public String getMood() {
		return mood;
	}

	
	
	

}
