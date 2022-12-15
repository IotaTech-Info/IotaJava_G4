package co.jp.chapter10;

public class JavaHomeWork10 {

	public static void main(String[] args) {

//		String code = "1";
//		
//		System.out.println(Pet_type.getEnum(code).type);

//		ペットマスタデータ
//		みみ, 10, 1
//		レオ, 1, 0
//		マル,2,0

		int num_cat = 0;
		int num_dog = 0;

		String data = "みみ, 10, 1\n" + "レオ, 1, 0\n" + "マル,2,0";

		String[] pet_data = data.split("\n");

		String[] pet_master = new String[pet_data.length];

//		System.out.println(pet_data[1]);

		for (int i = 0; i < pet_data.length; i++) {
			String[] pet_set = pet_data[i].split(",");

			int type = Integer.valueOf(pet_set[2].trim());

			if (type == 0) {
				num_cat++;
			} else if (type == 1) {
				num_dog++;
			}
		}

		String[] cat = new String[num_cat];

		String[] dog = new String[num_dog];
		
		int cat_count = 0;
		int dog_count = 0;

		for (int i = 0; i < pet_data.length; i++) {
			String[] pet_set = pet_data[i].split(",");
			Pet pet = new Pet();

			pet.setName(pet_set[0].trim());
			pet.setAge(Integer.valueOf(pet_set[1].trim()));
//			pet.setType(pet_set[2].trim());
			pet.setType(Pet_type.getEnum(pet_set[2].trim()).type);

			pet_master[i] = pet.toString();

			int type = Integer.valueOf(pet_set[2].trim());


			if (type == 0) {
				cat[cat_count] = pet_master[i];
				cat_count++;
			} else if (type == 1) {
				dog[cat_count] = pet_master[i];
				dog_count++;
			}
		}
//
		System.out.println(cat[0]);
		System.out.println(cat[1]);
		System.out.println(dog[0]);

//		質問2

		System.out.println(getFileType("c://windows//aa.xlsx"));
		System.out.println(getFileType("c://windows//a a.test"));
		System.out.println(getFileType("c://windows//aa.bb.docx"));
		System.out.println(getFileType("c://windows//aaaaa"));

//		質問3
		String value = "abced12345あいうえお１２３４５";

		System.out.println(value.getBytes().length);
		System.out.println(value.length());

//		質問4
		float s = 2.3F;
		System.out.println(setFormart(s));

//		質問5

		System.out.println(String.format("%x", 16));

	}

	public static String getFileType(String path) {

		String[] p = path.split("\\.");

//		System.out.println(Arrays.toString(p));

		String type = p[p.length - 1];

//		System.out.println(type);

		if (p.length > 1) {
			return type;
		} else {
			return "Not find type";
		}

	}

	public static boolean nullOrEmpty(String value) {
		if (value == null) {
			return false;
		} else {
			return true;
		}

	}

	public static String setFormart(String value) {

		return String.format("%05.2f", value);
	}

	public static String setFormart(Float value) {

		return String.format("%05.2f", value);
	}

}
