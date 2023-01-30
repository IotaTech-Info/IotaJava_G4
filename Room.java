package part3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Room {

    private int roomNum;
    private Pet pet;
    private int giveFood;
    private String date;

    public Room(int roomNum, Pet pet, int giveFood) {
        this.roomNum = roomNum;
        this.pet = pet;
        this.giveFood = giveFood;
        Date date = new Date();
        // 将日期转化为字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date);
        this.date = dateStr;
    }

    @Override
    public String toString() {
        return this.getRoomNum() +","+ this.getPetInfo() +","+ this.getGiveFood() +","+ this.getDate();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public Pet getPet() {
        return pet;
    }

    public String getPetInfo() {
        return pet.getType() +"#"+ pet.getPetName() +"#"+ pet.getAge();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getGiveFood() {
        return giveFood;
    }

    public void setGiveFood(int giveFood) {
        this.giveFood = giveFood;
    }

    public Room(int roomNum, Pet pet, int giveFood, String date) {
        this.roomNum = roomNum;
        this.pet = pet;
        this.giveFood = giveFood;
        this.date = date;
    }

    public String printInfo(){
        return "房号: "+ this.getRoomNum() +"," + this.pet +","+ "是否喂食: "+this.getGiveFood() +","+  "入住日期: "+this.getDate();
    }
}
