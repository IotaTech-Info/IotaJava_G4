package co.jp.chapter11;

public class Train {

	public String[][] cage = new String[10][5];
	private int num;
	
	Train(){
		this.num = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				this.cage[i][j] = "0";
			}
		}
	}

	public void addPassenger(String name) {
		if(this.num >= 50) return; 
		this.cage[this.num / 5][this.num % 5] = name;
		this.num++;
	}
}
