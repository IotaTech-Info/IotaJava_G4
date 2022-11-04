package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//設問１:1から100までの偶数の和を求める(for + if)。
		int sum = 0;
		for(int i=1;i<101;i++) {
			if(1%2==0) {
				sum +=i;
		}
		System.out.println("回答1："+sum);
		
		//設問２:5の階乗を求める(for)。
		int aumswer=1;
		for(int i=5;i!=1;i--) {
			aumswer*=i;
		}
		System.out.println("回答2："+aumswer);
		
		//質問３:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		int[] array = new int[] {1,2,6,7,9,6,2,1};
		int max = array[0],min = array[0];
		sum = 0;
		for(int i : array) {
			if(i>max)
				max = i;
			if(i<min)
				min = i;
			sum +=i;
			}
		System.out.println("最大値は"+max+"、最小値"+min);
		System.out.println("配列のsumは"+sum);
		System.out.println("配列のAVGは"+(double)sum/array.length);
		
		//質問４:質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
		System.out.print("回答5:");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length-1;j++) {
				if(array[i]==array[j]) {
					System.out.println(array[i]);
			
				}
			}
		}
		System.out.println();
		
		//質問５:質問３の配列に値「７」のインデックスを求む。
		for(int i=0;i<array.length;i++) {
			if(array[i]==7) {System.out.print(i);break;}
				
			}
		System.out.println();
		}
		//質問６:任意⾏列（２次元配列）の積を求める。
		//質問７:配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		//質問８:LV10のパスカルの三角形を出力してください。
	}
}
