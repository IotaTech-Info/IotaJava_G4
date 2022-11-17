package co.jp.Part2_Presentation;

public class Hotel {
	Room[][] rooms;

  Hotel(){
        rooms = new Room[4][5];
	  for(int i=0;i<rooms.length;i++)
		  for(int j=0;j<rooms[i].length;j++){
					  rooms[i][j]=new Room(((i+1)*100+j+1)+ "", false);  
				  }
	  }
  
  //Print room info
  public void print(){
	  for(int i=0;i<rooms.length;i++){
		  for(int j=0;j<rooms[i].length;j++){
			  System.out.print(rooms[i][j] + " ");
		  }
		  System.out.println();
	  }
  }
  //Check in
  public void order(String no){
	  for(int i=0;i<rooms.length;i++){
		  for(int j=0;j<rooms[i].length;j++){
			  if(rooms[i][j].getNo().equals(no)){
				  rooms[i][j].setIsuse(true);
				  return ;
			  }
		  }
	  }
  }
  //Check out
  public void checkout(String no){
	  for(int i=0;i<rooms.length;i++){
		  for(int j=0;j<rooms[i].length;j++){
			  if(rooms[i][j].getNo().equals(no)){
				  rooms[i][j].setIsuse(false);
				  return ;
			  }
		  }
	  }
  }
}



//import java.util.Scanner;
//	
////public class Hotel {
//	static int h=5, w=10;
//	static String[] [] rooms = new String[5][10];
//
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			while(true) {
//				System.out.println("INPUT in,out,search,quit:");
//				String temp=s.next();
//				int room = 0;
//				if("in".equals(temp))
//					System.out.println("Room Number:");
//				room =s.nextInt();
//				System.out.println("Name:");
//				String name = s.next();
//				if (in(room,name)) System.out.println("Check in!");
//				System.out.println("room" + room + "name" + name);
//			}else if("out".equals(temp)) {
//				System.out.println("Room Number:");
//				room = s.nextInt();
//				if(out(room))System.out.println("check out success");
//				System.out.println("out" + room);
//			}else if("search".equals(temp)) {
//				System.out.println("input room number(-1 is all):");
//				room=s.nextInt();
//				search(room);
//			}else if("quit".equals(temp)) || "exit".equals(temp)){
//				breaks;
//			}else {
//				System.out.println("Error!");
//			}
//		}
//
//
//
//private static boolean search(int room) {
//	if (room ==-1) {
//		for (int i=0;i<h;i++) {
//			for(int j=0;j<w;j++) {
//				int room2=(i+1)*100+j+1;
//				System.out.println(room2+"\t");
//			}
//			System.out.println();
//			for(int k=0;k<2;k++) {
//				System.out.println(rooms[i][k]);
//				System.out.println("\t");
//			}
//			System.out.println();
//			System.out.println();
//		}
//		return true;
//	}else {
//		int r=room/100-1;
//		int c=room%100-1;
//		if(r<0||r>=h||c<0||c>=w) {
//			System.out.println("Room Number Error!");
//			return false;
//		}
//			System.out.println(rooms[r][c] == null?"empty":rooms[r][c]);
//			return true;
//		}
//	}
//	private static boolean out(int room) {
//		int r=room/100-1;
//		int c=room%100-1;
//		if(r<0||r>=h||c<0||c>=w) {
//			System.out.println("Room Number Error!");
//			return false;
//		}
//		if(room[r][c]==null||"".equals(room[r][c])) {
//			System.out.println("Empty room");
//			return false;
//		}
//		room[r][c]=null;
//		return true;
//	}
//	
//	private static boolean in(int room, String name) {
//		int r=room/100-1;
//		int c=room%100-1;
//		if(r<0||r>=h||c<0||c>=w) {
//			System.out.println("Room number error!");
//			return false;
//		}
//		if(room[r][c]!=null) {
//			System.out.println("Occupied");
//			return false;
//		}
//		room[r][c]=name;
//		return true;
//	}
//}
