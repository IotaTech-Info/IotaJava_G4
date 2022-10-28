package practice;

public class homework04 {

	public static void main(String[] args) {
		
				//問題1:int[] array = new int[4]; 各要素の値を記載してください。
				//0,0,0,0
				
				// 問題2:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
				
				//5,6
				
				//問題3:int[][] array = new int[2][3]; 各要素の値を記載してください。 
				
				//0,0,0
				//0,0,0
				
				//問題4:以下2重Foreachを理解してください。
				
				int[][] array2d = new int[4][2]; //二维数组array2d的声明和动态初始化。
				for (int[] out : array2d) {      //在array2d中遍历外部。
					for (int inner : out) {      //继续遍历内侧。
						System.out.println(inner); //输出全部元素。八个0.
					}
				}
		//問題5:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値を System.out.println()。
		
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max =array[0];
		int min =array[0];
		for(int i = 0;i < array.length;i++){
			if(array[i]>=max){
				max = array[i];
			}
		}
		
		for(int i = 0;i < array.length;i++){
			if(array[i]<= min){
				min = array[i];
			}
		}
	
		System.out.println("最大値は："+ max);
		System.out.println("最小値は"+ min);
		
		
		//問題6:問題1の配列のSUMを求める。 答え： SUMは0です。
		
			int[] array_1 = new int[4];                                    
			int sum1 = 0;
			for(int i=0;i<array_1[i];i++){
	        sum1 += array_1[i];
			}
		
			System.out.println("SUMは：" + sum1);   
		
			//問題7:行列(2次元配列)の和と積を計算してください。
			
			int[][] array7 = new int[][] { { 1, 2 },  { 3, 4 } };
				  
			int[][] array8 = new int[][] { { 5, 6 }, { 7, 8 } };
				
			int[][] arraysum=new int [2][2];
			int[][] arraymulti=new int [2][2];

			for(int i=0;i<array7.length;i++) {
				for(int j=0;j<array7.length;j++) {
				  arraysum[i][j]=array7[i][j]+array8[i][j];
	              arraymulti[i][j]=array7[i][j]*array8[i][j];
				}
			}

			System.out.println("２次元配列の和は");
			for(int [] out:arraysum) {
				for(int inner:out) {
					System.out.print(inner+" ");
				}
				System.out.println();
			}

			System.out.println("２次元配列の積は");
			for(int [] out:arraymulti) {
				for(int inner:out) {
					System.out.print(inner+" ");
				}
				System.out.println();
			}
		
	}

}
