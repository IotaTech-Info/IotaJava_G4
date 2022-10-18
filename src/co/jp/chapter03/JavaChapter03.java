package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//	int a = 0;
//	int b = 1;
//	
//		if (a == b) {
//			System.out.println("a = b");
//		}else {
//			System.out.println("a!=b");
//		}

		// loop for

		int l = 12;

		System.out.println("loop start");

		for (int i = 0; i < l; i++) { // 三合一，比较简洁
			for (int j = 0; j < l; j++) {
				if (i-j ==l / 2|| i+j ==l / 2 - 1 || j-i == l / 2 || i+j == l + l / 2 - 1) {
					System.out.print("" + i + j + " ");
				} else {
					if (i >= l/4 && i <= l/4*3 && j>= l/4 && j<= l/4*3) {
						if (i + j == l / 4*3 || j-i==l/4 || i-j==l/4 || i+j == l/2 + l/4*3) {
							System.out.print("" + i + j + " ");
						}else {
							System.out.print("  ");
						}
					}
					// 処理なし}
					System.out.print("  ");
				} 
			}				System.out.println();
		}
		System.out.println("loop end");

//		int i = 0; //i = index
//		// dead loop
//		for(;;) { //;; = 无条件执行
//			System.out.println(i);
//			i++; // i = i + 1;
//			
//			if(i > 10) {
//			break;
//			}else {
//				continue;//何もしない*
//			}
//			
//		
//		}

		// dead code
		
		
		
		//for
		
//		for(;i < 10;) {
//			
//		}
		
		
		
		
		//while
		
//		int index = 0;
//		
//		while(index < 10) {
//			System.out.println(index);
//			index++;
//		}
		
		
		
		//do while
		
//		int index_2 = 0;
//		do {
//			System.out.println(index_2);
//			index_2++;
//		}while(index_2 < 10);
		
		
//		int end_flg = 100;
//		for(int i =0; i < end_flg; i++ ) {
//			if(i % 2 > 0) {
//				continue;
//			}else {
//				System.out.println(i + ",");
//			}
//			
//			if (i == 50) {
//				break;
//			}
//		}
		
		
		// break:跳出当前循环
		// continue：符合条件，则不执行下面代码，重新回到循环
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
