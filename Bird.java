package part3;


public class Bird extends Pet{

    public Bird(String petName, int age) {
        super(petName, age);
        setType(Type.BIRD.getPetType());
    }

    @Override
    public void eat() {
        System.out.println(this.getType()+"-"+this.getPetName()+" is eating 鸟饲料.");
    }

}


