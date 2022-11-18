package co.jp.Part2_Presentation;

public class Test {

		public static void main(String[] args){
			Hotel ht = new Hotel();
			ht.print();
			//Order
			ht.order("201");
			ht.print();
			//Checkout
			ht.checkout("201");
			ht.print();
			
			//feed dog
			Dog dg = new Dog("Snoppy", 2, "DOG");
			dg.eat();
			//walk dog
			dg.walk();
			
			//trim/bath cat
			Cat ct = new Cat("Hello kitty", 2, "CAT");
			ct.trim_bath();
		}
	
}
