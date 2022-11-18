package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// JavaHomeWork 9.1
		
		// 質問1：以下ソースにラムダ式の使う場所を解釈してください。
		// 1 import java.awt.event.ActionEvent;
		// 2 import java.awt.event.ActionListener;
		// 3 import javax.swing.JButton;
		// 4 import javax.swing.JFrame;
		// 5
		// 6 public class GUIsample {
		// 7
		// 8   public static void main(String[] args) {	
		// 9   JFrame window = new JFrame("DCNet Java 教育");
		// 10  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 11  window.setSize(800, 600);
		// 12  JButton btn = new JButton("hello world");
		// 13  window.getContentPane().add(btn);
		// 14				
		// 15  btn.addActionListener((ActionEvent e) -> {
		// 16    System.out.println("ボタンクリックしました。");
		// 17  });
		// 18    window.setVisible(true);	
		// 19  }
		// 20 }
		// 回答：在第15行addActionListener的方法内使用了lambda表达式实现接口，window.setVisible(true)调用该接口
		// 如果动作e被执行，则输出ボタンクリックしました。
		
		// 質問2：以下ソースに匿名クラスの利用する行は?
		// 1 public class Kicker {
		// 2
		// 3   public static void main(String[] args) {
		// 4      new Thread() {
		// 5          @Override
		// 6          public void run() {
		// 7             System.out.println("thread running...");
		// 8          }
		// 9      }.start();
		// 10  }
		// 11 }
		// 回答：匿名クラスの利用する行は 4~9 です。
		
		// JavaHomeWork 9.2(只写入需要回答的题目)
		
		// 質問1：クラス(Class)とは?クラス定義用のキーワードは「class」である。
		// 回答：类就是具备一些共同特征的实体的集合，
		
		// 質問13：クラス「Animal」を定義して、インスタント化しオブジェクトcatを作成します。変数catのsayHello()メソッドを呼び出してください。
		// 1.属性：年齢
		// 2.属性：名前
		// 3.属性：分類
		// 4.コンストラクタ：名前を渡して、初期化する
		// 5.操作：sayHello()：void
		// 6.操作：getName()：String自分の名称を返す
		
		// JavaHomeWork09.java
		// public class JavaHomeWork09 {
		// 
		//    public static void main(String[] args) {
		//       Animal cat = new Animal("Hello Kitty");
		//       cay.sayHello();
		//       System.out.println(cat.getName());
		//    }
		// }
		//
		// Animal.java
		// public class Animal {
		//
		//    public int age;
		//    public String name;
		//    public String type;
		//
		//    public Animal(String name) {
		//       this.name = name;
		//    }
		//    
		//    public String getName() {
		//       return name;
		//    }
		//    
		//    void sayHello() {
		//       System.out.println("hello kitty!");
		//    }
		// }
		
		// 質問14：以下1行を解釈してください。
		// 1 System.out.println(new Animal("cat").getName());
		// 回答：Animal类生成一个实体对象，并往被重写的Animal类构造方法中传入字符串cat，调用getName方法返回该字符串并输出。
		
		// 質問19：以下Animalクラスを継承して以下2クラスを作成してください。
		// 1.クラスCat。sayHelloメソッドをオーバーライドして、System.out.println("ニャー");
		// 2.クラスDog。sayHelloメソッドをオーバーライドして、System.out.println("ワン");
		
		// Cat.java
		// public class Cat extends Animal {
		//     @Override
		//     void sayHello() {
		//        System.out.println("ニャー");
		//     }
		// }
		//
		// Dog.java
		// public class Cat extends Animal {
		//     @Override
		//     void sayHello() {
		//        System.out.println("ワン");
		//     }
		// }
		
		// 質問20：以下コードをIS‐A関係で説明してください。
		// 1.Animal v0 = new Animal(); // v0はAnimal型
		// 2.Animal v1 = new Cat("a cat"); // v1はCat型、v1はAnimal型
		// 3.Animal v2 = new Dog("a dog"); // v2はDog型、v2はAnimal型
		// 4.
		// 5.Cat v3 = new Cat(""); // OK
		// 6.Dog v4 = new Dog(""); // OK
		// 7.
		// 8.Cat v5 = new Animal(""); // NG
		// 回答：クラスCatとクラスDogはクラスAnimalを継承します。v1はCat型、v2はDog型である。
		// 「Cat is Animal」、「Dog is Animal」

	}
}
