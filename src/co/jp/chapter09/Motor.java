package co.jp.chapter09;


public  class Motor extends car implements Cost{
	public Motor(String name, int carnum, String type) {
		super(name,carnum,type);}
		
		public void cost() {
			
			System.out.println("料金は00円です");
			
		}

		

	

}



