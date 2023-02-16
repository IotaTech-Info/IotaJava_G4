package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaChapter11_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//List and Set => add(), set() method
		//List get(index)
		
//		Map     print"Key = Value";  Map map = new HashMap<Key type, Value type>();
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		//add member => put
		map.put(110, "police");
		map.put(119, "fireman");
		System.out.println(map.toString());
		
		//renew member => put
		map.put(110, "police renew"); //same Key => renew
		map.put(120, "hospital");
		map.put(null, null); //get()时 设定为null和不存在都返回null
		
		System.out.println(map.containsKey(110));//查询key是否存在
		System.out.println(map.containsValue("hospital"));//查询value是否存在
		
		System.out.println(map.toString());
		
		//Key in Map => index in List
		String value = (String) map.get(911); //(String)=>因为要赋值给String所以要类型转换，否则get()取得是key的值
		if(value != null) { //
			System.out.println(value.toLowerCase()); //变小写toLowerCase()
		}else {
			System.out.println("911 empty");
		}
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			 System.out.println("key=" + entry.getKey() + "; value=" + entry.getValue());
		}
		
//		Map 套 list  无序！！
		System.out.println("--------map_list-------");
		Map<String, List<String>> map_list = new HashMap<String, List<String>>();
		String[] arr_1 = {"1","2","3"};
		String[] arr_2 = {"7","8","9"};
		String[] arr_3 = {"4","5","6"};
		List arrtolist_1 =  Arrays.asList(arr_1);
		List arrtolist_2 =  Arrays.asList(arr_2);
		List arrtolist_3 =  Arrays.asList(arr_3);
		map_list.put("arrtolist_1", arrtolist_1);
		map_list.put("arrtolist_2", arrtolist_2);
		map_list.put("arrtolist_3", arrtolist_3);
		for (Map.Entry<String, List<String>> entry : map_list.entrySet()) {
			List<String> listinmap = entry.getValue();
			if(listinmap != null && listinmap.size() > 0) {
				for(String item : listinmap) {
					System.out.print(item + ",");
				}
				System.out.println();
			}
		}
		
//		list 套list  有序！！
		System.out.println("--------list_list-------");
		List<List<String>> list_list = new ArrayList<List<String>>();
		list_list.add(arrtolist_1);
		list_list.add(arrtolist_2);
		list_list.add(arrtolist_3);
		for(List<String> list_inner : list_list) {
			for(String str : list_inner) {
				System.out.print(str + ",");
			}
			System.out.println();
		}
		

	}
}
