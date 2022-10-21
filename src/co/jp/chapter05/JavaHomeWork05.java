package co.jp.chapter05;

import java.util.ArrayList;
import java.util.List;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaHomeWork05 test =new JavaHomeWork05();
		System.out.println("問題1");
		test.Q1();
		System.out.println("問題2");
		test.Q2();
		System.out.println("問題3");
		test.Q3();
		System.out.println("問題4");
		test.Q4();
		System.out.println("問題5");
		test.Q5();
		System.out.println("問題6");
		test.Q6();
		System.out.println("問題7");
		test.Q7();
		System.out.println();
		System.out.println("問題8");
		test.Q8();
	}
	//問題1
	public void Q1() {
		int sum=0;
		for (int i = 0; i < 101; i++) {
			if (i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	//問題2
	public void Q2() {
		int pro=1;
		for (int i = 5; i > 0; i--) {
			pro*=i;
		}
		System.out.println(pro);
	}
	//問題3
	public void Q3() {
		int []array_3= {1,2,6,7,9,6,2,1};
		int max=array_3[0];
		int min=array_3[0];
		double sum=0;
		double avr=0;
		for (int i = 0; i < array_3.length; i++) {
			if (max<array_3[i]) {
				max=array_3[i];
			}
			if (min>array_3[i]) {
				min=array_3[i];
			}
			sum+=array_3[i];
		}
		avr=sum/array_3.length;
		System.out.println(max+" "+min+" "+sum+" "+avr);
	}
	//問題4
	public void Q4() {
		int []array_3= {1,2,6,7,9,6,2,1};
		int check;
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < array_3.length; i++) {
			check=array_3[i];
			for (int j = i+1; j < array_3.length; j++) {
				if (check==array_3[j]) {
					list.add(check);
				}
			}
		}
		System.out.println(list);
	}
	//問題5
	public void Q5() {
		int []array_3= {1,2,6,7,9,6,2,1};
		int check=7;
		for (int i = 0; i < array_3.length; i++) {
			if (check==array_3[i]) {
				System.out.println(i);
			}
		}
	}
	public void Q6() {
		int [][] array_6_1=new int[2][2];
		int [][] array_6_2=new int[2][2];
		int [][] pro=new int[2][2];
		//二つ配列を初期化する
		for (int i = 0; i < array_6_1.length; i++) {
			for (int j = 0; j < array_6_1[0].length; j++) {
				array_6_1[i][j]=3;
			}
		}
		for (int i = 0; i < array_6_2.length; i++) {
			for (int j = 0; j < array_6_2[0].length; j++) {
				array_6_2[i][j]=3;
			}
		}
		//和と積を計算する
		
		for (int i = 0; i < pro.length; i++) {
			for (int j = 0; j < pro[0].length; j++) {
				pro[i][j]=array_6_1[i][j]*array_6_2[i][j];
			}
		}
		System.out.println("二つ配列の積は");
		for (int[] out : pro) {
			for (int inner : out) {
				System.out.print(inner);
			}
			System.out.println("\n");
		}
	}
	//問題7
	public void Q7() {
		int[] array_7= gennerateArray(20,100);
		int temp=0;
		for (int i = 0; i < array_7.length; i++) {
			for (int j = i+1; j < array_7.length; j++) {
				if (array_7[i]>array_7[j]) {
					temp=array_7[i];
					array_7[i]=array_7[j];
					array_7[j]=temp;
				}
			}
		}
		for (int i : array_7) {
			System.out.print(i+" ");
		}
	}
	//問題8
	public void Q8() {
		int nums=10;
		int [][] array=new int[nums][];
		for (int i = 0; i < array.length; i++) {
			array[i]=new int[i+1];
		}
		for (int i = 0; i < array.length; i++) {
			array[i][0]=1;
			array[i][i]=1;
		}
		for (int i = 2; i < array.length; i++) {
			for (int j = 1; j <i; j++) {
				array[i][j]=array[i-1][j-1]+array[i-1][j];
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int k = array.length-i-1; k>0; k--) {
				System.out.print(" ");
			}
			for (int j=0; j <=i;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	//ランダム配列を作る
	public static int[] gennerateArray(int len,int max) {
		int[] arr=new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*max);
		}
		return arr;
	}
}
