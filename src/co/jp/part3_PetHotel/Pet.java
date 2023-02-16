package co.jp.part3_PetHotel;


public class Pet {
    private String name;
    private int age;
    private String type;
    public static int COUNT = 0;

    public Pet() {
    	
    }

    public Pet(String nm, int ag, String tp) {
        this.name = nm;
        this.age = ag;
        this.type = tp;
    }

    public void SetName(String nm) {
        name = nm;
    }

    public void SetAge(int ag) {
        age = ag;
    }

    public void SetType(String tp) {
        type = tp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }


    public void eat() {
    }


}
