package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaChapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "abc";
		String[] arr = {"a", "b", "c"};
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		//collection 集合 主要：List Set Map
		List<String> list = new ArrayList<String>();
		list.add("a");
		
		System.out.println("list length_1:" + list.size());
		System.out.println("list member_1:" + list.toString());
		list.add("a");
		list.add("b");
		list.add("f");
		list.add("a");
		list.add("b");
		list.add("a");
		System.out.println("list length_2:" + list.size());
		System.out.println("list member_2:" + list.toString());
		System.out.println(list.indexOf("a"));
		System.out.println(list.indexOf("b"));
		System.out.println(list.lastIndexOf("a"));
		System.out.println(list.lastIndexOf("b"));
		list.add(list.size(), "c");// 0~length
		System.out.println("list length_3:" + list.size());
		System.out.println("list member_3:" + list.toString());
		//set 
		list.set(1, "e");
		System.out.println("list length_4:" + list.size());
		System.out.println("list member_4:" + list.toString());
		
		list.remove(0);// remove the member and shorten length (-1)
		//list.remove("a"); //only remove the first "a"
		System.out.println("list length_5:" + list.size());
		System.out.println("list member_5:" + list.toString());
		//list.removeAll(list); remove all members in list_remove
		List<String> list_remove = new ArrayList<String>();
		list_remove.add("b");
		
		list.removeAll(new ArrayList<String>());
		list.removeAll(list_remove);
		
		System.out.println("list length:" + list.size());
		System.out.println("list:" + list.toString());
		System.out.println("list_remove member_6:" + list_remove.toString());
//		list.clear(); clear all
//		System.out.println("list:(clear)" + list.toString());
		System.out.println(Arrays.toString(list.toArray()));
		Object list2 = ((ArrayList<String>) list).clone();//clone: list 向下转换Object -> ArrayList<String>
		System.out.println("list2:" + list2); 
		
		System.out.println("list:" + list);  //output List
		System.out.println("list.toString:" + list.toString());  //output String of List
//		List => Array
		System.out.println("list.toArray:" + list.toArray());  //output Array of list
		System.out.println("Arrays.toString(list.toArray()):" + Arrays.toString(list.toArray())); // output string of(Array of list)
//		String(split) => Array => list 读取文件切分生成数组=>转化到list
		String str_10 = "1,2,3,4,5,6,7,8,9,0";
		String[] arr_10 = str_10.split(",");
		List<String> list_10 = Arrays.asList(arr_10); //Arrays.asList()
		System.out.println(list_10);
//		subList  截取end前的元素，非文字
		System.out.println(list_10.subList(0, 5)); //index0-4
		System.out.println(str_10.substring(0, 5)); 
//		sort 
		Integer[] arr_sort = {123,3,2,4,222,111,33,222,3,2,2}; //int cannot define arrays which uses asList() 
		//must be Class Type + not Null
		List<Integer> list_sort = Arrays.asList(arr_sort);
		System.out.println("list_sort:" + list_sort.toString());
		list_sort.sort(Comparator.naturalOrder());// 自然排序方法不能有null
		System.out.println("naturalOrde list_sort:" + list_sort);
		
//		List =>Set  Set去重，并且自动排序，若add重复的元素，添加失效
		Set<Integer> list_to_set = new HashSet<Integer>(list_sort);
		System.out.println("list_to_set:" + list_to_set);
//		Set => List
		List<Integer> set_to_list = new ArrayList<Integer>(list_to_set);
		set_to_list.add(1);
		set_to_list.add(2);
		System.out.println("set_to_list:" + set_to_list);
		
//		Iterator 迭代 hasNext判断，next()返回当前index并指向下一个index
		Iterator it = set_to_list.iterator();//it => the first member of set_to_list
		while(it.hasNext()) { // if has next member
			System.out.println(it.next());//return the first and index the next
		}
	
	}
}
