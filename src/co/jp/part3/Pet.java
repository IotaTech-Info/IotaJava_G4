package co.jp.part3;

import java.util.Date;

public abstract class Pet{
	int no;
	String name;
	int age;
	PetType type;
	int status;
	Date time;
	
	public Pet() {
    }
	
	public Pet(int no,  String name, int age, PetType type, int status, Date time) {
		this.name=name;
		this.age = age;
		this.type = type;
		this.no = no;
		this.status = status;
		this.time = time;

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
        this.name = name;
    }
	
	public PetType getType() {
		return type;
	}
	
	public void setType(PetType type) {
        this.type = type;
    }
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
        this.age = age;
    }
	
	public int getNo() {
        return no;
    }
 
    public void setNo(int no) {
        this.no = no;
    }
 
    public int getStatus() {
        return status;
    }
 
    public void setStatus(int status) {
        this.status = status;
    }
 
    public void setTime(Date time) {
        this.time = time;
    }
 
    public Date getTime() {
        return time;
    }
    
    public void eat() {
		System.out.println("正在给动物喂食");
	}
  
    @Override
    public String toString() {
  		String roominfo = new String();
  		switch(status) 
  		{
  		case 0 :
  			roominfo = "ROOM信息{"+no+","+name+","+age+","+","+type+","+"空闲"+","+time+"}";
  			break;
  		case 1:
  			roominfo = "ROOM信息{"+no+","+name+","+age+","+type+","+"已入住"+","+time+"}";
  			break;
  		case -1:
  			roominfo = "ROOM信息{"+no+","+name+","+age+","+type+","+type+","+"已预约"+","+time+"}";
  			break;
  		}
  	    return roominfo;
  	}
 
    
}
