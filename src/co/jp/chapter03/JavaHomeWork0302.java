package co.jp.chapter03;

public class JavaHomeWork0302 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    int b =3340;
    System.out.println("金額は"+b+"円です");
		int t;
		int kinsyu[] = {500,100,10,5,1};
		for (int i = 0; i < 4; i++) {
			t= b/kinsyu[i];
			if (t>0) {
				System.out.println(kinsyu[i]+"円は"+t+"枚です");
				b=b-t*kinsyu[i];
				
			}
		}
		
	}

}
