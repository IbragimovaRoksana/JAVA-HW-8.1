package ru.netology.domain;

public class Radio {
    private int station;
    private int volume;
    private int maxStation = 10;

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio() {
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station > (maxStation - 1) || station < 0)
            return;
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void nextStation() {
        station++;
        if (station > (maxStation - 1)) {
            station = 0;
        }
    }

    public void prevStation() {
        station--;
        if (station < 0) {
            station = (maxStation - 1);
        }
    }
}
