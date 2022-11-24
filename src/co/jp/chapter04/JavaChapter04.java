package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {
		int a=10;
		String str="10";
		
		System.out.println(a);
		System.out.println(str);
		
		int []array_int= {0,1,2,3,4,5,6,7,8,9};
		String [] array_str= {"0","1","2","3","4","5","6","7","8","9",};
		Object[] array_obj= {1,"1",null,3.14f,true};
		
		System.out.println(Arrays.toString(array_int));
		System.out.println(Arrays.toString(array_str));
		System.out.println(Arrays.toString(array_obj));
		
 
	}

}
