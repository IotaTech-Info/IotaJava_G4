package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int k = 0; k < 11; k++) {
			   for(int s = 0; s < 11; s++) {
			    if(k == s || k + s == 10|| k==5 || s==5 ) {
			    	if(s==10||k==10) {
			    		System.out.print("" + k + s + "");
			    	}else {
			    		System.out.print("" + k + s + " ");
			    	}
			    }else {
			     System.out.print("   ");
			    }
			   }
			   System.out.println();
			  }
	}
}
