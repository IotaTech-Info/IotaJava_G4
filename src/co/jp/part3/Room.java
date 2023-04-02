package co.jp.part2;

public class Room {



    private int price;
    public Pet[] pets = new Pet[5];
    public int n_pets;
    
    public Room() {
		super();
		n_pets=0;
		price=0;
	}


// new Dog(name, age,Type.Dog,80,100);
	public void view() {

    	if(this.n_pets>0) {
    		for(int i=0;i<n_pets;i++) {
    			if(this.pets[i]!=null) {
	    			System.out.println("--------"+this.pets[i].index+"--------");
	    			System.out.println(this.pets[i].type.getType()+"の"+this.pets[i].name+"ちゃんの状態:");
	    	    	FeedStatusDisplay(this.pets[i].feedingStatus);
	    	    	MoodStatusDisplay(this.pets[i].moodStatus);
	    	    	System.out.println(this.pets[i].date);
	    			System.out.println("-----------------");
    			}
    		}
    	}else {
    		System.out.println("--------------------");
    		System.out.println("空き室");
    	}
    	
    }
    public void checkin(String name, int age, String type,int status,int feed,String date) {

		switch (type) {
		case "DOG":
			this.pets[this.n_pets]=new Dog(name, age,Type.Dog,80,100, date, this.n_pets+1);
			// TODO DOG
			break;
		case "CAT":
			this.pets[this.n_pets]=new Cat(name, age,Type.Cat,80,100,date,this.n_pets+1);
			// TODO CAT
			break;
		case "BIRD":
			this.pets[this.n_pets]=new Bird(name, age,Type.Bird,80,100,date,this.n_pets+1);
			break;
		default:
			System.out.println("TYPE範囲外のため、異常終了");
		}
    	this.n_pets++;
    }
    
    
    private void FeedStatusDisplay(int Feeding) {
		if(Feeding>=100) {
			System.out.println("腹: 飽きている");
		}else if(Feeding>80) {
			System.out.println("腹: 腹八分目");
		}else if(Feeding>50) {
			System.out.println("腹: ほとんど空腹");
		}else{
			System.out.println("腹: お腹空いている");
		}
    }
    private void MoodStatusDisplay(int moodStatus) {
	if(moodStatus>=100) {
		System.out.println("心情: 喜び(Good)");
		
	}else if(moodStatus>80) {
		System.out.println("心情: 外に見ている(Normal)");
	}else if(moodStatus>50) {
		System.out.println("心情: いらいらしている(Bad)");
	}else{
		System.out.println("心情: 何もしてない(Default)");
	}
    }
}

