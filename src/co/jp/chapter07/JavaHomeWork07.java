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

	public class Math{




		public static int MAX(int[] input){
			int max=input[0];
			for(int i: input){
				if(max<i)max=i;
			}
			return max;
		}
		public static int MIN(int[] input){
			int min=input[0];
			for(int i: input){
				if(min>i)min=i;
			}
			return min;
		}
		public static double avg(int[] input){
			int sum=0;
			int len=input.length;
			for (int i=0;i<len;i++){
				sum=sum+input[i];	
			}
			return (1.0*sum)/len;
		}
	
	}
	public class Matrix {
		private final int[][] data;

		public Matrix(int[][] data) {
			this.data=data;
		}
		public int w(){
			return data.length;
		}
		public int h(){
			return data[0].length;
		}
		public int[][] display(){
			return data;
		}
		public Matrix add(Matrix b) {
			if(!(b.w() == this.w() && b.h() == this.h())) {
				return null;
			}
			int[][] b_data=b.display();
			int[][] ret_data=new int[b.w()][b.h()];
			int[] tempw=new int[b.h()];
			int temph;
			for(int w=0;w<b.w();w++) {
				for(int h=0;h<b.h();h++) {
					temph=data[w][h]+b_data[w][h];
					tempw[h]=temph;
				}
				ret_data[w]=tempw;
			}
			return new Matrix(ret_data);
		}
	}

}
