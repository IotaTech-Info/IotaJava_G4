package co.jp.Chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
//		質問１︓以下ソースにラムダ式の使う場所を解釈してください。
//		import java.awt.event.ActionEvent;
//
//		import javax.swing.JButton;
//		import javax.swing.JFrame;
//		public class GUISample {
//			 public static void main(String[] args) {
//				 JFrame window = new JFrame("DCNet Java 教育");
//				 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				 window.setSize(800, 600);
//				 JButton btn = new JButton("hello world");
//				 window.getContentPane().add(btn);
//				 btn.addActionListener((ActionEvent e) -> {
//					 System.out.println("ボタンクリックしました。");
//				 });
//				 window.setVisible(true);
//			 }
//		}
		// 在本作业的18~20行为lambda式，在18行中JButton的方法addActionListener的形参是一个接口
		// 因此传入值为实现该接口的类的实例。lambda式则实现了该接口的方法actionPerformed，并输出"ボタンクリックしました。"
		
//		質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
//		public class Kicker {
//			 public static void main(String... args) {
//			 new Thread() {
//			 @Override
//			 public void run() {
//				 System.out.println("thread running...");
//				 }
//			 }.start();
//			 }
//		}
		
		// 本作业的第32到35行
		
	}
}
