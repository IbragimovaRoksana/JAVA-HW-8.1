package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int volume;
    private int stationsCount = 10;

    public int getStationsCount() {
        return stationsCount;
    }

    public void setStationsCount(int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public Radio(int countStation) {
        this.stationsCount = countStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > (stationsCount - 1) || currentStation < 0)
            return;
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) volume = 100;
        if (volume < 0) volume = 0;
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
        currentStation++;
        if (currentStation > (stationsCount - 1)) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        currentStation--;
        if (currentStation < 0) {
            currentStation = (stationsCount - 1);
        }
    }
}
