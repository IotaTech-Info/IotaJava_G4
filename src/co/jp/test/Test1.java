package co.jp.test;

public class Test1 {
	
	public static void main(String[] args) {
		
		int[] array_int = {0,1,2,3,4,5,6,7,8,9};
		String[] array_str = {"0","1","2"};
		
		System.out.println(array_int);
		System.out.println(array_str);
		
		System.out.println(array_int.length);
		
		String str = "abc";
		System.out.println(str.length());
		System.out.println(array_str.length);
		
		System.out.println("...");
		
		int[] arr_1 = new int[] {1, 2222,0, 333, 43434, 6678, 8888};
		for (int i = 0; i <arr_1.length; i++) {
			System.out.println(arr_1[i]);
		}
	}
	
	
	
	

}
