package co.jp.chapter01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Javachapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );

int x = Integer.parseInt( br.readLine() );
int y = Integer.parseInt( br.readLine() );
int z = Integer.parseInt( br.readLine() );

System.out.println( MaxValue( x, MaxValue( y, z ) ) );
}

static int MaxValue( int n1, int n2 )
{
if( n1 > n2 )
return n1;
else
return n2;	 
	}	    
	
	
	
}
