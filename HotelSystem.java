package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelSystem {

    public ArrayList<Room> hotelRooms = new ArrayList<>();
    String path = "src/part3/HotelInfo.txt";
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        HotelSystem hotelSystem = new HotelSystem();
        hotelSystem.menu();
    }

    public HotelSystem() {
        hotelRooms = FileReadAndWrite.getInfo(path);
    }

    public void menu(){
        System.out.println("----- 実行開始 -----");
        while (true) {
            System.out.println("*****************************");
            System.out.println("欢迎来到宠物旅社，当前入住信息为：");
            for (Room room : hotelRooms){
                System.out.println(room.printInfo());
            }
            System.out.println("请选择你的操作：");
            System.out.println("1.入住");
            System.out.println("2.退房");
            System.out.println("3.投食");
            System.out.println("4.退出");
            System.out.println("*****************************");
            String next = sc.next();
            if (next.equals("1")) {
                System.out.println("请选择要入住的房间号：(100-200)");
                int i = sc.nextInt();
                while (livingRoom(i)){
                    System.out.println("请重新输入房间号：(100-200)");
                    i = sc.nextInt();
                }
                Pet livingPet = getLivingPet();
                Room room = new Room(i,livingPet,0);
                hotelRooms.add(room);
                System.out.println("宠物入住成功。");
                continue;
            }
            if (next.equals("2")) {
                System.out.println("请选择要退的房间号：");
                int i = sc.nextInt();
                while (!exitRoom(i)){
                    System.out.println("请重新输入房间号：(100-200)");
                    i = sc.nextInt();
                }
                System.out.println("退房成功。");
                continue;
            }
            if (next.equals("3")) {
                System.out.println("请选择要喂食的宠物的房间号：");
                int i = sc.nextInt();
                Room room = foodRoom(i);
                while (room == null){
                    System.out.println("请重新输入房间号：(100-200)");
                    i = sc.nextInt();
                    room = foodRoom(i);
                }
                if (room.getGiveFood() == 1){
                    System.out.println("宠物已经被喂食过。");
                    continue;
                } else {
                    room.setGiveFood(1);
                    Pet pet = room.getPet();
                    pet.eat();
                    System.out.println("喂食完成。");
                    continue;
                }
            }
            if (next.equals("4")) {
                FileReadAndWrite.saveInfo(path,hotelRooms);
                System.out.println("退出系统。");
                break;
            }
            System.out.println("请重新选择");
        }
    }

    public boolean livingRoom(int num){
        if (num < 100 || num > 200) {
            System.out.println("房间号输入错误");
            return true;
        }
        for (Room room : hotelRooms){
            if (room.getRoomNum() == num){
                System.out.println("房间已被居住");
                return true;
            }
        }
        return false;
    }

    public boolean exitRoom(int num){
        for (int i = 0; i < hotelRooms.size(); i++) {
            if (hotelRooms.get(i).getRoomNum() == num){
                hotelRooms.remove(i);
                return true;
            }
        }
        System.out.println("房间号输入错误");
        return false;
    }

    public Room foodRoom(int num){
        for (int i = 0; i < hotelRooms.size(); i++) {
            if (hotelRooms.get(i).getRoomNum() == num){
                return hotelRooms.get(i);
            }
        }
        System.out.println("房间号输入错误");
        return null;
    }

    public Pet getLivingPet(){
        System.out.println("请输入宠物类型：(cat|dog|bird)");
        String type = sc.next();
        while (!type.equals("cat") && !type.equals("dog") && !type.equals("bird")){
            System.out.println("请重新输入宠物种类：(cat|dog|bird)");
            type = sc.next();
        }
        System.out.println("请输入宠物名字：");
        String name = sc.next();
        System.out.println("请输入宠物年龄：");
        int age = sc.nextInt();
        Pet pet = null;
        if (type.equals("cat")){
            pet = new Cat(name,age);
        }
        else if (type.equals("dog")){
            pet = new Dog(name,age);
        }
        else if (type.equals("bird")){
            pet = new Bird(name,age);
        }
        return pet;
    }

    public static int getPetRoom(Pet pet,Room[] hotel){
        Room room = null;
        for (int i = 0; i < hotel.length; i++) {
            room = hotel[i];
            if (room.getPet().getPetName() == pet.getPetName()){
                return i;
            }
        }
        return -1;
    }


    public static int getRoomIdx(int num,Room[] hotel){
        Room room = null;
        for (int i = 0; i < hotel.length; i++) {
            room = hotel[i];
            if (room.getRoomNum() == num){
                return i;
            }
        }
        return -1;
    }

}
