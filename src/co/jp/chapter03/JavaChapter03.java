package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		int l = 12;
		int mid = l/2 ;
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < l; j++) {
				if( i  <= mid &&  j <= mid && i + j == mid - 1 )
					System.out.print("" + i + j + "\t");
				else if ( i <= mid && j >= mid &&  j - i == mid )
					System.out.print("" + i + j + "\t");
				else if( i >= mid && j <= mid && i - j == mid )
					System.out.print("" + i + j + "\t");
				else if(i >= mid && j >= mid && i + j == l + mid - 1 )
					System.out.print("" + i + j + "\t");
				else
					System.out.print("        ");
			}
			System.out.println();
		}

	}
}
