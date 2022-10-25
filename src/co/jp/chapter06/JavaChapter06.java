package co.jp.chapter06;

public class JavaChapter06 {
	
	//入口
	//写在这里的话 是全局变量 クラスメンバー
             //2返回值 1函数名 3引数    
	public static void main(String[] args) { //只存在于这个函数里面的局部变量　メソットメンバー
		//void 当前函数不返回任何值
		
		// TODO 自動生成されたメソッド・スタブ
		
		int a = 3;    
		//变量名
		int b = 4;
		int d = sub(a,b);
		System.out.println(d);
		int c = sum(a,b);        // --------------
		//引数 传递函数的值                         |
		System.out.println(c);             //    |                            
//		int c = a + b;	                         |
//		int d = a + b;//同上得重新输入一次          |　　相对应
		                                   //    |
		int x = 100;                       //    | 
		int y = 99;                        //    | 
                                         //	     |
                                         //	     |
                                         //	     |
		System.out.println(sum(x,y));     //     |
		                                  //     |
                                          //     |	
                                          //     |
	}                                     //     |
                                          //     |
	static int sum(int itema,int itemb) { //◀︎-----
		          //引数名
		
		//函数看小括号里的
                              
//		int rtn = itema  + itemb;//无意义 ️
//		return rtn; //简化⬇
//		return 0;//无逻辑
		return itema + itemb;
	}
	static int sub(int itema,int itemb) {
		return itema - itemb;
	}

}
