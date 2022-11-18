package co.jp.pethotel;

import java.util.Scanner;

public class HotelSystem {
 
 //房间数量
 int[][] house=new int[3][3];
 //住户姓名
 String[] householdName=new String[120];
 
 
 public HotelSystem()
 {
 Init();
 }
 //初始化数组
 public void Init()
 {
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 {
 house[i][j]=0;
 }
 }
 }
 //查询
 public void Search(HotelSystem hotel)
 {
 System.out.println("■■■■■■■■■■■■房间状态查询结果如下■■■■■■■■■■■■");
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 {
 if(hotel.house[i][j]==0)
 {
  System.out.println(i*3+j+1+"号房间无人居住");
 }
 else if(hotel.house[i][j]==1)
 {
  System.out.println(i*3+j+1+"号房间"+hotel.householdName[i*3+j+1]+"在住");
 }
 }
 }
 }
 //入住
 public void InHouse(HotelSystem hotel,int housNums,String name,Scanner sc)
 {
 System.out.println("■■■■■■■■■■■■客人入住■■■■■■■■■■■■");
 System.out.println("请输入宠物入住的房间号");
 housNums=sc.nextInt();
 System.out.println("请输入入住"+housNums+"宠物的姓名");
 name=sc.next();
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 {
 if(housNums==(i*3+j+1) && hotel.house[i][j]==0)
 {
  hotel.house[i][j]=1;
  hotel.householdName[housNums]=name;
  System.out.println("姓名为"+hotel.householdName[housNums]
  +"的客人入住"+housNums+"号房间");
  return;
 }
 else if(housNums==(i*3+j+1) && hotel.house[i][j]==1)
 {
  System.out.println("不好意思该房间已有宠物入住");
  return;
 }
 }
 }
 }
 //退房
 public void OutHouse(HotelSystem hotel,int housNums,Scanner sc)
 {
 System.out.println("■■■■■■■■■■■■宠物退房■■■■■■■■■■■■");
 System.out.println("请输入需要退房的房间号");
 housNums=sc.nextInt();
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 {
 if(housNums==(i*3+j+1) && hotel.house[i][j]==1)
 {
  hotel.house[i][j]=0;
  System.out.println(housNums+"号房间成功退房");  
  return;
 }
 }
 } 
 System.out.println("退房失败！");
 }
 //退出
 public void Quit()
 {
 System.out.println("■■■■■■■■■■■■退出程序■■■■■■■■■■■■");
 System.out.println("■■■■■■■■■■■■感谢使用，系统正在退出...■■■■■■■■■■■■");
 }
 
 public static void main(String[] args) {
 HotelSystem hotel=new HotelSystem();
 String command=null;
 int housNums=0;
 String name=null;
 
 Scanner sc=new Scanner(System.in);
 
 while(true)
 {
 System.out.println("■■■■■■■■■■■酒店管理系统命令■■■■■■■■■■■■■");
 System.out.println("■■■■■■■■■■■1、search  ■■■■■■■■■■■■■");
 System.out.println("■■■■■■■■■■■2、in   ■■■■■■■■■■■■■");
 System.out.println("■■■■■■■■■■■3、out   ■■■■■■■■■■■■■");
 System.out.println("■■■■■■■■■■■4、quit  ■■■■■■■■■■■■■");
 System.out.println("请输入你需要执行的命令");
 command=sc.next();
 if(command.equals("search"))
 {
 hotel.Search(hotel);
 }
 else if(command.equals("in"))
 {
 hotel.InHouse(hotel, housNums, name, sc);
 }
 else if(command.equals("out"))
 {
 hotel.OutHouse(hotel, housNums, sc);
 }
 else if(command.equals("quit"))
 {
 hotel.Quit();
 return;
 }
 }
 
 }
 
}