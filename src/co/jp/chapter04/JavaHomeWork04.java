package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) 
	{
		// TODO 自動生成されたメソッド・スタブ
		JavaHomeWork04 test=new JavaHomeWork04();
		test.Q1();
		System.out.println("\n");
		test.Q2();
		System.out.println("\n");
		test.Q3();
		System.out.println("\n");
		test.Q5();
		System.out.println("\n");
		test.Q6();
		System.out.println("\n");
		test.Q7();
	}
	//問題1
	public int[] Q1() 
	{
		int[]array_1=new int[4];
		for (int i = 0; i < array_1.length; i++) {
			array_1[i]=i;
			System.out.print(array_1[i]);
		}
		return array_1;
	}
	//問題2
	public void Q2() {
		int[] array_2=new int[] {5,6};
		for (int i : array_2) {
			System.out.print(i);
		}
	}
	//問題3
	public void Q3() {
		int [][] array_3=new int[2][3];
		for (int i = 0; i < array_3.length; i++) {
			for (int j = 0; j < array_3[0].length; j++) {
				array_3[i][j]=3;
				System.out.print(array_3[i][j]);
			}
			System.out.println("\n");
		}
	}
	//問題4
	//2次元配列　array2dをprintする
	//問題5
	public void Q5() {
		int[] array_5=new int[] {1,3,5,7,100,0,1};
		int max=array_5[0];
		int min=array_5[0];
		for (int i = 1; i < array_5.length; i++) {
			if (array_5[i]>max){
				max=array_5[i];
			}
		}
		
		for (int i = 1; i < array_5.length; i++) {
			if (array_5[i]<min) {
				min=array_5[i];
			}
		}
		System.out.println("Max is "+max+" Min is "+min);
	}
	//問題6
	public void Q6() {
		int sum=0;
		JavaHomeWork04 test=new JavaHomeWork04();
		int[] array_6=test.Q1();
		for (int i = 0; i < array_6.length; i++) {
			sum+=array_6[i];
		}
		System.out.println("問題1の配列の和は"+sum+"です");
	}
	//問題7
	public void Q7() {
		int [][] array_7_1=new int[2][2];
		int [][] array_7_2=new int[2][2];
		int [][] sum=new int[2][2];
		int [][] pro=new int[2][2];
		//二つ配列を初期化する
		for (int i = 0; i < array_7_1.length; i++) {
			for (int j = 0; j < array_7_1[0].length; j++) {
				array_7_1[i][j]=3;
			}
		}
		for (int i = 0; i < array_7_2.length; i++) {
			for (int j = 0; j < array_7_2[0].length; j++) {
				array_7_2[i][j]=3;
			}
		}
		//和と積を計算する
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				sum[i][j]=array_7_1[i][j]+array_7_2[i][j];
			}
		}
		for (int i = 0; i < pro.length; i++) {
			for (int j = 0; j < pro[0].length; j++) {
				pro[i][j]=array_7_1[i][j]*array_7_2[i][j];
			}
		}
		System.out.println("二つ配列の和は");
		for (int[] out : sum) {
			for (int inner : out) {
				System.out.print(inner);
			}
			System.out.println("\n");
		}
		System.out.println("二つ配列の積は");
		for (int[] out : pro) {
			for (int inner : out) {
				System.out.print(inner);
			}
			System.out.println("\n");
			
		}
	}
}
	