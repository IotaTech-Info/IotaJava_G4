package co.jp.part3;

import co.jp.part3.Pet.Type;

public class PetFactory {
	public static Pet createPet(Type type, String name, int masterCode, int age, Boolean health, int code) {
		switch (type) {
		case DOG:
			return new Dog(name, masterCode, age, health, code);
		case CAT:
			return new Cat(name, masterCode, age, health, code);
		case BIRD:
			return new Bird(name, masterCode, age, health, code);
		default:
			System.out.println("TYPE超出范围，无法添加宠物");
			return null;
		}
	}

	public static String getPetTypeString(Pet pet) {
		switch (pet.type) {
		case DOG:
			return "犬";
		case CAT:
			return "猫";
		case BIRD:
			return "鳥";
		default:
			return "-";
		}
	}


}
