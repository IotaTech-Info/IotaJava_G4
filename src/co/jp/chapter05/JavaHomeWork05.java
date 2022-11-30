package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		
		//設問１︓1から100までの偶数の和を求める(for + if)。
		//回答：
		int sum_Q1=0;
		for (int i=1;i<=100;i++) {
			if (i%2==0) {
				sum_Q1+=i;
			}
		}
		System.out.println("1から100までの偶数の和は"+sum_Q1);
		
		
		//設問２︓5の階乗を求める(for)。
		//回答：
		int factorial_Q2=1;
		for (int i=1;i<=5;i++) {
			factorial_Q2*=i;
		}
		System.out.println("5の階乗は"+factorial_Q2);
		
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		//回答：
		int[] Q3=new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max_Q3=Q3[0];
		int min_Q3=Q3[0];
		int sum_Q3=0;
		for (int i:Q3) {
			if (i>max_Q3) {
				max_Q3=i;
			}
			if (i<min_Q3) {
				min_Q3=i;
			}
			sum_Q3+=i;
			
		}
		long average_Q3=sum_Q3/Q3.length;
		System.out.println("配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値は"+max_Q3+"、最⼩値は"+min_Q3+"、和は"+sum_Q3+"、平均値は"+average_Q3);
		
		//質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		//回答：
		for (int i=0; i<Q3.length; ++i) {
			for (int j=i+1; j<Q3.length; ++j) {
		    	if (Q3[i] == Q3[j]) {
		    		System.out.println(Q3[i]+"は重複ある要素です");
		    	}
		    }
		}
		
		//質問５︓質問３の配列に値「７」のインデックスを求む。
		//回答：
		for (int i=0; i<Q3.length; ++i) {
	    	if (Q3[i] ==7) {
	    		System.out.println("「７」のインデックスは"+(i));
	    	}
	    }
		
		//質問６︓任意⾏列（２次元配列）の積を求める。
		//回答：Chapter04問題7と似たような質問なので...
		
		//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		//回答：質問３の配列を昇順でソートする
		int[] sort_Q3=new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for (int i=0; i<sort_Q3.length; ++i) {
			for (int j=i+1; j<sort_Q3.length; ++j) {
		    	if (sort_Q3[i] > sort_Q3[j]) {
		    		int tmp =  sort_Q3[i];
		    		sort_Q3[i] = sort_Q3[j];
		    		sort_Q3[j] = tmp;
		    	}
		    }
		}
		System.out.print("質問３の配列を昇順でソートした結果：");
		for (int i : sort_Q3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//質問８︓LV10のパスカルの三⾓形を出⼒してください。
		//回答：
		System.out.println("LV10のパスカルの三⾓形：");
		int[] row_PT = new int[1];
		row_PT[0] = 1;
		for (int i = 0; i < 10; i++) {
			for (int j : row_PT) {
				System.out.print(j + " ");
			}
			System.out.println();
		
			row_PT = PT_Q8(row_PT);
		}
	}
	
	public static int[] PT_Q8(int[] row) {
		int[] next_row = new int[row.length + 1];
		next_row[0] = row[0];
		for (int i = 1; i < row.length; i++) {
			next_row[i] = row[i - 1] + row[i];
		}
		next_row[next_row.length - 1] = 1;
		return next_row;
	}
		
	
}
