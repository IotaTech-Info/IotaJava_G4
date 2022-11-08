package co.jp.chapter01;

class Doggy
{
	private String Name;
	private int Age;

	
	public void SetName( String nm)
	{
		Name = nm;
	}
	
	public void SetAge( int ag)
	{
		Age = ag;
	}

	public void ShowProfile()
	{
		System.out.println("名前は" + Name + "です。" + Age + "歳です。");
		
		
	}
}

public class test5
{
	public static void main(String[] args)
	{
		Doggy MyDog = new Doggy();
		
		MyDog.SetName( "マロン");
		MyDog.SetAge( 3 );
		MyDog.ShowProfile();
	}
}
