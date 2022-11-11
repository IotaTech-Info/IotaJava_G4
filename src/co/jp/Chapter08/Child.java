package co.jp.Chapter08;

public class Child extends Parent {
	 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
	 public void hello() {
		 System.out.println("child method");
	 }
	}
