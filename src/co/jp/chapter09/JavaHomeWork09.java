package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
/*
 * 
 * 
btn.addActionListener((ActionEvent e) -> {// JButtonクラスの btn のメソッドをOverrideする
System.out.println("ボタンクリックしました。");
});
 */
		
		new Thread() {//この行で匿名クラスを作った 4行目
			@Override
			public void run() {
				System.out.println("Thread is running...");
			}
			
		}.start();
	}

}
