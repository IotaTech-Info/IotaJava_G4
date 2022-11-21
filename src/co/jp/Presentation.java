package co.jp.part2;


import java.util.Scanner;

public class Presentation {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("----- 実行開始 -----");

        Room[] hotel = new Room[10];
        Pet pet1 = new Pet("猫", 2, "jack");
        hotel[0] = new Room(100, pet1, 1);
        for (int i = 1; i < hotel.length; i++) {
            hotel[i] = new Room(100 + i, null, 0);
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*****************************");
            System.out.println("欢迎来到宠物旅社，当前入住信息为：");
            for (int i = 0; i < hotel.length; i++) {
                System.out.println(hotel[i]);
            }
            System.out.println("请选择你的操作：");
            System.out.println("1.入住");
            System.out.println("2.退房");
            System.out.println("3.投食");
            System.out.println("4.退出");
            System.out.println("*****************************");
            String next = sc.next();
            if (next.equals("1")) {
                System.out.println("请选择要入住的房间号：");
                int i = sc.nextInt();
                Room room = getRoom(i, hotel);
                if (room == null) {
                    System.out.println("没有此房间。");
                    continue;
                } else {
                    if (room.getPet() == null) {
                        Pet pet = getPet();
                        int roomIdx = getRoomIdx(i, hotel);
                        hotel[roomIdx] = new Room(i,pet,0);
                        System.out.println("入住完成。");
                        continue;
                    } else {
                        System.out.println("该房间已被入住，请重新选择。");
                        continue;
                    }
                }
            }

            if (next.equals("2")) {
                System.out.println("请选择要退的房间号：");
                int i = sc.nextInt();
                Room room = getRoom(i, hotel);
                if (room == null) {
                    System.out.println("没有此房间。");
                    continue;
                } 
            else {
                    int roomIdx = getRoomIdx(i, hotel);
                    hotel[roomIdx] = new Room(i,null,0);
                    System.out.println("退房成功。");
                    continue;
                }
            }

           //宠物喂食
            if (next.equals("3")) {
                System.out.println("请选择要喂食的宠物的房间号：");
                int i = sc.nextInt();
                Room room = getRoom(i, hotel);
                if (room == null) {
                    System.out.println("没有此房间。");
                    continue;
                } else {
                    if (room.getGiveFood() == 1){
                        System.out.println("宠物已经被喂食过。");
                        continue;
                    }else {
                        int roomIdx = getRoomIdx(i, hotel);
                        Pet pet = room.getPet();
                        hotel[roomIdx] = new Room(i,pet,1);
                        System.out.println("喂食完成。");
                        continue;
                    }
                }
            }

            if (next.equals("4")) {
                System.out.println("退出系统。");
                break;
            }
        }

    }

    public static Room getRoom(int num,Room[] hotel){
        Room room = null;
        for (int i = 0; i < hotel.length; i++) {
            room = hotel[i];
            if (room.getRoomNum() == num){
                return room;
            }
        }
        return null;
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

    public static Pet getPet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入宠物类型（猫|鸟|狗）：");
        String next = sc.next();
        while (!next.equals("猫") && !next.equals("鸟")&& !next.equals("狗")){
            System.out.println("宠物类型不正确，请重新输入宠物种类");
            next = sc.next();
        }
        System.out.println("请输入宠物年龄：");
        int i = sc.nextInt();
        System.out.println("请输入宠物名字：");
        String next1 = sc.next();
        Pet pet = new Pet(next,i,next1);
        return pet;
    }

}

