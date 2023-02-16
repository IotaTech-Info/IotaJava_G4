package co.jp.part3_PetHotel;

public class Room {
    public boolean IsRoomEmpty;
    public Pet pet;
    public int roomNumber;

    public Room(int num, Pet pt) {
        IsRoomEmpty = true;
        this.pet = new Pet(null, num, null);
        roomNumber = num;
    }
    
    

    public Room CheckIn(int number, String nm, int ag, String petType) {
        IsRoomEmpty = false;
        roomNumber = number;
        pet.SetName(nm);
        pet.SetAge(ag);
        pet.SetType(petType);
//        System.out.println("The check in room number is " + roomNumber);
//        System.out.println("The Pet Name is " + pet.getName() + "; Pet Age is " + pet.getAge() + "; Pet Type is "
//                + pet.getType().toString());
//        try {
//        	Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/wangsy/Documents/eclipse/IotaJava_G4/test/dummy_file.txt"), "UTF-8")); 
//        	System.out.println("The check in room number is " + roomNumber);
//        	System.out.println("The Pet Name is " + pet.getName() + "; Pet Age is " + pet.getAge() + "; Pet Type is " + pet.getType().toString());
//        	out.write(roomNumber + "," + pet.getName() +  "," + pet.getAge() + pet.getType().toString()); 
//        	out.close();
//        }
//        catch(IOException e) {
//        	e.printStackTrace();
//        } 
        return this;

    }
    

    public void CheckOut(int number) {
        // print all the info
//        System.out.println("The check out room number is " + roomNumber);
//        System.out.println("The Pet Name is " + pet.getName() + "; Pet Age is " + pet.getAge() + "; Pet Type is "
//                + pet.getType().toString());
        // set room to available
        IsRoomEmpty = true;
        // clear up pet info
        pet = null;
    }
}
