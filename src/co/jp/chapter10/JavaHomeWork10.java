package co.jp.chapter10;

public class JavaHomeWork10 {
	public static void main(String[] args) {
		// 質問1：
		String str_Data = "みみ,10,1\n" + "レオ,1,0\n" + "マル,2,0";
		String[] arr = str_Data.split("\n");
		String pet01 = arr[0];
		String pet02 = arr[1];
		String pet03 = arr[2];

		String[] arr1 = pet01.split(",");
		String[] arr2 = pet02.split(",");
		String[] arr3 = pet03.split(",");

		Pet[] pet = new Pet[3];
		pet[0] = new Pet();
		pet[0].setName(arr1[0]);
		pet[0].setAge(Integer.valueOf(arr1[1]));
		pet[0].setType(PetType.getEumn(arr1[2]));

		pet[1] = new Pet();
		pet[1].setName(arr2[0]);
		pet[1].setAge(Integer.valueOf(arr2[1]));
		pet[1].setType(PetType.getEumn(arr2[2]));

		pet[2] = new Pet();
		pet[2].setName(arr1[0]);
		pet[2].setAge(Integer.valueOf(arr3[1]));
		pet[2].setType(PetType.getEumn(arr3[2]));

		// 質問2：

		System.out.println(getFileType("c://windows//aa.xlsx"));
		System.out.println(getFileType("c://windows//a a.test"));
		System.out.println(getFileType("c://windows//aa.bb.docx"));
		System.out.println(getFileType("c://windows//aaaaa"));

		// 質問3：
		String value = "abced12345あいうえお１２３４５";
		System.out.println(value.getBytes().length);
		System.out.println(value.length());

		// 質問6：
		System.out.println(String.format("%x", 16));

	}

	// 質問2：
	public static String getFileType(String path) {

		String[] p = path.split("\\.");

		String type = p[p.length - 1];

		if (p.length > 1) {
			return type;
		} else {
			return "Not find type";
		}

	}

	// 質問4：
	public static boolean nullOrEmpty(String value) {
		// value は null or Empty 判断してください。
		if (value == null) {
			return false;
		} else {
			return true;
		}

	}

	// 質問5：
	public static String Formart(float value) {

		return String.format("%05.2f", value);
	}
}