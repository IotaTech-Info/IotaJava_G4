package co.jp.chapter10;

public class JavaHomeWork10 {

	//質問１以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。
	/*
	 
	public class Pet {

	public  enum PetType {
	    CAT,
	    DOG
	}
	 private String name;
	    private int age;
	    private PetType type;
	  
	    public Pet(String name, int age, PetType type) {
	        this.name = name;
	        this.age = age;
	        this.type = type;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public PetType getType() {
	        return type;
	    }
	    public class JavaChapter10
{
        public static void main(String[] args) {
	    String[] petData = {"みみ, 10, 1", "レオ, 1, 0", "マル,2,0"};
	    List<Pet> pets = new ArrayList<>();
	    
	    for (String data : petData) {
	        String[] info = data.split(",");
	        String name = info[0].trim();
	        int age = Integer.parseInt(info[1].trim());
	        PetType type = info[2].trim().equals("0") ? PetType.CAT : PetType.DOG;
	        pets.add(new Pet(name, age, type));
	    }

	    for (Pet pet : pets) {
	        System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Type: " + pet.getType());
	    }
	}
}


	 */
	
	//実行結果：
	/*
	Name: みみ, Age: 10, Type: DOG
	Name: レオ, Age: 1, Type: CAT
	Name: マル, Age: 2, Type: CAT
	*/
	
	
	//質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」の拡張⼦は「docx」である。
	//メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
	/*
	 public static String getFileType(String path) {
    int index = path.lastIndexOf(".");
    if (index == -1) {
        return "";
    }
    return path.substring(index + 1);
}

public static void main(String...args) {
 System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
 System.out.println(getFileType("c://windows//a a.test")); // test
 System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
 System.out.println(getFileType("c://windows//aaaaa")); // Empty
}

	 */
	
	//質問3
	/*
	 
	 public static void main(String...args) {
 	String value = "abced12345あいうえお１２３４５";
 	int byteCount = value.getBytes().length;
 	int digitCount = value.length();
 	System.out.println("Byte count: " + byteCount);
 	System.out.println("Digit count: " + digitCount);
	}

	 */
	//実行結果：
	//Byte count: 40
	//Digit count: 20

	
	//質問4
	/*
	 public static boolean nullOrEmpty(String value) {
  return value == null || value.isEmpty();
}

	 */
	
	//質問5
	/*
	 
public static void main(String... args) {
 	int one = 123456;
 	float two = 123456.99999F;
 	System.out.println(String.format("one=%,05d two=%05.2f", one, two));
}

	 */
	//実行結果：one=123,456 two=123457.00
	
	//質問6
	//System.out.println(String.format("%x", 16));

}
