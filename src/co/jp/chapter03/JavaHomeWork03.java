package co.jp.chapter03;

import java.util.Scanner;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			System.out.println("質問１");
			System.out.println("成績入力してください");
			Scanner sc=new Scanner(System.in);
			
			int a=sc.nextInt();
			
			if(a>=90) System.out.println("A");
			else if(a>=80) System.out.println("B");
			else if(a>=70) System.out.println("C");
			else if(a>=60) System.out.println("D");
			else System.out.println("E");
			
			System.out.println("質問２");
			System.out.println("円を入力してください");
			int en=sc.nextInt();
			int result=0;
			int i=0;
			while(en>500) {
				en-=500;
				result++;
				i++;
			}
			System.out.println("500円は"+i+"マイ");
			i=0;
			while(en>100) {
				en-=100;
				result++;
				i++;
			}
			System.out.println("100円は"+i+"マイ");
			i=0;
			
			while(en>50) {
				en-=50;
				result++;
				i++;
			}
			System.out.println("50円は"+i+"マイ");
			i=0;
			
			while(en>10) {
				en-=10;
				result++;
				i++;
			}
			System.out.println("10円は"+i+"マイ");
			i=0;
			while(en!=0) {
				en--;
				result++;
				i++;
			}
			System.out.println("1円は"+i+"マイ");
			System.out.println("最優回答は"+result+"枚コイン");

	}
}