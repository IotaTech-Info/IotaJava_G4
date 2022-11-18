package co.jp.chapter09;


public  class Kcar extends car implements Cost{
	
	public Kcar(String name, int carnum, String type) {
		super(name,carnum,type);
		// TODO 自動生成されたコンストラクター・スタブ
	}
		
		

		public void cost() {
			
			System.out.println("料金は500円です");
			
		}
}
		

	




