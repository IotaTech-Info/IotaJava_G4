package part3;


public class Cat extends Pet{

    public Cat(String petName, int age) {
        super(petName, age);
        setType(Type.CAT.getPetType());
    }
    
    @Override
    public void eat() {
        System.out.println(this.getType()+"-"+this.getPetName()+" is eating 猫粮.");
    }
}
