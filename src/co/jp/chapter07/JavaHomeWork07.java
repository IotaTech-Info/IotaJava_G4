package co.jp.chapter07;

public class JavaHomeWork07 {
	/*
// Pet.java
 public class Pet {
 public String name;

 public void setName(String value) {
 this.name = value;
 }
}
// Kicker.java
 public class Kicker {
 public static void main(String...args) {
 Pet cat = new Pet();
 cat.setAge(1234);
 }
}
	
	*/

//コンパイルエラーはPetのクラスの中に「setAge」のメソッドがない。
	
	public class Math(){
		
		
		
		
		public static int MAX(int[] input){
			int max=input[0];
			for(int i: input){
				if(max<i)max=i
			}
			return max;
		}
		public static int MIN(int[] input){
			int min=input[0];
			for(int i: input){
				if(min>i)min=i
			}
			return min;
		}
		public static double avg(int[] input){
			int sum=0;
			int len=input.length();
			for (int i=0;i<len;i++){
				sum=sum+input[i];	
			}
			return (1.0*sum)/len;
		}
		
		
	}
}
