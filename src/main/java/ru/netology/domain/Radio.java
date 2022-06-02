package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {
    private int station;
    private int volume;
    private int maxStation = 10;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setStation(int station) {
        if (station > (maxStation - 1) || station < 0)
            return;
        this.station = station;
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
