package co.jp.chapter11;

public class Homework11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//question1
		Line yamanote = new Line();
		Station[] yamanote_Eki = new Station[30];
		yamanote_Eki[0] = new Station("Tokyo");
		yamanote_Eki[1] = new Station("Kanda");
		yamanote_Eki[2] = new Station("Akihabara");
		yamanote_Eki[3] = new Station("Okachimachi");
		yamanote_Eki[4] = new Station("Ueno");
		yamanote_Eki[5] = new Station("Uguisudani");
		yamanote_Eki[6] = new Station("Nippori");
		yamanote_Eki[7] = new Station("Nishi-Nippori");
		yamanote_Eki[8] = new Station("Tabata");
		yamanote_Eki[9] = new Station("komagome");
		yamanote_Eki[10] = new Station("Sugamo");
		yamanote_Eki[11] = new Station("Otsuka");
		yamanote_Eki[12] = new Station("Ikebukuro");
		yamanote_Eki[13] = new Station("Mejiro");
		yamanote_Eki[14] = new Station("Takadanobaba");
		yamanote_Eki[15] = new Station("Shin-Okubo");
		yamanote_Eki[16] = new Station("Shinjuku");
		yamanote_Eki[17] = new Station("Yoyogi");
		yamanote_Eki[18] = new Station("Harajuku");
		yamanote_Eki[19] = new Station("Shibuya");
		yamanote_Eki[20] = new Station("Ebisu");
		yamanote_Eki[21] = new Station("GotandaMeguro");
		yamanote_Eki[22] = new Station("Gotanda");
		yamanote_Eki[23] = new Station("Osaki");
		yamanote_Eki[24] = new Station("Shinagawa");
		yamanote_Eki[25] = new Station("Takanawa Gateway");
		yamanote_Eki[26] = new Station("Tamachi");
		yamanote_Eki[27] = new Station("Hamamatsucho");
		yamanote_Eki[28] = new Station("Shimbashi");
		yamanote_Eki[29] = new Station("Yurakucho");
		
		for(int i = 0; i < 30; i++) {
			yamanote.line_info.add(yamanote_Eki[i]);
		}
		yamanote.loop = true;
		//quesion2
		for(Station i : yamanote.line_info) {
			if(i.name.equals("Shimbashi")) {
				System.out.println("YES!");
			}
		}
		//question3
		Train train1 = new Train();
		for(int i = 0; i < 31; i++) {
			train1.addPassenger("1");
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(train1.cage[i][j] + ' ');
			}
			System.out.println();
		}

	}

}
