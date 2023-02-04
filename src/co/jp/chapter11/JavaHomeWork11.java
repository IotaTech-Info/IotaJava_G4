package co.jp.chapter11;

public class JavaHomeWork11 {

/*
 * 
 * //駅クラス
	public class Station {
	    private String name;

	    public Station(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}
	
	// 路線クラス
	public class Line {

    private ArrayList<Station> stations;

    public Line(String name) {

        this.stations = new ArrayList<>();
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public ArrayList<Station> getStations() {
        return stations;
    }
}

//電車クラス
 * public class Train {
	//定員5人
	  private static final int HUMAN_MAX= 5;
	//10両編成
	  private static final int TRAIN_CLASS = 10;
	  
	  private int numPassengers;
	  
	  public Train() {
	    this.numPassengers = 0;
	  }
	  
	  public boolean board(int num) {
	    if (numPassengers + num <= TRAIN_CLASS * HUMAN_MAX) {
	      numPassengers += num;
	      return true;
	    } else {
	      return false;
	    }
	  }
	  
	  public int getNumPassengers() {
	    return numPassengers;
	  }
}


public class JavaChapter11 {
	public static void main(String... args) {
		
		//質問１
		// 路線のインスタンス生成と駅の追加
		Line yamanoteLine = new Line("山手線");
		yamanoteLine.addStation(new Station("東京"));
		yamanoteLine.addStation(new Station("有楽町"));
		yamanoteLine.addStation(new Station("新橋"));
		yamanoteLine.addStation(new Station("浜松町"));
		yamanoteLine.addStation(new Station("田町"));
		yamanoteLine.addStation(new Station("品川"));
		yamanoteLine.addStation(new Station("大崎"));
		yamanoteLine.addStation(new Station("五反田"));
		yamanoteLine.addStation(new Station("目黒"));
		yamanoteLine.addStation(new Station("恵比寿"));
		yamanoteLine.addStation(new Station("渋谷"));
		yamanoteLine.addStation(new Station("原宿"));
		yamanoteLine.addStation(new Station("代々木"));
		yamanoteLine.addStation(new Station("新宿"));
		yamanoteLine.addStation(new Station("新大久保"));
		yamanoteLine.addStation(new Station("高田馬場"));
		yamanoteLine.addStation(new Station("目白"));
		yamanoteLine.addStation(new Station("池袋"));
		yamanoteLine.addStation(new Station("大塚"));
		yamanoteLine.addStation(new Station("巣鴨"));
		yamanoteLine.addStation(new Station("駒込"));
		yamanoteLine.addStation(new Station("田端"));
		yamanoteLine.addStation(new Station("西日暮里"));
		yamanoteLine.addStation(new Station("日暮里"));
		yamanoteLine.addStation(new Station("鶯谷"));
		yamanoteLine.addStation(new Station("上野"));
		yamanoteLine.addStation(new Station("御徒町"));
		yamanoteLine.addStation(new Station("秋葉原"));
		yamanoteLine.addStation(new Station("神田"));
		
		//質問２︓
		for (Station station : yamanoteLine.getStations()) {
			  if (station.getName().equals("新橋")) {
			    System.out.println("新橋駅は山手線内です");
			    break;
			  }
			}

		//質問3
		  Train train = new Train();
		    if (train.board(31)) {
		      System.out.println("乗車人数：" + train.getNumPassengers());
		    } else {
		      System.out.println("定員オーバー");
		    }
		  


	}

}
*/
}
