package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		//質問１︓以下コードのコンパイルエラー理由を教えてください。
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
		
		//PetクラスにsetAge()というメソッドが存在しない
		
		//質問２︓Mathクラスを作成してください。以下メソッドを定義します。
	
		/*
		 public class Math {
		 
		 //1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
		  
		 	public static int max(int[] input) {
		 		int max = input[0];
		 		for (int i = 0; i < input.length; i++) {
		 			if (input[i] > max) {
				　　　　max = input[i];
					}
				}
				return max;
			}
			
			//2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
			 
			public static int min(int[] input) {
		 		int min = input[0];
		 		for (int i = 0; i < input.length; i++) {
		 			if (input[i]<max) {
				　　　　min = input[i];
					}
				}
				return min;
			}
			
			//3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
			 
			public static int avg(int[] input) {
		 		int avg = input[0];
		 		int sum=0;
		 		for (int i = 0; i < input.length; i++) {
		 			sum+=input[i];
				}
				avg=sum/input.length;
				return avg;
			}
		}
		
		
		 public static void main(String[] args) {
		 	int[] input = { 1,2,3,4,5 };
		 	
		 	//4. mainメソッドで上記それぞれメソッドを呼び出してください。
		 	int max = Math.max(input);
			int min = Math.min(input);
			int avg = Math.avg(input);
			System.out.println("最大值：" + max + " 最小值：" + min + " 平均值：" + avg);	
		 }
		 
		 //2.行列計算。2D行列クラスのコンストラクタには１配列引数設定してください。
		
		// Matrix.java
		 
			public class Matrix {
				private final int[][] data;
				
				// コンストラクタ
				public Matrix(int[][] data) {
					this.data = data;
				}
				
				public int[][] getData() {
					return data;
				}
		
				// 行列 ADD
				public Matrix add(Matrix b) {
	    			Matrix c = new Matrix(data);
	    			c.data[0][0] = this.data[0][0] + b.data[0][0];
	    			c.data[0][1] = this.data[0][1] + b.data[0][1];
	    			c.data[1][0] = this.data[1][0] + b.data[1][0];
	    			c.data[1][1] = this.data[1][1] + b.data[1][1];
	    			return c;
	    		}	
			}
			// JavaChapter07.java
			  public class JavaChapter07 {
			 		public static void main (String[] args){
						int[][] data1 = { { 1, 2 }, { 2, 3 } };
						int[][] data2 = { {5, 6 }, { 7, 8 } };
						Matrix a = new Matrix(data1);
						Matrix b = new Matrix(data2);
						Matrix result = a.add(b);
						for (int i=0;i<2;i++) {
							for (int j=0;j<2;j++) {
								System.out.print(result.getData()[i][j]);
								System.out.print(" ");
							}
						System.out.println("");
					}
    			}
			}

		 */
		

	}
}
