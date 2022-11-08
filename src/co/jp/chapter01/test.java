package co.jp.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
	
		System.out.println("成績を入力してください");
		
	int inputScore;
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	
	inputScore = Integer.parseInt( br.readLine() );
	
			if(inputScore > 80) {
				System.out.println("優");
			}else if (inputScore >70) {
				System.out.println("良");
			}else if (inputScore > 60) {
				System.out.println("可");
			}else {
				System.out.println("不可");
			}
		
		
	}

}
