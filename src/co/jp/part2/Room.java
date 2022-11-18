package co.jp.presentation;

public class Room {
//房间编号
 private String roomId;
 //房间类型
 private String roomType;
 //是否空房
 private Boolean roomVacant;


 public String getRoomId() {
	return roomId;
}
public void setRoomId(String roomId) {
	this.roomId = roomId;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public Boolean getRoomVacant() {
	return roomVacant;
}
public void setRoomVacant(Boolean roomVacant) {
	this.roomVacant = roomVacant;
}


public Room(String roomId, String roomType, Boolean roomVacant) {
	super();
	this.roomId = roomId;
	this.roomType = roomType;
	this.roomVacant = roomVacant;

	
}

//无参构造函数
public Room() {
	
}
@Override
public String toString() {
	return "[" + roomId + "," + roomType + "," + roomVacant + "]" ;
}











 
 
}
