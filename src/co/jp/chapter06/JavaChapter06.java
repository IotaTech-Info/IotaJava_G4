package co.jp.chapter06;

/*
public class JavaChapter06 {

	public static void main(String[] args) {
		String x = "1";
		String y = "7";
		System.out.println(x+y);
		System.out.println(sum(x,y));
	}
	public static int sum(String item1, String item2) {
		return Integer.valueOf(item1) + Integer.valueOf(item2);
	}
	
}
*/
public class JavaChapter06{
	/*
	private static void sayHello(String y) {
		y = "Hello word";
	}
	public static void main(String[] args) {
		String x = null;
		sayHello(x);
		System.out.println(x);
	}
	*/
	private static void fillArray(String[] array) {
//		array[0] = "value2";
		array = new String[] {"1", "2"};
	}
	public static void main(String args[]) {
//		String[] array = new String[] {"value1"};
		String[] array = null;
		fillArray(array);
//		System.out.println(array[0]);
		System.out.println(array == null);
	}
}
