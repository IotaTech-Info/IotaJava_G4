package part2;

public class Hotel {
	 
	 Room[][] rooms ;
	 //初始化房间编号和类型
	 public Hotel() {
	  
	  rooms= new Room[3][3];
	  
	
	  for(int i = 0 ; i < rooms.length ; i++) {
	   for(int j = 0; j < rooms[i].length ;j++) {
	    //一层
	    if (i == 0) {
	     String s = String.valueOf((i+1)*100+j+1);
	     rooms[i][j] = new Room(s,"迷你房" ,false);
	    }
	    
	    //二层
	    if(i == 1) {
	     String s = String.valueOf((i+1)*100+j+1);
	     rooms[i][j] = new Room(s,"普通房" ,false);
	    }
	    
	    //三层
	    if(i == 2) {
	     String s = String.valueOf((i+1)*100+j+1);
	     rooms[i][j] = new Room(s,"豪华房" ,false);
	    }
	   
	   }
	  }
	 }
	 //预定房间
	 public void order(String roomId) {
	  for(int i = 0 ; i < rooms.length ; i++) {
	   for(int j =0 ; j < rooms[i].length ; j++) {
	    if(rooms[i][j].getRoomId().equals(roomId)) {
	     //将房间状态改成ture 占用
	     rooms[i][j].setRoomVacant(true);
	    }
	   }
	  }
	 }
	 
	 //退订房间
	 public void checkOut(String roomId) {
	  for(int i = 0 ; i < rooms.length ; i++) {
	   for(int j =0 ; j < rooms[i].length ; j++) {
	    if(rooms[i][j].getRoomId().equals(roomId)) {
	     //将房间状态改成false 空房
	     rooms[i][j].setRoomVacant(false);
	    }
	   }
	  }
	 }
	 
	 //查看房间状态
	 public void check() {
	  for(int i = 0 ; i < rooms.length ; i++) {
	   for(int j =0 ; j < rooms[i].length ; j++) {
	    System.out.print(rooms[i][j] + " ");
	   }
	   System.out.println();
	  }
	 }
}


