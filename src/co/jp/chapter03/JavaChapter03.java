package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int n = 10;
		System.out.println("loop start");
		for(int i = 0 ;i<n;i++)
		{
			for(int j = 0 ;j<n;j++)
			{
				
				if(i<n/2&&j<n/2)
				{
					if(i+j==n/2-1)
					{
						System.out.print("" + i + j + " ");
					}
					else
					{
						System.out.print("   ");
					}
				}
				
				if(i<n/2 && j>=n/2)
				{
					if(j-i ==  n/2 )
					{
						System.out.print("" + i + j + " ");
						
					}
					else
					{
						System.out.print("   ");
					}
				}
				if(i>=n/2 && j<n/2)
				{
					if(i-j ==  n/2 )
					{
						System.out.print("" + i + j + " ");
						
					}
					else
					{
						System.out.print("   ");
					}
				}
				if(i>=n/2 && j>=n/2)
				{
					if(i+j ==  n/2+n-1 )
					{
						System.out.print("" + i + j + " ");
						
					}
					else
					{
						System.out.print("   ");
					}
				}
				
				
				
				//if(i ==0 || i==n-1 || j== 0 || j==n-1)
				//{
				//System.out.print("" + i + j + " ");
					//}
				//else
					//{
					//	System.out.print("   ");
				//}
			}
			System.out.println();
		}
		System.out.println("loop end");
		
	}
}
