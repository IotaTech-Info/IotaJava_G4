package co.jp.chapter10;

import java.util.Scanner;

public class JavaHomeWork10 {


	public static void main(String[] args) {
		//質問１
		int i=0;
		System.out.println("name,age,type(Japanese):");
		Scanner sc=new Scanner(System.in);
		Pet[] pet=new Pet[3];
	
		while(i<3) {
			String entry=sc.next();
			String[] array=entry.split(",");
			pet[i]=new Pet();
			pet[i].setName(array[0]);
			pet[i].setAge(Integer.valueOf(array[1]));
			pet[i].setType(PetType.getEumn(array[2]));
			i++;
		}
		System.out.println("name,age,type:");
		for(int l=0;l<pet.length;l++) {
			System.out.println(pet[l].getName()+","+pet[l].getAge()+","+pet[l].getType());
		}
		//質問２ 回答方法二つ
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//a aaaaa")); // empty
		System.out.println(getFileType("c://windows//a aa.bb.docx"));// docx
		//質問３
		String value ="abced12345あいうえお１２３４５";
		System.out.println(value.getBytes().length+"byte");
		System.out.println(value.length()+"桁");
		
//		value=null;
//		System.out.println(nullOrEmpty(value));
		
		//質問５
		float num=152.145646F;
		System.out.println(String.format("%,f",num));
		System.out.println(String.format("%05d",5));
		System.out.println(String.format("%,.2f",num));
		
		
		//質問６
		System.out.println(String.format("%x",16));
		
	}
	public static String getFileType(String path) {
		String type="";
//		その１
//		while(true) {
//			if(path.indexOf(".")==-1) break;
//			type=path.substring(path.indexOf(".")+1);
//			path=type;
//		}
//		その２
		for(int i=path.length()-1;i>=0;i--) {
			if(path.charAt(i)=='.') {
				type=path.substring(i+1);
				return type;
			}
		}
		return type;
		
	}
	
	//質問４
	public static boolean nullOrEmpty(String value) {
		//先にnull判断
		if(value==null) {
			return false;
		}
		//nullではない場合エラーが発生しない
		if(value.isEmpty()) {
			return true;
		}
		return false;
		}
}
