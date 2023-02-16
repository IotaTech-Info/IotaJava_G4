package co.jp.chapter12;

import java.io.IOException;

public class JavaChapter12 {
	
	static void speck(String str) throws MyException, IOException{//异常隔离：把下面三种异常都只显示为MyException
		try {
			System.out.println(str.toLowerCase());
		}
		catch(NullPointerException | ArithmeticException |ArrayIndexOutOfBoundsException e) {
			throw new MyException("Error! Please connect to the manager!");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("-----start-------");
		
		System.out.println("step1bef");
		String abc = null;//"abCBCCC"
		try {
			speck(abc);
		}catch(MyException e) { 
			System.out.println(e.message);
			e.printStackTrace();//print out Exception
		}catch(IOException e) { 
			System.out.println("IOException");
			e.printStackTrace();//print out Exception
		}
		System.out.println("step1aft");
		
		
		
//		Exception e_clone = null;
//		System.out.println("-----start-------");
//		
//		try {
//			System.out.println("step1bef");
//			String abc = null;
//			System.out.println("step1aft");
//			
////			System.out.println("step2bef");
////			System.out.println(abc.concat("")); //NullPointerException
////			System.out.println(20/0);//分母为零，异常 ArithmeticException
//			
////			System.out.println("step2aft");
//			
//		}catch(NullPointerException e) { 
//			System.out.println("NullPointer error!");
//			e.printStackTrace();//print out Exception
//		}

		
//		catch(NullPointerException | ArithmeticException |ArrayIndexOutOfBoundsException e) {  //连接所有异常
//			System.out.println("error!");
//			System.out.println(e);
//			e.printStackTrace();//print out Exception
//			
//			e_clone = e;
//		}
//		System.out.println("e_clone*" + e_clone.toString());
		
		//catch all Exception
//		catch(Exception e) { 
//			System.out.println("error!");
//			System.out.println(e);
//			e.printStackTrace();//print out Exception
//		}
//		//分别抓取
//		catch(NullPointerException e) { 
//			System.out.println("NullPointer error!");
//			System.out.println(e);
//			e.printStackTrace();//print out Exception
//		}
//		catch(ArithmeticException e) { 
//			System.out.println("Arithmetic error!");
//			System.out.println(e);
//			e.printStackTrace();//print out Exception
//		}
		
		//Finally 有无异常，都被执行
//		finally {         
//			System.out.println("---finally---");
//		}
		
		System.out.println("-----end-------");
	}
}
