package co.jp.finalAnnouncement;

public enum FOOD {
	
	BIRD_FOOD(" is eating bugs"),
	DOD_FOOD(" is eating bones"),
	CAT_FOOD(" is eating fish");
	
	final String FoodType;

	private FOOD(String foodtype) {
		this.FoodType = foodtype;
	}

	public String getFoodType() {
		return FoodType;
	}

	
	

}
