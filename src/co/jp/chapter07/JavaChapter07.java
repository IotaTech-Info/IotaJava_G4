package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(Pet.COUNT);
		Pet pet = new Pet("TOM CAT",5,2,"ME");

		System.out.println(Pet.COUNT);
		Pet pet2 = new Pet("Jerry",5,2,"Jerry's mather");

		System.out.println(Pet.COUNT);
		System.out.println(pet.getName());
		
		System.out.println(pet2.getMaster());
	}

}
