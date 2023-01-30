package part3;

public class Dog extends Pet{

    public Dog(String petName, int age) {
        super(petName, age);
        setType(Type.DOG.getPetType());
    }
    
    @Override
    public void eat() {
        System.out.println(this.getType()+"-"+this.getPetName()+" is eating 狗粮");
    }

}
