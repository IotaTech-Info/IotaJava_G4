package co.jp.chapter07;

public class DummyClass {
	static int class_m_1=99;
	
	
	static void speck() {
		System.out.println("speck:"+class_m_1);
	}
	
	
	public  static void main(String []args) {
		int a=777;
		System.out.println("main:"+class_m_1);
		speck();
		
	//	System.out.println("hello world");
		
	}

}
