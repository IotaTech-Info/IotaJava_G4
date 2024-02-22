package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {

		//		
		//		  int a=10;
		//		
		//	      String str="abc";
		//		
		//		
		//		
		//		     System.out.print(a);
		//		   System.out.print(str);
		////		
		//		 int  i =10;
		//		 String o ="10";
		//		 System.out.println(i);
		//		 System.out.println(o);
		//		 System.out.println(i+o);
		//		
		//		
		//		int[] i= {1,2,3,4,5,6};
		//		
		//		String[] j = {"1","2","3","4","5","6"};
		//		System.out.println(Arrays.toString(i));
		//		
		//		System.out.println(Arrays.toString(j));
		//		

		//		int [] i= {12,34,56,78,90};
		//		System.out.println(Arrays.toString(i));
		//		
		//		int [] j=new int[10];
		//		
		//		System.out.println();

		//		 //配列1
		//		int[] j= {1,2,3,4,5,6,7,9};
		//		System.out.println(j.length);
		//		
		//		//配列2
		//		int[] i =new int[10];
		//		System.out.println(i.length);
		//		
		//		
		//配列1
		//		 int[] i= {1,2,3,4,5,6};
		//		 String[] j = {"45","12","56","78","12","78"};
		//		 System.out.println(Arrays.toString(i));  //
		//		 System.out.println(Arrays.toString(j));  //求值
		//		 
		//		 System.out.println(i.length);    //
		//		 System.out.println(j.length);    //求长度
		//		 
		//配列2
		//		 int[] i=new int[10];
		//		 String[] j=new String[20];
		//		 System.out.println(Arrays.toString(i));  //
		//		 System.out.println(Arrays.toString(j));  //
		//		 
		//		 System.out.println(i.length);  //
		//		 System.out.println(j.length);  // 求长度
		//		 

		//		int[] i= {12,24,45,78,45,78,6555};
		//		System.out.println(i[0]);      //查询数组位置
		//		System.out.println( i[1]);     //0开始查
		//		System.out.println(i[5]);
		//		System.out.println(i[6]);
		//		System.out.println(i[4]);
		//		
		//		int[] hu = { 12, 45, 8, 65, 8, 78, 4566, 555 };
		//	for (int i = 0; i < hu.length; i++) {
		//			System.out.println(hu[i]);

		//		int[] i = {1,54,65,48,255,48,555,488,445,478};
		//		for(int j =0;j<i.length;j++) {
		//			System.out.println(i[j]);

		//			
		//			int[] i = {45,45,78,488,45};
		////			for( int j=0;j<i.length;j++) {
		////				System.out.println(i[j]);
		//				
		//				
		//				for(int item : i) {      //扩张for
		//					System.out.println(item);
		//					
		//					
		//				//	int[] a= {85,7854,785,45512,5566,5566,55566,7436};
		//			//		for(int b=0;b<a.length;b++) {
		//			//			System.out.println(a(b));

		//		
		//		            int[] i = {145,445,475211,7822,4886,22,6,2,2,5};
		//		            for(int itme : i) {
		//		            	System.out.println(itme);
		//		
		//		
		//		  int[][] i = new int [10][10];
		//		  for(int a=0;a<i.length;a++) {
		//			  for(int b = 0;b<i[a].length;b++) {
		//				  System.out.print(i[a][b]+",");
		//				  		  		   
		//			  }
		//			  System.out.println();

		int[] i = new int[] { 12, 545, 2, 85, 8545, 895, 12, 12, 12, 12, 12, 12 };
		String str = "";

		for (int a = 0; a < i.length; a++) {

			for (int b = 0; b < i.length; b++) { //不明白为什么就按顺序排出来了

				System.out.println(" ------ a:" + a + " ------ b:" + b);

				if (a != b) {
					if (i[a] < i[b]) {
						int c = i[b];
						i[b] = i[a];
						i[a] = c;

					} else if (i[a] == i[b]) {
						i[a] = 0;
					}
				}

				if (a == i.length - 1) {
					if (i[b] != 0) {
						str += i[b];
						str += ",";

						System.out.println(i[b]);

					}
				}

			}

		}

		//		for(int j =0;j<i.length;j++) {
		//			
		//			if(i[j]!=0) {
		//				str+=i[j]; 
		//				str+=",";
		//				
		//				System.out.println(i[j]);
		//				
		//			}
		//		}
		System.out.println("str:" + Arrays.toString(str.split(",")));

		System.out.println(Arrays.toString(i));
		//		System.out.println(Arrays.toString(i));
		//
		//		int[] i = {45,44,24,58,4,699,458,55};
		//		
		//		String[] j = {"2","545","555","788","2"};
		//		
		//		System.out.println(Arrays.toString(i));
		//		System.out.println(Arrays.toString(j));
		//		
		//		System.out.println(i.length);
		//		System.out.println(j.length);
		//		
		//		System.out.println(i[0]);
		//		System.out.println(j[1]);
		//		
		////		
		//		int[] i = {1,2,5,3,5,4,5,};
		//		String[] j = {"1","5","78","45","789"};
		//		
		//		System.out.println();
		//		
		//		
		//		int[] i=new int[10];
		//		String[] j =new String[20];
		//		System.out.println(Arrays.toString(i));
		//		System.out.println(Arrays.toString(j));
		//		
		//		System.out.println(i.length);
		//		System.out.println(j.length);
		//		
		//		System.out.println(i(0));
		//		System.out.println(j(3));

		////		
		//		int[] a = {1,25,45,668,78,25,559};
		//		for(int j=0;j<a.length;j++) {
		//		System.out.println(a(j));
		//		
		//		for(int item : i) {
		//			System.out.println(item);
		//		
		//		int[][] i=new int [10][15];
		//		for(int a=0;a<i.length;a++) {
		//			for(int b=0;b<i[a].length;b++) {
		//				System.out.println(Arrays.toString(i[a][b]);
		//			}

	}

}
