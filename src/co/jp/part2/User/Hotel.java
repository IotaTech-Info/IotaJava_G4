package co.jp.part2.User;

import co.jp.part2.RoomStatus;
import co.jp.part2.Pet.Pet;

public class Hotel {

	
	//入室しているペットの情報
	private Pet pet;
	//この部屋の状況
	private int status=0;
	
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void showHetel() {
		if(status==RoomStatus.EMPTY) {
			System.out.print("(空)\t");
		}else if(status==RoomStatus.RESERVE) {
			System.out.print(pet.getName()+"(予) \t");
		}else {
			System.out.print(pet.getName()+"\t");
		}
	}
}
