package co.jp.chapter11;

import java.util.ArrayList;

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