package co.jp.chapter10;

public class Homework10 {
	//question2
	public static String getFileType(String path) {
		String extension = "";
		String[] file =path.split(".");
		if(file.length > 1) {
			extension = file[file.length - 1];
		}
		return extension;
	}
	//question4
	public static boolean nullOrEmpty(String value) {
		if (value == null) return false;
		else if("".equals(value)) return true;
		else {
			//nullでもemptyでもない
			return true;
		}
	}
	public static void main(String[] args) {
		//question1
		Pet[] petHospital = new Pet[10];
		int num = 0;
		String question1_Input = "みみ, 10, 1\nレオ, 1, 0\nマル,2,0";
		//System.out.println(question1_Input);
		String[] question1_Guest = question1_Input.split("\n");
		//for(String test1 : question1_Guest) System.out.print(test1 + "*");
		for (String guest : question1_Guest) {
			String[] guestInfo = guest.split(",");
			String name = guestInfo[0].trim();
			int age = Integer.valueOf(guestInfo[1].trim());
			int type = Integer.valueOf(guestInfo[2].trim());
			petHospital[num] = new Pet(name, age, type);
			num++;
		}
		//question3
		String value = "abced12345あいうえお１２３４５";
		System.out.println("byte:" + value.getBytes().length + " length:" + value.length());
		//question5
		//%5.2f
		System.out.println(String.format("%5.2f",421.412344));
		System.out.println(String.format("%05d",5));
		//question6
		System.out.println(String.format("%x",16));
		
	}

}
