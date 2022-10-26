package co.jp.chapter06;

public class JavaChapter06 {

	// 入口
	// 写在这里的话 是全局变量 クラスメンバー
	// 2返回值 1函数名 3引数
	public static void main(String[] args) { // 只存在于这个函数里面的局部变量 メソットメンバー
//		//void 当前函数不返回任何值

		// オーバロード 引数的左边得一致，引数得不同

		// 例子
//		int a =76;
//		boolean flg = true;
//		String str ="abc";
//		System.out.println(a);
//		System.out.println(flg);
//		System.out.println(str);

		// 以上比较麻烦，以下简略方式

//		int a = 3;
//		int b = 4;
//		System.out.println(sum(a, b));
//
//		String x = "1";
//		String y = "7";
//		System.out.println(x + y);// 结果是17
//		System.out.println(sum(x, y));
//	}

		// 需要以下的转化才能正常运算加法
//	static int sum(String itema, String itemb) {
//		return Integer.valueOf(itema) + Integer.valueOf(itemb);
//		// 把信息转化为数字
//	}
//		
//		
//		int a = 3;    
//		//变量名
//		int b = 4;
//		int d = sub(a,b);
//		System.out.println(d);
//		int c = sum(a,b);        // --------------
//		//引数 传递函数的值                         |
//		System.out.println(c);             //    |                            
//		int c = a + b;	                   //    |
//		int d = a + b;//同上得重新输入一次      //  |　　相对应
//		                                   //    |
//		int x = 100;                       //    | 
//		int y = 99;                        //    | 
//                                     //	     |
//		System.out.println(sum(x,y));     //     |
//	}                                     //     |
//                                        //     |
//	static int sum(int itema,int itemb) { //◀︎-----
//		          //引数名
//		
//		//函数看小括号里的
//                              
////		int rtn = itema  + itemb;//无意义 ️
////		return rtn; //简化⬇
////		return 0;//无逻辑
//		return itema + itemb;
//	}
//	static int sum(int itema, int itemb) {
//		return itema + itemb;
//	}
//
//	static int sub(int itema, int itemb) {
//		return itema - itemb;
//	}

		// 可变长
//	static int sum(int... items) {
//		int rtn = 0;
//		for (int item : items) {
//			rtn += item;//循环+1
//		}
//		return rtn;
//	}
//	//或者 两种写法
//	static int sum(int[]array) {
//		int rtn = 0;
//		for (int item : array) {
//			rtn += item;
//		}
//		return rtn;
//	}

		// 递归
		//1 占内存 引数必须是一个变式
//		int a = 5;
//		fact(a);
//	}
//		static int fact(int n) {
//			System.out.println(n);
//			if(n == 0)
//				return 1;
//				else
//					return fact(n - 1) ;
//		}
//		static String print(int item) {
//			return String.valueOf(item);
//		}

		// 等于
		//2 不占内存
//		int a = 5;
//		int tmp = a;
//		
//		for(int i = 0;i <= a;i++) {
//			System.out.println(tmp);
//			if(tmp == 0) {
//				break;
//			}
//			tmp--;
//		}
//	}

		// 等于
		//3 不占内存
//		int a = 5;
//		for (;;) {
//			System.out.println(a);
//			a--;
//			if (a < 0) {
//				break;
//			}
//		}
//	}

}
