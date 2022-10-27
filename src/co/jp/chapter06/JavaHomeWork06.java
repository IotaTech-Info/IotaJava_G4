package co.jp.chapter06;

import java.util.ArrayList;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題2
		int [] array_1=gennerateArray(20, 1000);
		System.out.println("問題2");
		System.out.println(max(array_1));
		System.out.println(min(array_1));
		System.out.println(sum(array_1));
		//問題6-0
		System.out.println("問題6-0");
		ArrayList<Integer> list6_0=new ArrayList<Integer>();
		for (int i = 0; i < array_1.length; i++) {
			list6_0.add(array_1[i]);
		}
		printArray(list6_0.toArray());
		//問題6-1
		System.out.println("問題6-1");
		int[]left=new int[] {1,2,3,4};
		int[]right=new int[] {5,6,7,8};
		int[]result6_1=megerArray(left, right);
		ArrayList<Integer> list6_1=new ArrayList<Integer>();
		for (int i = 0; i < result6_1.length; i++) {
			list6_1.add(result6_1[i]);
		}
		printArray(list6_1.toArray());
		//問題6-2
		System.out.println("問題6-2");
		int [] array= {1,2,3,4};
		int[]result6_2=subArray(array, 1, 2);
		ArrayList<Integer> list6_2=new ArrayList<Integer>();
		for (int i = 0; i < result6_2.length; i++) {
			list6_2.add(result6_2[i]);
		}
		printArray(list6_2.toArray());
		//問題7
		System.out.println("問題7");
		char[] input=new char[] {' ',' ','A','b',' ',' ','C',' '};
		char[] result7=trim(input);
		ArrayList<Character>list7=new ArrayList<>();
		for (int i = 0; i < result7.length; i++) {
			list7.add(result7[i]);
		}
		printArray(list7.toArray());
		//問題8
		System.out.println("問題8");
		int[] array8=gennerateArray(20, 100);
		int []result8=bubbleSort(array8);
		ArrayList<Integer>list8=new ArrayList<>();
		for (int i = 0; i < result8.length; i++) {
			list8.add(result8[i]);
		}
		printArray(list8.toArray());
		//問題9
		System.out.println("問題9");
		int[]array9_1=gennerateArray(10, 100);
		int[]array9_2=gennerateArray(10, 100);
		int[]result9=bubbleSort(megerArray(array9_1, array9_2));//一行
		ArrayList<Integer>list9=new ArrayList<>();
		for (int i = 0; i < result9.length; i++) {
			list9.add(result9[i]);
		}
		printArray(list9.toArray());
	}
	//問題1
	//修飾子;public static
	//返却型;void
	//関数名;main
	//引数;Sting型配列 args
	//問題2
	public static int max(int[] datas) {
		int max=datas[0];
		for (int i = 1; i < datas.length; i++) {
			if (max<datas[i]) {
				max=datas[i];
			}
		}
		return max;
	}
	public static int min(int[] datas) {
		int min=datas[0];
		for (int i = 1; i < datas.length; i++) {
			if (min>datas[i]) {
				min=datas[i];
			}
		}
		return min;
	}
	public static int sum(int[] datas) {
		int sum=0;
		for (int i = 0; i < datas.length; i++) {
			sum+=datas[i];
		}
		return sum;
	}
	//問題3
	//null
	//問題4
	//value2
	//問題5
	//true
	//問題6-0
	public static void printArray(Object[] objs) {
		 if(objs == null) {
		 System.out.println("null");
		 return;
		 }
		 String prefix = "";
		 StringBuilder sb = new StringBuilder();
		 sb.append("[");
		 for(Object obj : objs) {
		 sb.append(prefix);
		 sb.append(String.valueOf(obj));
		 prefix = ", ";
		 }
		 sb.append("]");
		 System.out.println(sb.toString());
		}
	//問題6-1
	public static int[] megerArray(int[]left,int[]right) {
		ArrayList<Integer>temp=new ArrayList<Integer>();
		for (int i = 0; i<left.length; i++) {
			temp.add(left[i]);
		}
		for (int i = 0; i<right.length; i++) {
			temp.add(right[i]);
		}
		int[] result=new int[temp.size()];
		for (int i = 0; i <temp.size(); i++) {
			result[i]=temp.get(i);
		}
		return result;
	}
	//問題6-2
	public static int[] subArray(int[] input,int startindex,int len) {
		ArrayList<Integer>list=new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			list.add(input[i]);
		}
		int[]result=new int[list.subList(startindex, len+startindex).size()];
		for (int i = 0; i < result.length; i++) {
			result[i]=list.subList(startindex, len+startindex).get(i);
		}
		return result;
	}
	//subArrayのoverload
	public static char[] subArray(char []input,int startindex,int len) {
		ArrayList<Character>list=new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			list.add(input[i]);
		}
		char[]result=new char[list.subList(startindex, len+startindex).size()];
		for (int i = 0; i < result.length; i++) {
			result[i]=list.subList(startindex, len+startindex).get(i);
		}
		return result;
	}
	//問題7
	public static char[] trim(char[]input) {
		int start=0;
		int end=0;
		for (int i = 0; i < input.length; i++) {
			if (input[i]!=' ') {
				 start=i;
				 break;
			}
			
		}
		for (int i = input.length-1; i>0;i--) {
			if (input[i]!=' ') {
				 end=i+1;
				 break;
			}
		}
//		System.out.println(start);
//		System.out.println(end);
		return subArray(input, start,end-start);
			
	}
	//問題8
	public static int[] bubbleSort(int [] array) {
		int temp=0;
		for (int i = 0; i < array.length-1; i++) {
			int count=0;
			for (int j = 0; j <array.length-1- i; j++) {
				if (array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					count+=1;
				}
			}
			if (count==0) {
				break;
			}
		}
		return array;
	}

	//ランダム配列を作る
	public static int[] gennerateArray(int len,int max) {
			int[] arr=new int[len];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=(int)(Math.random()*max);
			}
			return arr;
			
		}
}