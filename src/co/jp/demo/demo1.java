package co.jp.demo ;

public class demo1 {

	public demo1() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		
		//作业1，1万块能过多少次路口
		double money = 100000;
		int i = 0;
		while(true) {
			if (money > 50000) {
				money *= 0.95;
				i++;			
			}
			else if (money<= 50000 && money >1000) {
			money -= 1000;
			i++;
			}
			else
			break;
		}
	
			System.out.println("" + i);
	}

}



