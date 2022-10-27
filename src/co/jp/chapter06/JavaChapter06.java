package co.jp.chapter06;
import java.util.ArrayList;
import java.util.Scanner;
public class JavaChapter06 {
	
	public static void main(String[] args) {
		ArrayList<Integer>check=new ArrayList<>();
		int arr[][]=new int[3][3];
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int hang=i+1;
				int lie=j+1;
				System.out.println("请输入"+hang+"行,第"+lie+"列的数字");
				int number=scanner.nextInt();
				if (number<1||number>9) {
				System.out.println("请输入1到9的整数");
				j--;
				continue;
				}
				for (int k = 0; k <check.size(); k++) {
					if (number==check.get(k)) {
						System.out.println("数字不可重复");
						j--;
						break;
					}
				}
				arr[i][j]=number;
				check.add(number);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}



	
