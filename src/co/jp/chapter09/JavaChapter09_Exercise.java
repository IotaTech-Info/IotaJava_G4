package co.jp.chapter09;

public class JavaChapter09_Exercise {
	
	//09 OOP - 練習問題
/*
	
	
質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成しま
す。変数catのsayHello()メソッドを呼び出してください。
class Animal {
  // 1. 属性: 年齢
  int age;
  
  // 2. 属性: 名前
  String name;
  
  // 3. 属性: 分類
  String type;
  
  // 4. コンストラクタ: 名前を渡して、初期化する
  public Animal(String name) {
    this.name = name;
  }
  
  // 5. 操作: sayHello() - void
  public void sayHello() {
    System.out.println("こんにちは、私の名前は" + this.name + "です。");
  }
  
  // 6. 操作: getName() - String 自分の名称を返す
  public String getName() {
    return this.name;
  }
}

// クラス「Animal」からオブジェクト「cat」をインスタンス化
Animal cat = new Animal("にゃんこ");

// 「cat」の「sayHello()」メソッドを呼び出す
cat.sayHello();



質問１４︓以下１行を解釈してください。
System.out.println(new Animal("cat").getName());

//この1行のコードは、新しい動物（「cat」という名前）を作成し、
//その名前を表示するものです。
 
 
質問２０︓以下コードをIS-A関係で説明してください。
Animal v0 = new Animal(); // v0 は Animal 型
Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
Cat v3 = new Cat(""); // OK
Dog v4 = new Dog(""); // OK
Cat v5 = new Animal(""); // NG

//Cat IS-A Animal
//Dog IS-A Animal

*/
}
