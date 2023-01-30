package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１︓以下ソースにラムダ式の使う場所を解釈してください
		//
		//1 import java.awt.event.ActionEvent;
		//2 import java.awt.event.ActionListener;
		//3 import javax.swing.JButton;
		//4 import javax.swing.JFrame;
		//5
		//6 public class GUISample {
		//7
		//8  public static void main(String[] args) {
		//9  JFrame window = new JFrame("DCNet Java 教育");
		//10  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//11  window.setSize(800, 600);
		//12  JButton btn = new JButton("hello world");
		//13 window.getContentPane().add(btn);
		//14
		//15  btn.addActionListener((ActionEvent e) -> {
		//16  System.out.println("ボタンクリックしました。");
		//17  });
		//18 
		//19 window.setVisible(true);
	    //20  }
	    //21 }
		
		//回答：15-17行はラムダ式を使う。

		
		
		//質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
		//1 public class Kicker {
		//2 
		//3  public static void main(String... args) {
		//4 	 new Thread() {
		//5 	 @Override
		//6 	 public void run() {
		//7 	 System.out.println("thread running...");
		//8 	 }
		//9 	}.start();
		//10 	 }
		//11 }

		//回答：４行目から 
		
	}

}
