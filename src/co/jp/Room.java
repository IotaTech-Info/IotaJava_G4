package co.jp.part2;

public class Room {

    private int roomNum;
    private Pet pet;
    private int giveFood;

    public Room(int roomNum, Pet pet, int giveFood) {
        this.roomNum = roomNum;
        this.pet = pet;
        this.giveFood = giveFood;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNum=" + roomNum +
                ", pet=" + pet +
                ", giveFood=" + giveFood +
                '}';
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

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getGiveFood() {
        return giveFood;
    }

    public void setGiveFood(int giveFood) {
        this.giveFood = giveFood;
    }
}
