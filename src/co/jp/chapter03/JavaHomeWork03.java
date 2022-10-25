package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
        //米字
		/*int l = 10;
		for(int i = 0; i <= l; i++) {
			for(int j = 0; j <= l; j++) {
				//System.out.print("i=" + i + ": j=" + j +"  ");
				if(i == j || i + j == l ) {
					if(i == l || j == l) {
						System.out.print("" + i + j + "");
					}else
						System.out.print("" + i + j + " ");
				}else if(i == l/2 || j == l/2){
					if(i == l || j == l) {
						System.out.print("" + i + j + "");
					}else
						System.out.print("" + i + j + " ");
				}
				else {
					System.out.print("   ");				
				}
			}
			System.out.println();
		} */
		
		//双菱形
		int l = 11;
		int t = (l/2)/2;
		for(int i = 0; i <= l; i++) {
			for(int j = 0; j <= l; j++) {
				//System.out.print("i=" + i + ": j=" + j +"  ");
				if(i <= l/2 && j <= l/2) {
					if(i + j == l/2) {
						System.out.print("" + i + j + " ");
					}else if(i + j == l - (1 + t)){
						System.out.print("" + i + j + " ");
					}else
						System.out.print("   ");
				}
				else if(i <= l/2 && j > l/2) {
					if(j - i == l/2 + 1) {
						if(i == l || j == l) {
							System.out.print("" + i + j + "");
						}else
							System.out.print("" + i + j + " ");
				     }else if(j - i == 1 + t){
							System.out.print("" + i + j + " ");
					 }else
							System.out.print("   ");
				}
				else if(i > l/2 && j > l/2) {
					if(i + j == (l/2 + 1 + l)) {
						if(i == l || j == l) {
							System.out.print("" + i + j + "");
						}else
							System.out.print("" + i + j + " ");
					}else if(i + j == l + (1 + t)){
						System.out.print("" + i + j + " ");
					}else
						System.out.print("   ");
				}
				else{  //if(i > l/2 && j <= l/2)
					if(i - j == l/2 + 1) {
						if(i == l || j == l) {
							System.out.print("" + i + j + "");
						}else
							System.out.print("" + i + j + " ");
				     }else if(i - j == 1 + t){
							System.out.print("" + i + j + " ");
					 }else
							System.out.print("   ");
			    }
			}
			System.out.println();
		}
		// Homework03
		//質問1: 成績ランキング判断。入力値=56; 56
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		if(a >= 90) {
			System.out.println("A");
		}else if(a >= 80) {
			System.out.println("B");
		}else if(a >= 70) {
			System.out.println("C");
		}else if(a >= 60) {
			System.out.println("D");
		}else
			System.out.println("E");
		//質問2:500円は6枚; 100円は3枚; 10円は4枚; 5円は0枚; 1円は0枚
		int money = 3340;
		int count;
		int coins[] = {500, 100, 10, 5, 1};
		for(int i = 0; i < coins.length; i++) {
			count = money / coins[i];
			money %= coins[i];
			System.out.println(coins[i] + "円は" + count +"枚");
		}
		
	}
}