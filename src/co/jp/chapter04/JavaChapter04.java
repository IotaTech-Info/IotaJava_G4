package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {

		
		
		int[] array_int = {0,1,2,3,4,5,6};
		String[] array_str = {"0","1","2","3","4"};
		
		Object[] array_obj = {1,"1", null, 3.14f};
		
		System.out.println(Arrays.toString(array_int));
		System.out.println(Arrays.toString(array_str));
		System.out.println(Arrays.toString(array_obj));
		
		
		// method1
		int[] arr_1 = new int[]{1,2,3,4,5,6};
		
		System.out.println(arr_1[0]);//0代表第一个要素的位置。
		System.out.println("index for");
		
		
		for(int i = 0; i< arr_1.length; i++) {
			System.out.print(arr_1[i] + ",");
		}// index for
		System.out.println("");
		System.out.println("拡張for");
		for(int item : arr_1) {
			System.out.print(item + ",");
		}// extended for
		
		System.out.println("");
		
		//method2
		int [] arr_2 = new int[10]; //内存帮我保留10个空槽
		
		System.out.println("arr_2の長さは" + arr_2.length);
		System.out.println(Arrays.toString(arr_2));
		
		
		//length在int上面用方法，而配列里面是属性。
		//没有初始化的话，单纯保留内存，则保留的信息为null（String,Object)或者0（int）
		
		
		
		int [] [] arr_m = new int[10][5];
		
		int[] [] arr_m_2 = {
				{1},
				{2,2},
				{3,3},
				{4,4}
		};
		
		System.out.println(Arrays.toString(arr_m));
		
		for(int i_2 = 0; i_2 < arr_m.length; i_2++) {
			for(int j = 0; j < arr_m[i_2].length; j++);
			System.out.println(arr_m[i_2][j] + ",");
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
