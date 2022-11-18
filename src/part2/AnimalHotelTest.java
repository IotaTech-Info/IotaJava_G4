package part2;


import java.util.Scanner;

public class AnimalHotelTest {
 public static void main(String[] args) {
  System.out.println("----- 開始 -----");
  Scanner scan1 = new Scanner(System.in);
  System.out.println("欢迎来到动物酒店");
  Hotel h = new Hotel();
  
  


  String name ;
  int age = 0;
  String type ;

  for (;;) {
   //显示房间状态
   h.check();
   
   Scanner sc1 = new Scanner(System.in);

   System.out.println("预订，退房，退出");
   
   
    //接受用户的输入指令
    String order = scan1.next();
    
    
    //预订
    if("预订".equals(order)) {
     System.out.println("请输入房间编号");
     String roomId = scan1.next();
     h.order(roomId);
     System.out.println("请输入宠物信息");
     String input_message = sc1.nextLine();

     // 形式   名前,年齢,タイプ
     String[] input_array = input_message.split(",");
     name = input_array[0];
     age =Integer.valueOf(input_array[1]);
     type = input_array[2];
     
     // INPUT エラーチェック
     if (input_array.length < 3) {
      System.out.println("INPUT形式不正のため、異常終了");
      break;
     }
     //输出结果
     if (!"".equals(name) && age != 0 && !"".equals(type)) {}
     //
     System.out.println("输入信息为" + input_message);
     System.out.println("入住信息为：名前：" + name + " 年齢：" +age + " 类型 " + type + "入住房间号:" +roomId );
    }
  
    else if("退房".equals(order)) {
     System.out.println("请输入房间编号");
     String roomId = scan1.next();
     h.checkOut(roomId);
     System.out.println("请输入宠物信息");
     String input_message = sc1.nextLine();
     
     // 形式   名前,年齢,タイプ（DOG ,CAT,BIRDいずれかを入力してください）
     String[] input_array = input_message.split(",");
     name = input_array[0];
     age =Integer.valueOf(input_array[1]);
     type = input_array[2];
     if (!"".equals(name) && age != 0 && !"".equals(type)) {}
     
     //
     System.out.println("输入信息为" + input_message);
     System.out.println("退房信息为：名前：" + name + " 年齢：" +age + " タイプ" + type + " 入住房间号:" +roomId );
     
     // INPUT エラーチェック
     if (input_array.length < 3) {
      System.out.println("INPUT形式不正");
      break;
     }
     
    }
    else if("退出".equals(order)) {
     System.out.println("欢迎下次光临");
     System.out.println("----- 終了 -----");
     break;
     
    }

   }
   

   
  }
    

}