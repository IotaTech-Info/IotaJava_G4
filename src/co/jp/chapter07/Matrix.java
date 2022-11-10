package co.jp.chapter07;

public class Matrix {

	private final int[][] data;

	/** construct method */
	public Matrix(int[][] data) {
		this.data = data;
	}

	// 行列 ADD
	public Matrix add(Matrix b) {
		int[][] add = new int[data.length][data[0].length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				add[i][j] = data[i][j] + b.data[i][j];
			}
		}
		return new Matrix(add);
	}

	public int[][] getData() {
		return data;
	}

}
