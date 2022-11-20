package co.jp.chapter09;

public class JavaHomeWork09 {

	/*
		
		質問１︓以下ソースにラムダ式の使う場所を解釈してください。
		
		
		
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
	 
	 答え； btn.addActionListener((ActionEvent e) -> 
	}
		 
		 質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
		 
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
			
		答え	new Thread()
			
		 */
	
	
	
	
	
	
	/*
	
	09 OOP - 練習問題
	質問１︓クラス（Class）とは︖クラス定義⽤のキーワードは「 class 」である。
	答え：クラス定義⽤のキーワードは「 class 」である。
	
	質問２︓クラスメンバ（Class member）の何種類ありますか。
	
	1. 属性・フィールド (Field)
	2. 関数(Function)・メソッド(Method)・操作(Operator)
	
	答え　1. 属性・フィールド (Field)
	　　　2. 関数(Function)・メソッド(Method)・操作(Operator)
	
	
	質問３︓クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。
	
	
	質問４︓コンストラクタの特徴
	1. 戻り値不要
	2. 関数名＝クラス名称
	
	質問５︓コンストラクタの作⽤︓クラス属性の初期化する。
	
	質問６︓１つクラスに複数のコンストラクタ持つ可能。
	
	質問７︓キーワード this の使⽤⽅法︓ this.name ︖ name ?

      public class People {
      private String name;
      public void setName(String name) {
      this.name = name;
      }
     }
     
     答え：this.name = name;
     
	質問８︓クラスを利⽤する為、インスタンス化する必要です。インスタンスの演算⼦は
	new です。
	
	
	
	質問９︓演算⼦ new の直後呼び出しているメソッドは「コンストラクタ」︔
	
	
	
	質問１０︓アクセス制御の３種類あります。
	1. + public
	2. # protected
	3. - private
	
	質問１１︓静的のメンバの定義するキーワード（修飾⼦）は static 。
	
	質問１２︓静的のメンバアクセス時、インスタンス化不要。アクセス⽅法は「クラス名.静的のメンバ」。
	
     1. System.out.println("1234"); // 静的のField
     2. String value = String.format("%05d", 0); // 静的のメソッド
	
	
	質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成します。
	変数catのsayHello()メソッドを呼び出してください。
	
	1  属性︓年齢
    2. 属性︓名前
    3. 属性︓分類
    4. コンストラクタ︓名前を渡して、初期化する
    5. 操作︓sayHello()︓void
    6. 操作︓getName(): String ⾃分の名称を返す
    
    

     public static void main(String[] args) {
	       Animal cat = new Animal(" cat");
	       cay.sayHello();
	      System.out.println(cat.getName());
	    }
	 }
	
	 Animal.java
	 public class Animal {

       public int age;
       public String name;
	   public String type;
	
	    public Animal(String name) {
	       this.name = name;
	       return name;
	   }
    
	    public String getName() {
	    }
   
	   void sayHello() {
       System.out.println("cat");
   }
    
    質問１４︓以下１⾏を解釈してください。
    
    1 System.out.println(new Animal("cat").getName());
    
    答え：Animalクラスを作り、そのなかのname関数を出力します
    
    質問１５︓クラス継承する⽤キーワードは「 extends 」︖
    
    
    質問１６︓継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位
    クラスは「サブクラス」と呼びます。
    
    質問１７︓サブクラス＆アクセス制御（ public, protected ）。
    
    質問１８︓サブクラスと親クラス同じメソッド名かつメソッドの引数は⼀致する場合、
    「オーバーライド」となります。
    
    質問１９︓以下Animalクラスを継承して以下２クラスを作成してください。
    1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
    2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
    ※親クラスに明⽰的なコンストラクタが存在しない場合、サブクラスは必ず親クラスのコ
    ンストラクタをオーバーライドします。
    
  
public class Cat extends Animal{
    @Override
	void speck() {
		System.out.println("ニャー");

	}
}

 }   	
  public class Dog extends Animal() {
    @Override
	void speck() {
		System.out.println("ニャー");

	}
}
    
	
	質問２０︓以下コードをIS-A関係で説明してください。

          Animal v0 = new Animal(); // v0 は Animal 型
          Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
          Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
          Cat v3 = new Cat(""); // OK
          Dog v4 = new Dog(""); // OK
          Cat v5 = new Animal(""); // NG
          
          
          答え；public class Cat extends Animal , public class Dog extends Animal
	
	*/
}
