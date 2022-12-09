package co.jp.chapter09;

public class JavaHomeWork09 {

	//質問１︓以下ソースにラムダ式の使う場所を解釈してください。
	/*
	 import java.awt.event.ActionEvent;
	 import java.awt.event.ActionListener;
	 import javax.swing.JButton;
	 import javax.swing.JFrame;
	public class GUISample {
 		public static void main(String[] args) {
 			JFrame window = new JFrame("DCNet Java 教育");
 			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 			window.setSize(800, 600);
 			JButton btn = new JButton("hello world");
 			window.getContentPane().add(btn);
 			btn.addActionListener((ActionEvent e) -> {
 				System.out.println("ボタンクリックしました。");
 			});
 			window.setVisible(true);
 		}
	}
	 */
	
	//ラムダ式の使用する場所は、
	/*
	btn.addActionListener((ActionEvent e) -> { 
		System.out.println("ボタンクリックしました。");
	 });です。
	*/
	//この行で、ActionListenerインタフェースのaddActionListener()メソッドにラムダ式を渡しています。
	//ラムダ式は、引数として受け取ったActionEventオブジェクトに対して、文字列を出力する処理を定義しています。
	
	//質問２︓以下ソースに匿名クラスの利用する行は︖
	/*
	 public class Kicker {
	 
 		public static void main(String... args) {
 			new Thread() {
 			@Override
 			public void run() {
 				System.out.println("thread running...");
	 		}
	 	}.start();
 	}
}

	 */
	
	//匿名クラスの利用する行は、new Thread() { ... }.start();です。
	
}
