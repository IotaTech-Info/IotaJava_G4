package co.jp.PetHotel;

public class Pet {
	
	String Name;
	
	String Type;
	
	String OwnerName;
	
	void speck() {
			
	}
	

	public Pet(String name, String type, String ownerName) {
		super();
		this.Name = name;
		this.Type = type;
		this.OwnerName = ownerName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	


	
	

}
