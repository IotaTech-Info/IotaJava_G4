package co.jp.chapter09;


	public  class Truck extends car implements Cost{
		public Truck(String name, int carnum, String type) {
			super(name,carnum,type);}
		
		public void cost() {
			
			System.out.println("料金は二千円です");
			
		}

		

	

}
