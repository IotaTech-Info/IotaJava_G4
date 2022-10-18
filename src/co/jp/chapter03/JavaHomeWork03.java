package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
		
//質問１

int a = 56;
System.out.println("成績ランキング判断。入力値＝" + a);

if(a >= 90) {
	System.out.println("A");
}else if(a >= 80) {
	System.out.println("B");
}else if(a >= 70) {
	System.out.println("C");
}else if(a >= 60) {
	System.out.println("D");
}else {
	System.out.println("E");
}

//質問２
int m = 3340;
int c = 0;

System.out.println("コインを数える");
while(m != 0) {
	if (m >= 500) {
		c = c + m/500;
		m = m % 500;
	}
	if (m >= 100) {
		c = c + m/100;
		m = m % 100;
	}
	if (m >= 50) {
		c = c + m / 50;
		m = m % 50;
	}
	if (m >= 10) {
		c = c + m / 10;
		m = m % 10;
	}
	if (m >= 5) {
		c = c + m / 5;
		m = m %5;
	}
	if (m >= 1) {
		c = c + m / 1;
		m = m % 1;
	}
}
System.out.println("" + c);



// 十字
int l = 11;

System.out.println("loop start");

for (int i = 0; i < l; i++) { // 三合一，比较简洁
	for (int j = 0; j < l; j++) {
		if (i == l/2 || j == l/2 || i + j == l - 1 || i == j) {
			System.out.print("" + i + j + " ");
		} else {
			// 処理なし}
			System.out.print("    ");
		}
	}
	System.out.println();
}
System.out.println("loop end");

// 菱形


System.out.println("loop start");

for (int i = 0; i < l; i++) { // 三合一，比较简洁
	for (int j = 0; j < l; j++) {
		if (i-j ==l / 2 || i+j ==l / 2 - 1 || j-i == l / 2 || i+j == l + l / 2 - 1) {
			System.out.print("" + i + j + " ");
		} else {
			// 処理なし}
			System.out.print("   ");
		}
	}
	System.out.println();
}
System.out.println("loop end");

	}
}