package co.jp.chapter11;

import java.util.List;

public class Line {
	private String name;
	private List<Station> station;

	public Line(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setStation(List<Station> station) {
		this.station = station;
	}

	public List<Station> getStation() {
		return station;
	}

}
