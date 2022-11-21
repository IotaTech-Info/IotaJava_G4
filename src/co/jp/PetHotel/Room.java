package co.jp.PetHotel;

public class Room {
	
	private String Id;
	
	private String Type;
	
	private boolean IsUse;

	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	

	public boolean isIsUse() {
		return IsUse;
	}

	public void setIsUse(boolean isUse) {
		IsUse = isUse;
	}

	

	public Room(String id, String type, boolean isUse) {
		super();
		this.Id = id;
		this.Type = type;
		this.IsUse = isUse;
	}

	public Room() {
		
		
	}


	@Override
	public String toString() {
		return "[" + Id + "," + Type + "," + (IsUse?"満室":"空室") + "]";
	}

	
	

	

}
