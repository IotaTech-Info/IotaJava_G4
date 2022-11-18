

package co.jp.chapter07;

public class JavaHomeWork10
{

	public static void main(String[] args) {

		Pet pet = new Pet();
		pet.name = "cat";
		pet.age = 2;

		System.out.println(pet.name);
		System.out.println(pet.age);

		Pet pet2 = new Pet();
		pet2.name = "dog";
		pet2.age = 5;

		System.out.println(pet2.name);
		System.out.println(pet2.age);

		AmazonClass product1 = new AmazonClass();
		product1.name = "pen";
		product1.price = 100;
		//    product1.picture =(写真が保存している場所）;
	}


