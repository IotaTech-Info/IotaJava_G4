package co.jp.chapter11;

import java.util.List;

public class Line {
	String name;
	
	List<Station> station;

	public Line(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Station> getStation() {
		return station;
	}

	public void setStation(List<Station> station) {
		this.station = station;
	}
	
	
}
