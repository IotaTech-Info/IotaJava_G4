package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		//質問１
		//メソッドsetAgeはPetクラスに存在しない。
		
		//質問２
		int[] datas = new int[] { 1, 7, 8, 4, 15, 8, 3 };
		System.out.println("最大値:"+Math.max(datas));
		System.out.println("最小値:"+Math.min(datas));
		System.out.println("平均値:"+Math.avg(datas));
		
		int[][] array2d_1 = new int[][] { { 1, 2 }, 
										  { 3, 4 } };
		int[][] array2d_2 = new int[][] { { 5, 6 }, 
										  { 7, 8 } };
		Matrix a=new Matrix(array2d_1);
		Matrix b=new Matrix(array2d_2);
		Matrix sum=a.add(b);
		
		for(int[] out:sum.getData()) {
			for(int inner:out) {
				System.out.print(inner+" ");
			}
			System.out.println();
		}
		
	}
}
