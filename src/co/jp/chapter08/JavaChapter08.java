package co.jp.chapter08;

public class JavaChapter08{

	public static void main(String[] args) {
		Animal an=new Animal("dongwu",10,4);
		an.name="けもの";
		
		Cat cat=new Cat("mao",5,4,"white");
		cat.name="白猫";
		cat.speck();
		
		Bird bd=new Bird("b",1,2,"fei");
		System.out.println(bd.getWing());
		

	}
	
	

}
