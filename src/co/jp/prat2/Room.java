package co.jp.prat2;

public class Room extends Pet{
	
	int no;
	boolean che;
	boolean res;
	
	public Room() {
    }
	
	public Room(int no,  String name, int age, String type, boolean che, boolean res) {
		super.name=name;
		super.age = age;
		super.type = type;
		this.no = no;
		this.che = che;
		this.res = res;
	}
	
	

	public void setName(String name) {
        this.name = name;
    }
	
	public void setType(String type) {
        this.type = type;
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
 
 
    public boolean isChe() {
        return che;
    }
 
    public void setChe(boolean che) {
        this.che = che;
    }
	
    public boolean isRes() {
        return res;
    }
 
    public void setRes(boolean res) {
        this.res = res;
    }
  
    public String toString() {
        return "["+no+","+name+","+age+","+type+","+(che?"空室":"居住中")+","+(res?"予約なし":"予約中")+"]";
    }

    
}
