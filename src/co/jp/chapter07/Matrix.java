package co.jp.chapter07;


public class Matrix {
	// vars
	private final int[][] data;
	
	public Matrix(int[][] data) {
		this.data = data;
	}
	
	public int[][] getData() {
		return this.data;
	}
	
	public int[][] add(Matrix matrix) {
		int[][] data2 = matrix.getData();
		for (int i = 0; i < Math.min(new int[] {this.data.length, data2.length}); i++) {
			for (int j = 0; j < Math.min(new int[] {this.data[i].length, data2[i].length}); j++) {
				data[i][j] += data2[i][j];
			}
		}
		return data;
	}
	public static int[][] addTwoMatrix(Matrix matrix1, Matrix matrix2) {
		int[][] data1 = matrix1.getData();
		int[][] data2 = matrix2.getData();
		int x = Math.min(new int[] {data1.length, data2.length}), 
			y =  Math.min(new int[] {data1.length, data2.length});
		int[][] data3 = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				data3[i][j] = data1[i][j] + data2[i][j];
			}
		}
		return data3;
	}
}
