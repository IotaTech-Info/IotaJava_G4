package co.jp.chapter07;

public class Matrix {
	private final int[][] data;

	public int[][] getData() {
		return data;
	}

	public Matrix(int[][] data) {
		this.data = data;
	}

	public Matrix add(Matrix b) {
		Matrix c = new Matrix(data);
		c.data[0][0] += b.data[0][0];
		c.data[0][1] += b.data[0][1];
		c.data[1][0] += b.data[1][0];
		c.data[1][1] += b.data[1][1];
		return c;
	}

}
