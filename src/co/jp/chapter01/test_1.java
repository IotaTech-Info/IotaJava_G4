
package co.jp.chapter01;
class Dog
{
	private String Name;
	private int Ages;
	
	public void SetName(String nm) 
	{
		Name=nm;
	}
	
	public void setAges(int ages) {
		Ages = ages;
	}	
	
	public void ShowProfile()
	{
		System.out.println("名前は、"+ Name +"です。");
		System.out.println("年齢は、"+ Ages +"歳です。");
	}




}
public class test_1 {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.SetName("Haruko");
		myDog.setAges(3);
		myDog.ShowProfile();
	}

}