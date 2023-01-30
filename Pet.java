package part3;

public abstract class Pet implements Eating{

    private String type;
    private String petName;
    private int age;

    public Pet() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet(String petName, int age) {
        this.petName = petName;
        this.age = age;
    }


    @Override
    public String toString() {
        return "类型: " + this.getType()+"," +
                "姓名: "+ this.getPetName() +"," +
                "年龄: " + this.getAge();
    }

    public abstract void eat();
}
