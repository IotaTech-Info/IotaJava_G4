package co.jp.chapter07;

import java.util.Scanner;

public class JavaHomeWork07 {
	
	//以下コードのコンパイルエラー理由を教えてください
//	public class Pet {
//		public String name;
//		public void setName (String value) {
//		this.name = value;
//		}
//	}		
//	public class Kicker{
//		public static void main (String...args) {
//		Pet cat = new Pet ();
//		cat.setAge (1234);	
//		}
//	}
	//Pet Class does not have a method called "setAge"
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問2:Mathクラスを作成してください。以下メソッドを定義します		
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		System.out.println(Math.max(array));
		System.out.println(Math.min(array));
		System.out.println(Math.mean(array));

		//行列計算。2D行列クラスのコンストラクタには1配列引数設定してください。
		

		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int l=scan.nextInt();

        //0≤aij,bij≤10000なので
        //int型の最大範囲2147483647に入らない場合があるので注意！
        // int[][] a=new int[n][m];
        // int[][] b=new int[m][l];
        // int[][] c=new int[n][l];

        long[][] a = new long[n][m];
        long[][] b = new long[m][l];
        long[][] c = new long[n][l];

        //行列A
        for(int i=0;i<n;i++)for(int j=0;j<m;j++){
            a[i][j]=scan.nextInt();
        }

        //行列B
        for(int i=0;i<m;i++)for(int j=0;j<l;j++){
            b[i][j]=scan.nextInt();
        }
		
		System.out.println(b);

		

	}
	
	
}
