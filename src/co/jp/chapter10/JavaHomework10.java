package co.jp.chapter10;

import java.io.UnsupportedEncodingException;

enum Type 
{ 
   cat, dog;
} 


public class JavaHomework10 {
	

	static String getFileType(String path) {
	
	return path.substring(path.lastIndexOf(".") + 1);
		
	}
	
	//質問4
    public static boolean nullOrEmpty(String value) { 
    	// value null or Empty
    	if (value != null && value.length() != 0) {
    		return  false;
    	}else {
        	return true;
    	}
    		
    }

	public static void main(String[] args) throws UnsupportedEncodingException {
		//質問1:
//		String str = "name, age, type"; 
//		String st1 = "みみ, 10, 1"; 
//		String st2 = "レオ, 1, 0"; 
//		String st3= "マル,2,0";
//		
//	    String[] temp;
//	    String delimeter = ","; 
//	    temp = st1.split(delimeter); 
//
//	    for(int i =0; i < temp.length ; i++){
//	         System.out.println(temp[i]);
//	         System.out.println("");
//	     }
//	
//	    Pet pet1 = new Pet(temp[0], Integer.valueOf(temp[1]), temp[2]);
	    
	    
		//質問2:
//	    System.out.println(getFileType("c://windows//aa.xlsx"));
	    
	    //質問3
	    String value = "abced12345あいうえお12345";
	    //バイト
	    System.out.println(value.getBytes("UTF-8").length + value.getBytes("Shift_JIS").length);
	    //桁数
	    System.out.println(value.getBytes("UTF-8").length + value.getBytes("Shift_JIS").length/3);
	    
	    
	    //質問5
	    //浮動小数点数
	    double num = 1.23456;
	    System.out.println(String.format("値は「%.3f」です。", num));
	    //⻑さは5桁数
	    System.out.println(String.format("%05d", num));
	    //精度は小数点後2位
	    System.out.println(String.format("%.2f", num));
	    
	    
	    //質問6:整数16の16進数をSystem.out.println()してください。
	  
	     System.out.println(String.format("16進数:%x", num)); 
	    
	
	    
	}
}

